package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.VariableScopeDefinition because Would inherit conflicting mutable fields List(description, name, disabled, id))*/
@JSImport("postman-collection", "VariableScope")
@js.native
class VariableScope protected () extends Property[VariableScopeDefinition] {
  def this(definition: js.Array[VariableDefinition]) = this()
  def this(definition: VariableList) = this()
  def this(definition: VariableScopeDefinition) = this()
  def this(definition: js.Array[VariableDefinition], layers: js.Array[VariableList]) = this()
  def this(definition: js.Array[VariableDefinition], layers: VariableList) = this()
  def this(definition: VariableList, layers: js.Array[VariableList]) = this()
  def this(definition: VariableList, layers: VariableList) = this()
  def this(definition: VariableScopeDefinition, layers: js.Array[VariableList]) = this()
  def this(definition: VariableScopeDefinition, layers: VariableList) = this()
  var values: js.UndefOr[js.Array[VariableDefinition]] = js.native
  def addLayer(list: VariableList): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def has(variableName: java.lang.String): scala.Boolean = js.native
  def set(key: java.lang.String, value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def syncVariablesFrom(obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition]): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncVariablesFrom(obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition], track: scala.Boolean): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncVariablesFrom(
    obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition],
    track: scala.Boolean,
    prune: scala.Boolean
  ): js.UndefOr[postmanDashCollectionLib.Anon_Created] = js.native
  def syncVariablesTo(): org.scalablytyped.runtime.StringDictionary[VariableDefinition] = js.native
  def syncVariablesTo(obj: org.scalablytyped.runtime.StringDictionary[VariableDefinition]): org.scalablytyped.runtime.StringDictionary[VariableDefinition] = js.native
  def toObject(excludeDisabled: scala.Boolean, caseSensitive: scala.Boolean): js.Any = js.native
  def unset(key: java.lang.String): scala.Unit = js.native
  def variables(): org.scalablytyped.runtime.StringDictionary[VariableDefinition] = js.native
}

@JSImport("postman-collection", "VariableScope")
@js.native
object VariableScope extends js.Object {
  def isVariableScope(obj: js.Any): scala.Boolean = js.native
}

