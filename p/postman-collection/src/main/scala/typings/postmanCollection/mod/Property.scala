package typings.postmanCollection.mod

import typings.postmanCollection.anon.Disabled
import typings.postmanCollection.anon.IgnoreOwnVariables
import typings.postmanCollection.anon.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  def toObjectResolved(scope: Null, overrides: js.Array[js.Any]): TDefinition = js.native
  def toObjectResolved(scope: Null, overrides: js.Array[js.Any], options: IgnoreOwnVariables): TDefinition = js.native
  def toObjectResolved(scope: Variables, overrides: js.Array[js.Any]): TDefinition = js.native
  def toObjectResolved(scope: Variables, overrides: js.Array[js.Any], options: IgnoreOwnVariables): TDefinition = js.native
}
/* static members */
object Property {
  
  @JSImport("postman-collection", "Property")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def replaceSubstitutions(str: String, variables: js.Array[VariableList]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutions")(str.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def replaceSubstitutions(str: String, variables: VariableList): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutions")(str.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def replaceSubstitutionsIn[T](obj: T, variables: js.Array[VariableList], mutate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionsIn")(obj.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], mutate.asInstanceOf[js.Any])).asInstanceOf[T]
}
