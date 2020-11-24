package typings.mobxStateTree.anon

import typings.mobxStateTree.enumerationMod.UnionStringArray
import typings.mobxStateTree.typeMod.ISimpleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
  def apply[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
}
