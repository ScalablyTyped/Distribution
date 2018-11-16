package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Collection")
@js.native
class Collection () extends ItemGroup[Request] {
  def this(definition: CollectionDefinition) = this()
  def this(definition: CollectionDefinition, environments: js.Array[_]) = this()
  var variables: VariableList = js.native
  var version: js.UndefOr[Version] = js.native
  def syncVariablesFrom(obj: ScalablyTyped.runtime.StringDictionary[VariableDefinition]): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncVariablesFrom(obj: ScalablyTyped.runtime.StringDictionary[VariableDefinition], track: scala.Boolean): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncVariablesFrom(
    obj: ScalablyTyped.runtime.StringDictionary[VariableDefinition],
    track: scala.Boolean,
    prune: scala.Boolean
  ): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncVariablesTo(): ScalablyTyped.runtime.StringDictionary[VariableDefinition] = js.native
  def syncVariablesTo(obj: ScalablyTyped.runtime.StringDictionary[VariableDefinition]): ScalablyTyped.runtime.StringDictionary[VariableDefinition] = js.native
}

@JSImport("postman-collection", "Collection")
@js.native
object Collection extends js.Object {
  def isCollection(obj: js.Any): scala.Boolean = js.native
}

