package typings.mobxStateTree.mstOperationsMod

import typings.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "applySnapshot")
@js.native
object applySnapshot extends js.Object {
  
  def apply[C](target: IStateTreeNode[IType[C, _, _]], snapshot: C): Unit = js.native
}
