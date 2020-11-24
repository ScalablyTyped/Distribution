package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2MetadataLocation extends js.Object {
  
  /** Storage metadata. */
  var storageLabel: js.UndefOr[GooglePrivacyDlpV2StorageMetadataLabel] = js.native
  
  /** Type of metadata containing the finding. */
  var `type`: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2MetadataLocation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2MetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2MetadataLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2MetadataLocationOps[Self <: GooglePrivacyDlpV2MetadataLocation] (val x: Self) extends AnyVal {
    
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
    def setStorageLabel(value: GooglePrivacyDlpV2StorageMetadataLabel): Self = this.set("storageLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLabel: Self = this.set("storageLabel", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
