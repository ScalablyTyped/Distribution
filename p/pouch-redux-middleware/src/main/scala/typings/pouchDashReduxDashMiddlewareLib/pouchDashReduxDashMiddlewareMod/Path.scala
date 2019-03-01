package typings
package pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var actions: pouchDashReduxDashMiddlewareLib.Anon_Doc
  var db: pouchdbDashCoreLib.PouchDBNs.Database[_]
  var docs: js.UndefOr[js.Any] = js.undefined
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ nodeLib.Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var path: java.lang.String
  var propagateDelete: js.UndefOr[
    js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var propagateInsert: js.UndefOr[
    js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var propagateUpdate: js.UndefOr[
    js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document, scala.Unit]] = js.undefined
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document, scala.Unit]] = js.undefined
}

object Path {
  @scala.inline
  def apply(
    actions: pouchDashReduxDashMiddlewareLib.Anon_Doc,
    db: pouchdbDashCoreLib.PouchDBNs.Database[_],
    path: java.lang.String,
    docs: js.Any = null,
    handleResponse: js.Function3[
      /* err */ nodeLib.Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ] = null,
    propagateDelete: js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = null,
    propagateInsert: js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = null,
    propagateUpdate: js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = null,
    queue: js.Function1[/* repeated */ js.Any, _] = null,
    scheduleInset: js.Function1[/* doc */ Document, scala.Unit] = null,
    scheduleRemove: js.Function1[/* doc */ Document, scala.Unit] = null
  ): Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("path")(path)
    if (docs != null) __obj.updateDynamic("docs")(docs)
    if (handleResponse != null) __obj.updateDynamic("handleResponse")(handleResponse)
    if (propagateDelete != null) __obj.updateDynamic("propagateDelete")(propagateDelete)
    if (propagateInsert != null) __obj.updateDynamic("propagateInsert")(propagateInsert)
    if (propagateUpdate != null) __obj.updateDynamic("propagateUpdate")(propagateUpdate)
    if (queue != null) __obj.updateDynamic("queue")(queue)
    if (scheduleInset != null) __obj.updateDynamic("scheduleInset")(scheduleInset)
    if (scheduleRemove != null) __obj.updateDynamic("scheduleRemove")(scheduleRemove)
    __obj.asInstanceOf[Path]
  }
}

