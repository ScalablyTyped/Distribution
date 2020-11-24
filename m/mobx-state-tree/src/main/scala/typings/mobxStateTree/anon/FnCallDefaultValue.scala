package typings.mobxStateTree.anon

import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallDefaultValue extends js.Object {
  
  def apply[T](): IType[T, T, T] = js.native
  def apply[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = js.native
  def apply[C](subType: IType[C, _, _]): IType[C, C, C] = js.native
}
