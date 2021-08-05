package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frozenMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/frozen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frozen[T](): IType[T, T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")().asInstanceOf[IType[T, T, T]]
  inline def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[IType[js.UndefOr[T | Null], T, T]]
  inline def frozen[C](subType: IType[C, js.Any, js.Any]): IType[C, C, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")(subType.asInstanceOf[js.Any]).asInstanceOf[IType[C, C, C]]
  
  inline def isFrozenType[IT /* <: IType[T | js.Any, T, T] */, T](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozenType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
}
