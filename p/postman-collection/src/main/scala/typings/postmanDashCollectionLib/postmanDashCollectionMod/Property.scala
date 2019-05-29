package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.PropertyDefinition because var conflicts: description. Inlined id, name, disabled */ @JSImport("postman-collection", "Property")
@js.native
class Property[TDefinition /* <: js.Object */] () extends PropertyBase[TDefinition] {
  def this(definition: TDefinition) = this()
  def this(definition: postmanDashCollectionLib.Anon_Disabled[TDefinition]) = this()
  var disabled: js.UndefOr[scala.Boolean] = js.native
  var id: js.UndefOr[java.lang.String] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  def describe(content: java.lang.String): scala.Unit = js.native
  def describe(content: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def toObjectResolved(scope: postmanDashCollectionLib.Anon_Variables, overrides: js.Array[_]): TDefinition = js.native
  def toObjectResolved(
    scope: postmanDashCollectionLib.Anon_Variables,
    overrides: js.Array[_],
    options: postmanDashCollectionLib.Anon_IgnoreOwnVariables
  ): TDefinition = js.native
  def toObjectResolved(scope: scala.Null, overrides: js.Array[_]): TDefinition = js.native
  def toObjectResolved(
    scope: scala.Null,
    overrides: js.Array[_],
    options: postmanDashCollectionLib.Anon_IgnoreOwnVariables
  ): TDefinition = js.native
}

/* static members */
@JSImport("postman-collection", "Property")
@js.native
object Property extends js.Object {
  def replaceSubstitutions(
    str: java.lang.String,
    variables: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.VariableList]
  ): java.lang.String = js.native
  def replaceSubstitutions(str: java.lang.String, variables: postmanDashCollectionLib.postmanDashCollectionMod.VariableList): java.lang.String = js.native
  def replaceSubstitutionsIn[T](
    obj: T,
    variables: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.VariableList],
    mutate: scala.Boolean
  ): T = js.native
}

