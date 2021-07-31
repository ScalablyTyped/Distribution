package typings.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postmanCollection.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "VariableList")
@js.native
class VariableList protected () extends PropertyList[Variable] {
  def this(parent: Property[PropertyDefinition], populate: js.Array[Variable]) = this()
  
  def replace(str: String): String = js.native
  def replace(str: String, overrides: VariableList): String = js.native
  
  def substitute[T](obj: T): T = js.native
  def substitute[T](obj: T, overrides: Unit, mutate: Boolean): T = js.native
  def substitute[T](obj: T, overrides: VariableList): T = js.native
  def substitute[T](obj: T, overrides: VariableList, mutate: Boolean): T = js.native
  
  def syncFromObject(obj: StringDictionary[VariableDefinition]): js.UndefOr[Created] = js.native
  def syncFromObject(obj: StringDictionary[VariableDefinition], track: Boolean): js.UndefOr[Created] = js.native
  def syncFromObject(obj: StringDictionary[VariableDefinition], track: Boolean, prune: Boolean): js.UndefOr[Created] = js.native
  def syncFromObject(obj: StringDictionary[VariableDefinition], track: Unit, prune: Boolean): js.UndefOr[Created] = js.native
  
  def syncToObject(): StringDictionary[VariableDefinition] = js.native
  def syncToObject(obj: StringDictionary[VariableDefinition]): StringDictionary[VariableDefinition] = js.native
}
/* static members */
object VariableList {
  
  @JSImport("postman-collection", "VariableList")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isVariableList(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
