package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingTemplateValue extends StObject {
  
  // Default value for the setting.
  var defaultValue: js.UndefOr[NullableOption[String]] = js.native
  
  // Description of the setting.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the setting.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Type of the setting.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
}
object SettingTemplateValue {
  
  @scala.inline
  def apply(): SettingTemplateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingTemplateValue]
  }
  
  @scala.inline
  implicit class SettingTemplateValueMutableBuilder[Self <: SettingTemplateValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: NullableOption[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
