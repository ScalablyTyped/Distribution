package typings.pouchReduxMiddleware.anon

import typings.pouchReduxMiddleware.mod.Document
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchInsert[T] extends js.Object {
  def batchInsert(docs: js.Array[Document[T]]): Action[_] = js.native
  def insert(doc: Document[T]): Action[_] = js.native
  def remove(doc: Document[T]): Action[_] = js.native
  def update(doc: Document[T]): Action[_] = js.native
}

object BatchInsert {
  @scala.inline
  def apply[T](
    batchInsert: js.Array[Document[T]] => Action[_],
    insert: Document[T] => Action[_],
    remove: Document[T] => Action[_],
    update: Document[T] => Action[_]
  ): BatchInsert[T] = {
    val __obj = js.Dynamic.literal(batchInsert = js.Any.fromFunction1(batchInsert), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BatchInsert[T]]
  }
  @scala.inline
  implicit class BatchInsertOps[Self <: BatchInsert[_], T] (val x: Self with BatchInsert[T]) extends AnyVal {
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
    def setBatchInsert(value: js.Array[Document[T]] => Action[_]): Self = this.set("batchInsert", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Document[T] => Action[_]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Document[T] => Action[_]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Document[T] => Action[_]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

