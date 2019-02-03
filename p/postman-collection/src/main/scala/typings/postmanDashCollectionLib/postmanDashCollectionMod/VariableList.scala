package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "VariableList")
@js.native
class VariableList protected () extends PropertyList[Variable] {
  def this(parent: Property[PropertyDefinition], populate: js.Array[Variable]) = this()
  def replace(str: java.lang.String): java.lang.String = js.native
  def replace(str: java.lang.String, overrides: VariableList): java.lang.String = js.native
  def substitute[T](obj: T): T = js.native
  def substitute[T](obj: T, overrides: VariableList): T = js.native
  def substitute[T](obj: T, overrides: VariableList, mutate: scala.Boolean): T = js.native
  def syncFromObject(obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition]): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncFromObject(obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition], track: scala.Boolean): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncFromObject(
    obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition],
    track: scala.Boolean,
    prune: scala.Boolean
  ): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncToObject(): org.scalablytyped.runtime.StringDictionary[VariableDefinition] = js.native
  def syncToObject(obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition]): org.scalablytyped.runtime.StringDictionary[VariableDefinition] = js.native
}

/* static members */
@JSImport("postman-collection", "VariableList")
@js.native
object VariableList extends js.Object {
  def isVariableList(obj: js.Any): scala.Boolean = js.native
}

