package typings.mobxStateTree.actionContextMod

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextChildOf")
@js.native
object isActionContextChildOf extends js.Object {
  
  def apply(actionContext: IActionContext, parent: Double): Boolean = js.native
  def apply(actionContext: IActionContext, parent: IActionContext): Boolean = js.native
  def apply(actionContext: IActionContext, parent: IMiddlewareEvent): Boolean = js.native
}
