package typings.pouchDashReduxDashMiddleware.pouchDashReduxDashMiddlewareMod

import typings.pouchDashReduxDashMiddleware.Anon_Doc
import typings.pouchdbDashCore.PouchDBNs.Database
import typings.redux.reduxMod.Dispatch
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var actions: Anon_Doc
  var db: Database[_]
  var docs: js.UndefOr[js.Any] = js.undefined
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ Error, Unit], 
      Unit
    ]
  ] = js.undefined
  var path: String
  var propagateDelete: js.UndefOr[js.Function2[/* doc */ Document, /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateInsert: js.UndefOr[js.Function2[/* doc */ Document, /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateUpdate: js.UndefOr[js.Function2[/* doc */ Document, /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
}

object Path {
  @scala.inline
  def apply(
    actions: Anon_Doc,
    db: Database[_],
    path: String,
    docs: js.Any = null,
    handleResponse: (/* err */ Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ Error, Unit]) => Unit = null,
    propagateDelete: (/* doc */ Document, /* dispatch */ Dispatch[_]) => Unit = null,
    propagateInsert: (/* doc */ Document, /* dispatch */ Dispatch[_]) => Unit = null,
    propagateUpdate: (/* doc */ Document, /* dispatch */ Dispatch[_]) => Unit = null,
    queue: /* repeated */ js.Any => _ = null,
    scheduleInset: /* doc */ Document => Unit = null,
    scheduleRemove: /* doc */ Document => Unit = null
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

