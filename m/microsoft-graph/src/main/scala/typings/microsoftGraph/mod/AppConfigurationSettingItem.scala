package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppConfigurationSettingItem extends StObject {
  
  // app configuration key.
  var appConfigKey: js.UndefOr[String] = js.native
  
  // app configuration key type. Possible values are: stringType, integerType, realType, booleanType, tokenType.
  var appConfigKeyType: js.UndefOr[MdmAppConfigKeyType] = js.native
  
  // app configuration key value.
  var appConfigKeyValue: js.UndefOr[String] = js.native
}
object AppConfigurationSettingItem {
  
  @scala.inline
  def apply(): AppConfigurationSettingItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfigurationSettingItem]
  }
  
  @scala.inline
  implicit class AppConfigurationSettingItemMutableBuilder[Self <: AppConfigurationSettingItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppConfigKey(value: String): Self = StObject.set(x, "appConfigKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppConfigKeyType(value: MdmAppConfigKeyType): Self = StObject.set(x, "appConfigKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppConfigKeyTypeUndefined: Self = StObject.set(x, "appConfigKeyType", js.undefined)
    
    @scala.inline
    def setAppConfigKeyUndefined: Self = StObject.set(x, "appConfigKey", js.undefined)
    
    @scala.inline
    def setAppConfigKeyValue(value: String): Self = StObject.set(x, "appConfigKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppConfigKeyValueUndefined: Self = StObject.set(x, "appConfigKeyValue", js.undefined)
  }
}
