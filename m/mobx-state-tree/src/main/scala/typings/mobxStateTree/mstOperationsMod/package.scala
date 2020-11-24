package typings.mobxStateTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mstOperationsMod {
  
  type TypeOrStateTreeNodeToStateTreeNode[T /* <: typings.mobxStateTree.typeMod.IAnyType | typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode */] = T | (js.Any with typings.mobxStateTree.nodeUtilsMod.IStateTreeNode[T])
}
