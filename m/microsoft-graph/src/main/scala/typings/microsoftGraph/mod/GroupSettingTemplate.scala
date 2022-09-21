package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupSettingTemplate
  extends StObject
     with DirectoryObject {
  
  // Description of the template.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Display name of the template. The template named Group.Unified can be used to configure tenant-wide Microsoft 365 group
    * settings, while the template named Group.Unified.Guest can be used to configure group-specific settings.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this
    * template.
    */
  var values: js.UndefOr[js.Array[SettingTemplateValue]] = js.undefined
}
object GroupSettingTemplate {
  
  inline def apply(): GroupSettingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSettingTemplate]
  }
  
  extension [Self <: GroupSettingTemplate](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setValues(value: js.Array[SettingTemplateValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SettingTemplateValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
