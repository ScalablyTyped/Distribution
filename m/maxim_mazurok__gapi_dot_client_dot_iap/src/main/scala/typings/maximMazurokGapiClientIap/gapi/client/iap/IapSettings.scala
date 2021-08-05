package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IapSettings extends StObject {
  
  /** Top level wrapper for all access related setting in IAP */
  var accessSettings: js.UndefOr[AccessSettings] = js.undefined
  
  /** Top level wrapper for all application related settings in IAP */
  var applicationSettings: js.UndefOr[ApplicationSettings] = js.undefined
  
  /** Required. The resource name of the IAP protected resource. */
  var name: js.UndefOr[String] = js.undefined
}
object IapSettings {
  
  inline def apply(): IapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IapSettings]
  }
  
  extension [Self <: IapSettings](x: Self) {
    
    inline def setAccessSettings(value: AccessSettings): Self = StObject.set(x, "accessSettings", value.asInstanceOf[js.Any])
    
    inline def setAccessSettingsUndefined: Self = StObject.set(x, "accessSettings", js.undefined)
    
    inline def setApplicationSettings(value: ApplicationSettings): Self = StObject.set(x, "applicationSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationSettingsUndefined: Self = StObject.set(x, "applicationSettings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
