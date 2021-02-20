package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration {
  
  // mdm app configuration Base64 binary.
  var encodedSettingXml: js.UndefOr[NullableOption[Double]] = js.native
  
  // app configuration setting items.
  var settings: js.UndefOr[NullableOption[js.Array[AppConfigurationSettingItem]]] = js.native
}
object IosMobileAppConfiguration {
  
  @scala.inline
  def apply(): IosMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMobileAppConfiguration]
  }
  
  @scala.inline
  implicit class IosMobileAppConfigurationMutableBuilder[Self <: IosMobileAppConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedSettingXml(value: NullableOption[Double]): Self = StObject.set(x, "encodedSettingXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedSettingXmlNull: Self = StObject.set(x, "encodedSettingXml", null)
    
    @scala.inline
    def setEncodedSettingXmlUndefined: Self = StObject.set(x, "encodedSettingXml", js.undefined)
    
    @scala.inline
    def setSettings(value: NullableOption[js.Array[AppConfigurationSettingItem]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: AppConfigurationSettingItem*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
