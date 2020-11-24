package typings.mobxStateTree.mstOperationsMod

import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.jsonPatchMod.IJsonPatch
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "recordPatches")
@js.native
object recordPatches extends js.Object {
  
  def apply(subject: IAnyStateTreeNode): IPatchRecorder = js.native
  def apply(
    subject: IAnyStateTreeNode,
    filter: js.Function3[
      /* patch */ IJsonPatch, 
      /* inversePatch */ IJsonPatch, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IPatchRecorder = js.native
}
