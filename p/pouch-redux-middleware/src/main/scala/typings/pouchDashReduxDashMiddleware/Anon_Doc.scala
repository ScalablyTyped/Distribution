package typings.pouchDashReduxDashMiddleware

import typings.pouchDashReduxDashMiddleware.pouchDashReduxDashMiddlewareMod.Document
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc extends js.Object {
  def insert(doc: Document): Action[_]
  def remove(doc: Document): Action[_]
  def update(doc: Document): Action[_]
}

object Anon_Doc {
  @scala.inline
  def apply(insert: Document => Action[_], remove: Document => Action[_], update: Document => Action[_]): Anon_Doc = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_Doc]
  }
}

