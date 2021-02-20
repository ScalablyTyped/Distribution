package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupSettingTemplate extends DirectoryObject {
  
  // Description of the template.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Display name of the template.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this
    * template.
    */
  var values: js.UndefOr[js.Array[SettingTemplateValue]] = js.native
}
object GroupSettingTemplate {
  
  @scala.inline
  def apply(): GroupSettingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSettingTemplate]
  }
  
  @scala.inline
  implicit class GroupSettingTemplateMutableBuilder[Self <: GroupSettingTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[SettingTemplateValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SettingTemplateValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
