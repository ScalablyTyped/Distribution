package typings.mobxStateTree.actionContextMod

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextThisOrChildOf")
@js.native
object isActionContextThisOrChildOf extends js.Object {
  
  def apply(actionContext: IActionContext, parentOrThis: Double): Boolean = js.native
  def apply(actionContext: IActionContext, parentOrThis: IActionContext): Boolean = js.native
  def apply(actionContext: IActionContext, parentOrThis: IMiddlewareEvent): Boolean = js.native
}
