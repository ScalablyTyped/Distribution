package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.FormParamDefinition because var conflicts: description, disabled, id, name. Inlined key, value */ @JSImport("postman-collection", "FormParam")
@js.native
class FormParam protected () extends Property[FormParamDefinition] {
  def this(options: FormParamDefinition) = this()
  
  var key: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
