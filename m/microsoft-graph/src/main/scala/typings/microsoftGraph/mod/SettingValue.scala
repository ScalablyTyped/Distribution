package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingValue extends StObject {
  
  // Name of the setting (as defined by the groupSettingTemplate).
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value of the setting.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object SettingValue {
  
  @scala.inline
  def apply(): SettingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingValue]
  }
  
  @scala.inline
  implicit class SettingValueMutableBuilder[Self <: SettingValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
