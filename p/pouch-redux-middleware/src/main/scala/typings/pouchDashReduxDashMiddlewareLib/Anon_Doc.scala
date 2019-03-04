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
    insert: js.Function1[
      pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document, 
      reduxLib.reduxMod.Action[_]
    ],
    remove: js.Function1[
      pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document, 
      reduxLib.reduxMod.Action[_]
    ],
    update: js.Function1[
      pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod.Document, 
      reduxLib.reduxMod.Action[_]
    ]
  ): Anon_Doc = {
    val __obj = js.Dynamic.literal(insert = insert, remove = remove, update = update)
  
    __obj.asInstanceOf[Anon_Doc]
  }
}

