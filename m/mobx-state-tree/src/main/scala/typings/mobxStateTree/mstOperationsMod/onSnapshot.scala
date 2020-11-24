package typings.mobxStateTree.mstOperationsMod

import typings.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.typeMod.IType
import typings.mobxStateTree.utilsMod.IDisposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "onSnapshot")
@js.native
object onSnapshot extends js.Object {
  
  def apply[S](target: IStateTreeNode[IType[_, S, _]], callback: js.Function1[/* snapshot */ S, Unit]): IDisposer = js.native
}
