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
      /* err */ stdLib.Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ stdLib.Error, scala.Unit], 
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
    handleResponse: (/* err */ stdLib.Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ stdLib.Error, scala.Unit]) => scala.Unit = null,
    propagateDelete: (/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_]) => scala.Unit = null,
    propagateInsert: (/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_]) => scala.Unit = null,
    propagateUpdate: (/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_]) => scala.Unit = null,
    queue: /* repeated */ js.Any => _ = null,
    scheduleInset: /* doc */ Document => scala.Unit = null,
    scheduleRemove: /* doc */ Document => scala.Unit = null
  ): Path = {
    val __obj = js.Dynamic.literal(actions = actions, db = db, path = path)
    if (docs != null) __obj.updateDynamic("docs")(docs)
    if (handleResponse != null) __obj.updateDynamic("handleResponse")(js.Any.fromFunction3(handleResponse))
    if (propagateDelete != null) __obj.updateDynamic("propagateDelete")(js.Any.fromFunction2(propagateDelete))
    if (propagateInsert != null) __obj.updateDynamic("propagateInsert")(js.Any.fromFunction2(propagateInsert))
    if (propagateUpdate != null) __obj.updateDynamic("propagateUpdate")(js.Any.fromFunction2(propagateUpdate))
    if (queue != null) __obj.updateDynamic("queue")(js.Any.fromFunction1(queue))
    if (scheduleInset != null) __obj.updateDynamic("scheduleInset")(js.Any.fromFunction1(scheduleInset))
    if (scheduleRemove != null) __obj.updateDynamic("scheduleRemove")(js.Any.fromFunction1(scheduleRemove))
    __obj.asInstanceOf[Path]
  }
}

