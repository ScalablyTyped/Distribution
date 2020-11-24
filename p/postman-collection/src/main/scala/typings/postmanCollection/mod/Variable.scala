package typings.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postmanCollection.anon.Any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.VariableDefinition because var conflicts: description, disabled, id, name. Inlined value, `type`, key */ @JSImport("postman-collection", "Variable")
@js.native
class Variable () extends Property[VariableDefinition] {
  def this(definition: StringDictionary[VariableDefinition]) = this()
  def this(definition: VariableDefinition) = this()
  
  def cast(value: js.Any): js.Any = js.native
  
  def castIn(value: js.Any): js.Any = js.native
  
  def castOut(value: js.Any): js.Any = js.native
  
  def get(): js.Any = js.native
  
  var key: js.UndefOr[String] = js.native
  
  def set(value: js.Any): Unit = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  def update(options: VariableDefinition): Unit = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  def valueOf(value: js.Any): js.Any = js.native
  
  def valueType(typeName: String, _noCast: Boolean): String = js.native
}
/* static members */
@JSImport("postman-collection", "Variable")
@js.native
object Variable extends js.Object {
  
  def isVariable(obj: js.Any): Boolean = js.native
  
  var types: Any = js.native
}
