package typings.postmanDashCollection.postmanDashCollectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.postmanDashCollection.Anon_Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "VariableList")
@js.native
class VariableList protected () extends PropertyList[Variable] {
  def this(parent: Property[PropertyDefinition], populate: js.Array[Variable]) = this()
  def replace(str: String): String = js.native
  def replace(str: String, overrides: VariableList): String = js.native
  def substitute[T](obj: T): T = js.native
  def substitute[T](obj: T, overrides: VariableList): T = js.native
  def substitute[T](obj: T, overrides: VariableList, mutate: Boolean): T = js.native
  def syncFromObject(obj: StringDictionary[VariableDefinition]): js.UndefOr[Anon_Created] = js.native
  def syncFromObject(obj: StringDictionary[VariableDefinition], track: Boolean): js.UndefOr[Anon_Created] = js.native
  def syncFromObject(obj: StringDictionary[VariableDefinition], track: Boolean, prune: Boolean): js.UndefOr[Anon_Created] = js.native
  def syncToObject(): StringDictionary[VariableDefinition] = js.native
  def syncToObject(obj: StringDictionary[VariableDefinition]): StringDictionary[VariableDefinition] = js.native
}

/* static members */
@JSImport("postman-collection", "VariableList")
@js.native
object VariableList extends js.Object {
  def isVariableList(obj: js.Any): Boolean = js.native
}

