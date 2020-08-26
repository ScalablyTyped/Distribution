package typings.pouchReduxMiddleware.mod

import typings.pouchReduxMiddleware.anon.BatchInsert
import typings.pouchdbCore.PouchDB.Database
import typings.redux.mod.Dispatch
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[T] extends js.Object {
  var actions: BatchInsert[T] = js.native
  var db: Database[T] = js.native
  var docs: js.UndefOr[js.Any] = js.native
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ Error, Unit], 
      Unit
    ]
  ] = js.native
  var initialBatchDispatched: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.native
  var path: String = js.native
  var propagateBatchInsert: js.UndefOr[js.Function2[/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_], Unit]] = js.native
  var propagateDelete: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
  var propagateInsert: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
  var propagateUpdate: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.native
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.native
}

object Path {
  @scala.inline
  def apply[T](actions: BatchInsert[T], db: Database[T], path: String): Path[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
  @scala.inline
  implicit class PathOps[Self <: Path[_], T] (val x: Self with Path[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActions(value: BatchInsert[T]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDb(value: Database[T]): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocs(value: js.Any): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
    @scala.inline
    def setHandleResponse(
      value: (/* err */ Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ Error, Unit]) => Unit
    ): Self = this.set("handleResponse", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHandleResponse: Self = this.set("handleResponse", js.undefined)
    @scala.inline
    def setInitialBatchDispatched(value: /* err */ js.UndefOr[Error] => Unit): Self = this.set("initialBatchDispatched", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialBatchDispatched: Self = this.set("initialBatchDispatched", js.undefined)
    @scala.inline
    def setPropagateBatchInsert(value: (/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_]) => Unit): Self = this.set("propagateBatchInsert", js.Any.fromFunction2(value))
    @scala.inline
    def deletePropagateBatchInsert: Self = this.set("propagateBatchInsert", js.undefined)
    @scala.inline
    def setPropagateDelete(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self = this.set("propagateDelete", js.Any.fromFunction2(value))
    @scala.inline
    def deletePropagateDelete: Self = this.set("propagateDelete", js.undefined)
    @scala.inline
    def setPropagateInsert(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self = this.set("propagateInsert", js.Any.fromFunction2(value))
    @scala.inline
    def deletePropagateInsert: Self = this.set("propagateInsert", js.undefined)
    @scala.inline
    def setPropagateUpdate(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self = this.set("propagateUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deletePropagateUpdate: Self = this.set("propagateUpdate", js.undefined)
    @scala.inline
    def setQueue(value: /* repeated */ js.Any => _): Self = this.set("queue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    @scala.inline
    def setScheduleInset(value: /* doc */ Document[T] => Unit): Self = this.set("scheduleInset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScheduleInset: Self = this.set("scheduleInset", js.undefined)
    @scala.inline
    def setScheduleRemove(value: /* doc */ Document[T] => Unit): Self = this.set("scheduleRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScheduleRemove: Self = this.set("scheduleRemove", js.undefined)
  }
  
}

