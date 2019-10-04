package typings.pouchDashReduxDashMiddleware

import typings.pouchDashReduxDashMiddleware.pouchDashReduxDashMiddlewareMod.Document
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchInsert[T] extends js.Object {
  def batchInsert(docs: js.Array[Document[T]]): Action[_]
  def insert(doc: Document[T]): Action[_]
  def remove(doc: Document[T]): Action[_]
  def update(doc: Document[T]): Action[_]
}

object Anon_BatchInsert {
  @scala.inline
  def apply[T](
    batchInsert: js.Array[Document[T]] => Action[_],
    insert: Document[T] => Action[_],
    remove: Document[T] => Action[_],
    update: Document[T] => Action[_]
  ): Anon_BatchInsert[T] = {
    val __obj = js.Dynamic.literal(batchInsert = js.Any.fromFunction1(batchInsert), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_BatchInsert[T]]
  }
}

