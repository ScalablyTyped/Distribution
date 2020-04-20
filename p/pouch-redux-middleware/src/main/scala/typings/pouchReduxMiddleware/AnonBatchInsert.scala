package typings.pouchReduxMiddleware

import typings.pouchReduxMiddleware.mod.Document
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchInsert[T] extends js.Object {
  def batchInsert(docs: js.Array[Document[T]]): Action[_]
  def insert(doc: Document[T]): Action[_]
  def remove(doc: Document[T]): Action[_]
  def update(doc: Document[T]): Action[_]
}

object AnonBatchInsert {
  @scala.inline
  def apply[T](
    batchInsert: js.Array[Document[T]] => Action[_],
    insert: Document[T] => Action[_],
    remove: Document[T] => Action[_],
    update: Document[T] => Action[_]
  ): AnonBatchInsert[T] = {
    val __obj = js.Dynamic.literal(batchInsert = js.Any.fromFunction1(batchInsert), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnonBatchInsert[T]]
  }
}

