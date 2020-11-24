package typings.mobxStateTree.anon

import typings.mobxStateTree.customMod.CustomTypeOptions
import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOptions extends js.Object {
  
  def apply[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = js.native
}
