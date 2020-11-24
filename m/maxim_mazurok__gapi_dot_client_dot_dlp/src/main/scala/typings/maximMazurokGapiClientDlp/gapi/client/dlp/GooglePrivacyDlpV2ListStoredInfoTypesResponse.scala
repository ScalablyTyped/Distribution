package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListStoredInfoTypesResponse extends js.Object {
  
  /** If the next page is available then the next page token to be used in following ListStoredInfoTypes request. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest. */
  var storedInfoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2StoredInfoType]] = js.native
}
object GooglePrivacyDlpV2ListStoredInfoTypesResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListStoredInfoTypesResponseOps[Self <: GooglePrivacyDlpV2ListStoredInfoTypesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStoredInfoTypesVarargs(value: GooglePrivacyDlpV2StoredInfoType*): Self = this.set("storedInfoTypes", js.Array(value :_*))
    
    @scala.inline
    def setStoredInfoTypes(value: js.Array[GooglePrivacyDlpV2StoredInfoType]): Self = this.set("storedInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoredInfoTypes: Self = this.set("storedInfoTypes", js.undefined)
  }
}
