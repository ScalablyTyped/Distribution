package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/enumeration", JSImport.Namespace)
@js.native
object enumerationMod extends js.Object {
  
  def enumeration[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
  def enumeration[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
  
  type UnionStringArray[T /* <: js.Array[String] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
}
