package typings.pouchReduxMiddleware.mod

import typings.pouchReduxMiddleware.AnonBatchInsert
import typings.pouchdbCore.PouchDB.Database
import typings.redux.mod.Dispatch
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path[T] extends js.Object {
  var actions: AnonBatchInsert[T]
  var db: Database[T]
  var docs: js.UndefOr[js.Any] = js.undefined
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ Error, Unit], 
      Unit
    ]
  ] = js.undefined
  var initialBatchDispatched: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.undefined
  var path: String
  var propagateBatchInsert: js.UndefOr[js.Function2[/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateDelete: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateInsert: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateUpdate: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.undefined
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.undefined
}

object Path {
  @scala.inline
  def apply[T](
    actions: AnonBatchInsert[T],
    db: Database[T],
    path: String,
    docs: js.Any = null,
    handleResponse: (/* err */ Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ Error, Unit]) => Unit = null,
    initialBatchDispatched: /* err */ js.UndefOr[Error] => Unit = null,
    propagateBatchInsert: (/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_]) => Unit = null,
    propagateDelete: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit = null,
    propagateInsert: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit = null,
    propagateUpdate: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit = null,
    queue: /* repeated */ js.Any => _ = null,
    scheduleInset: /* doc */ Document[T] => Unit = null,
    scheduleRemove: /* doc */ Document[T] => Unit = null
  ): Path[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (handleResponse != null) __obj.updateDynamic("handleResponse")(js.Any.fromFunction3(handleResponse))
    if (initialBatchDispatched != null) __obj.updateDynamic("initialBatchDispatched")(js.Any.fromFunction1(initialBatchDispatched))
    if (propagateBatchInsert != null) __obj.updateDynamic("propagateBatchInsert")(js.Any.fromFunction2(propagateBatchInsert))
    if (propagateDelete != null) __obj.updateDynamic("propagateDelete")(js.Any.fromFunction2(propagateDelete))
    if (propagateInsert != null) __obj.updateDynamic("propagateInsert")(js.Any.fromFunction2(propagateInsert))
    if (propagateUpdate != null) __obj.updateDynamic("propagateUpdate")(js.Any.fromFunction2(propagateUpdate))
    if (queue != null) __obj.updateDynamic("queue")(js.Any.fromFunction1(queue))
    if (scheduleInset != null) __obj.updateDynamic("scheduleInset")(js.Any.fromFunction1(scheduleInset))
    if (scheduleRemove != null) __obj.updateDynamic("scheduleRemove")(js.Any.fromFunction1(scheduleRemove))
    __obj.asInstanceOf[Path[T]]
  }
}

