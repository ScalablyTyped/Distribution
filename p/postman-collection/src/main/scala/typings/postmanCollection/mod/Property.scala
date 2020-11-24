package typings.postmanCollection.mod

import typings.postmanCollection.anon.Disabled
import typings.postmanCollection.anon.IgnoreOwnVariables
import typings.postmanCollection.anon.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because var conflicts: description. Inlined id, name, disabled */ @JSImport("postman-collection", "Property")
@js.native
class Property[TDefinition /* <: js.Object */] () extends PropertyBase[TDefinition] {
  def this(definition: TDefinition) = this()
  def this(definition: Disabled[TDefinition]) = this()
  
  def describe(content: String): Unit = js.native
  def describe(content: String, `type`: String): Unit = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def toObjectResolved(scope: Null, overrides: js.Array[_]): TDefinition = js.native
  def toObjectResolved(scope: Null, overrides: js.Array[_], options: IgnoreOwnVariables): TDefinition = js.native
  def toObjectResolved(scope: Variables, overrides: js.Array[_]): TDefinition = js.native
  def toObjectResolved(scope: Variables, overrides: js.Array[_], options: IgnoreOwnVariables): TDefinition = js.native
}
/* static members */
@JSImport("postman-collection", "Property")
@js.native
object Property extends js.Object {
  
  def replaceSubstitutions(str: String, variables: js.Array[VariableList]): String = js.native
  def replaceSubstitutions(str: String, variables: VariableList): String = js.native
  
  def replaceSubstitutionsIn[T](obj: T, variables: js.Array[VariableList], mutate: Boolean): T = js.native
}
