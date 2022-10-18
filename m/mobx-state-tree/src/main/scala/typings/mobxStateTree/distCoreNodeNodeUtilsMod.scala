package typings.mobxStateTree

import typings.mobxStateTree.distCoreTypeTypeMod.IAnyComplexType
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typings.mobxStateTree.distCoreTypeTypeMod.STNValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreNodeNodeUtilsMod {
  
  @JSImport("mobx-state-tree/dist/core/node/node-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isStateTreeNode[IT /* <: IAnyComplexType */](value: Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateTreeNode")(value.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean]
  
  type IAnyStateTreeNode = STNValue[Any, IAnyType]
  
  @js.native
  trait IStateTreeNode[IT /* <: IAnyType */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IStateTreeNode<infer IT> ? IT : never
    }}}
    */
  @js.native
  trait TypeOfValue[T /* <: IAnyStateTreeNode */] extends StObject
}
