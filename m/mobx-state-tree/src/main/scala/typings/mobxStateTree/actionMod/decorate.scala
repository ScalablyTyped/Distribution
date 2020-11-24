package typings.mobxStateTree.actionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/action", "decorate")
@js.native
object decorate extends js.Object {
  
  def apply[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T): T = js.native
  def apply[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T, includeHooks: Boolean): T = js.native
}
