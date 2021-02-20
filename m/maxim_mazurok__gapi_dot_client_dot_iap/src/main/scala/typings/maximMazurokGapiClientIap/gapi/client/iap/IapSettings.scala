package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IapSettings extends StObject {
  
  /** Top level wrapper for all access related setting in IAP */
  var accessSettings: js.UndefOr[AccessSettings] = js.native
  
  /** Top level wrapper for all application related settings in IAP */
  var applicationSettings: js.UndefOr[ApplicationSettings] = js.native
  
  /** Required. The resource name of the IAP protected resource. */
  var name: js.UndefOr[String] = js.native
}
object IapSettings {
  
  @scala.inline
  def apply(): IapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IapSettings]
  }
  
  @scala.inline
  implicit class IapSettingsMutableBuilder[Self <: IapSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessSettings(value: AccessSettings): Self = StObject.set(x, "accessSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessSettingsUndefined: Self = StObject.set(x, "accessSettings", js.undefined)
    
    @scala.inline
    def setApplicationSettings(value: ApplicationSettings): Self = StObject.set(x, "applicationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSettingsUndefined: Self = StObject.set(x, "applicationSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
