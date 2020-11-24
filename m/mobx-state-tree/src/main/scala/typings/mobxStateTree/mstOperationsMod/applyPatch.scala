package typings.mobxStateTree.mstOperationsMod

import typings.mobxStateTree.jsonPatchMod.IJsonPatch
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "applyPatch")
@js.native
object applyPatch extends js.Object {
  
  def apply(target: IAnyStateTreeNode, patch: js.Array[IJsonPatch]): Unit = js.native
  def apply(target: IAnyStateTreeNode, patch: IJsonPatch): Unit = js.native
}
