package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Disabled
import typings.postmanDashCollection.Anon_IgnoreOwnVariables
import typings.postmanDashCollection.Anon_Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyBaseDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyDefinition because var conflicts: description. Inlined id, name, disabled */ @JSImport("postman-collection", "Property")
@js.native
class Property[TDefinition /* <: js.Object */] () extends PropertyBase[TDefinition] {
  def this(definition: TDefinition) = this()
  def this(definition: Anon_Disabled[TDefinition]) = this()
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  def describe(content: String): Unit = js.native
  def describe(content: String, `type`: String): Unit = js.native
  def toObjectResolved(scope: Null, overrides: js.Array[_]): TDefinition = js.native
  def toObjectResolved(scope: Null, overrides: js.Array[_], options: Anon_IgnoreOwnVariables): TDefinition = js.native
  def toObjectResolved(scope: Anon_Variables, overrides: js.Array[_]): TDefinition = js.native
  def toObjectResolved(scope: Anon_Variables, overrides: js.Array[_], options: Anon_IgnoreOwnVariables): TDefinition = js.native
}

/* static members */
@JSImport("postman-collection", "Property")
@js.native
object Property extends js.Object {
  def replaceSubstitutions(str: String, variables: js.Array[VariableList]): String = js.native
  def replaceSubstitutions(str: String, variables: VariableList): String = js.native
  def replaceSubstitutionsIn[T](obj: T, variables: js.Array[VariableList], mutate: Boolean): T = js.native
}

