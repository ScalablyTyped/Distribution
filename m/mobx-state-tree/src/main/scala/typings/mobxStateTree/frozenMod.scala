package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/frozen", JSImport.Namespace)
@js.native
object frozenMod extends js.Object {
  
  def frozen[T](): IType[T, T, T] = js.native
  def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = js.native
  def frozen[C](subType: IType[C, _, _]): IType[C, C, C] = js.native
  
  def isFrozenType[IT /* <: IType[T | _, T, T] */, T](`type`: IT): /* is IT */ Boolean = js.native
}
