package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeMappingParameterSchema extends StObject {
  
  var allowMultipleOccurrences: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[AttributeType] = js.undefined
}
object AttributeMappingParameterSchema {
  
  inline def apply(): AttributeMappingParameterSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeMappingParameterSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeMappingParameterSchema] (val x: Self) extends AnyVal {
    
    inline def setAllowMultipleOccurrences(value: Boolean): Self = StObject.set(x, "allowMultipleOccurrences", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleOccurrencesUndefined: Self = StObject.set(x, "allowMultipleOccurrences", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: AttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
