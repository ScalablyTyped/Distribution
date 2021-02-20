package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyComplexType
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.STNValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilsMod {
  
  @JSImport("mobx-state-tree/dist/core/node/node-utils", "isStateTreeNode")
  @js.native
  def isStateTreeNode[IT /* <: IAnyComplexType */](value: js.Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean = js.native
  
  type IAnyStateTreeNode = STNValue[js.Any, IAnyType]
  
  @js.native
  trait IStateTreeNode[IT /* <: IAnyType */] extends StObject
  
  type TypeOfValue[T /* <: IAnyStateTreeNode */] = js.Any
}
