package typings
package pouchDashReduxDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc extends js.Object {
  def insert(doc: pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document): reduxLib.reduxMod.Action[_]
  def remove(doc: pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document): reduxLib.reduxMod.Action[_]
  def update(doc: pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document): reduxLib.reduxMod.Action[_]
}

object Anon_Doc {
  @scala.inline
  def apply(
    insert: pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document => reduxLib.reduxMod.Action[_],
    remove: pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document => reduxLib.reduxMod.Action[_],
    update: pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document => reduxLib.reduxMod.Action[_]
  ): Anon_Doc = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_Doc]
  }
}

