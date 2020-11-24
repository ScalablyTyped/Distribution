package typings.mobxStateTree.onActionMod

import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/middlewares/on-action", "recordActions")
@js.native
object recordActions extends js.Object {
  
  def apply(subject: IAnyStateTreeNode): IActionRecorder = js.native
  def apply(
    subject: IAnyStateTreeNode,
    filter: js.Function2[
      /* action */ ISerializedActionCall, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IActionRecorder = js.native
}
