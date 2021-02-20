package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CreateStoredInfoTypeRequest extends StObject {
  
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
  implicit class GooglePrivacyDlpV2CreateStoredInfoTypeRequestMutableBuilder[Self <: GooglePrivacyDlpV2CreateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: GooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setStoredInfoTypeId(value: String): Self = StObject.set(x, "storedInfoTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredInfoTypeIdUndefined: Self = StObject.set(x, "storedInfoTypeId", js.undefined)
  }
}
