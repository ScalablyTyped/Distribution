package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingTemplateValue extends StObject {
  
  // Default value for the setting.
  var defaultValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description of the setting.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the setting.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Type of the setting.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object SettingTemplateValue {
  
  inline def apply(): SettingTemplateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingTemplateValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingTemplateValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: NullableOption[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
