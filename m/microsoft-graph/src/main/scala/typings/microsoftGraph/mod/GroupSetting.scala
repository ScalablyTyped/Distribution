package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupSetting
  extends StObject
     with Entity {
  
  // Display name of this group of settings, which comes from the associated template.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier for the template used to create this group of settings. Read-only.
  var templateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Collection of name value pairs. Must contain and set all the settings defined in the template.
  var values: js.UndefOr[js.Array[SettingValue]] = js.undefined
}
object GroupSetting {
  
  inline def apply(): GroupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSetting]
  }
  
  extension [Self <: GroupSetting](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTemplateId(value: NullableOption[String]): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setValues(value: js.Array[SettingValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SettingValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
