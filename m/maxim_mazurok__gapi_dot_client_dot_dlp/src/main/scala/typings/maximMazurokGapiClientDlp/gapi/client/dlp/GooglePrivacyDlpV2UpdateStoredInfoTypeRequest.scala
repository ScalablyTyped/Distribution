package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2UpdateStoredInfoTypeRequest extends StObject {
  
  /** Updated configuration for the storedInfoType. If not provided, a new version of the storedInfoType will be created with the existing configuration. */
  var config: js.UndefOr[GooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2UpdateStoredInfoTypeRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2UpdateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2UpdateStoredInfoTypeRequestMutableBuilder[Self <: GooglePrivacyDlpV2UpdateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: GooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
