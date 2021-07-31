package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyBaseDefinition extends StObject {
  
  var description: js.UndefOr[String | DescriptionDefinition] = js.undefined
}
object PropertyBaseDefinition {
  
  @scala.inline
  def apply(): PropertyBaseDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBaseDefinition]
  }
  
  @scala.inline
  implicit class PropertyBaseDefinitionMutableBuilder[Self <: PropertyBaseDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String | DescriptionDefinition): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
