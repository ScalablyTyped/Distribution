package typings.mobxStateTree.createActionTrackingMiddlewareMod

import typings.mobxStateTree.actionMod.IMiddlewareHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/middlewares/create-action-tracking-middleware", "createActionTrackingMiddleware")
@js.native
object createActionTrackingMiddleware extends js.Object {
  
  def apply[T](hooks: IActionTrackingMiddlewareHooks[T]): IMiddlewareHandler = js.native
}
