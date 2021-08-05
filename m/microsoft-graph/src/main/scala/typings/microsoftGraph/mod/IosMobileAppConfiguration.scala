package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosMobileAppConfiguration
  extends StObject
     with ManagedDeviceMobileAppConfiguration {
  
  // mdm app configuration Base64 binary.
  var encodedSettingXml: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // app configuration setting items.
  var settings: js.UndefOr[NullableOption[js.Array[AppConfigurationSettingItem]]] = js.undefined
}
object IosMobileAppConfiguration {
  
  inline def apply(): IosMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMobileAppConfiguration]
  }
  
  extension [Self <: IosMobileAppConfiguration](x: Self) {
    
    inline def setEncodedSettingXml(value: NullableOption[Double]): Self = StObject.set(x, "encodedSettingXml", value.asInstanceOf[js.Any])
    
    inline def setEncodedSettingXmlNull: Self = StObject.set(x, "encodedSettingXml", null)
    
    inline def setEncodedSettingXmlUndefined: Self = StObject.set(x, "encodedSettingXml", js.undefined)
    
    inline def setSettings(value: NullableOption[js.Array[AppConfigurationSettingItem]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: AppConfigurationSettingItem*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
