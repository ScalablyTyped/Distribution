package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyComplexType
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.STNValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilsMod {
  
  @JSImport("mobx-state-tree/dist/core/node/node-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isStateTreeNode[IT /* <: IAnyComplexType */](value: js.Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateTreeNode")(value.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean]
  
  type IAnyStateTreeNode = STNValue[js.Any, IAnyType]
  
  @js.native
  trait IStateTreeNode[IT /* <: IAnyType */] extends StObject
  
  type TypeOfValue[T /* <: IAnyStateTreeNode */] = js.Any
}
