package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frozenMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/frozen", "frozen")
  @js.native
  def frozen[T](): IType[T, T, T] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/frozen", "frozen")
  @js.native
  def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/frozen", "frozen")
  @js.native
  def frozen[C](subType: IType[C, _, _]): IType[C, C, C] = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/frozen", "isFrozenType")
  @js.native
  def isFrozenType[IT /* <: IType[T | _, T, T] */, T](`type`: IT): /* is IT */ Boolean = js.native
}
