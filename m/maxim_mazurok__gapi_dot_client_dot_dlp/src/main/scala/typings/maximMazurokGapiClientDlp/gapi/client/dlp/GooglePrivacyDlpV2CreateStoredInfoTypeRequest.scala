package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CreateStoredInfoTypeRequest extends js.Object {
  
  /** Required. Configuration of the storedInfoType to create. */
  var config: js.UndefOr[GooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
    * characters. Can be empty to allow the system to generate one.
    */
  var storedInfoTypeId: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CreateStoredInfoTypeRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CreateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CreateStoredInfoTypeRequestOps[Self <: GooglePrivacyDlpV2CreateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: GooglePrivacyDlpV2StoredInfoTypeConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setStoredInfoTypeId(value: String): Self = this.set("storedInfoTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoredInfoTypeId: Self = this.set("storedInfoTypeId", js.undefined)
  }
}
