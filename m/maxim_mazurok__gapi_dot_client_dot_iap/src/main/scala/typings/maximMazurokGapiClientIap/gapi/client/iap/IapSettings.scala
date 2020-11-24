package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IapSettings extends js.Object {
  
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
  implicit class IapSettingsOps[Self <: IapSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessSettings(value: AccessSettings): Self = this.set("accessSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessSettings: Self = this.set("accessSettings", js.undefined)
    
    @scala.inline
    def setApplicationSettings(value: ApplicationSettings): Self = this.set("applicationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationSettings: Self = this.set("applicationSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
