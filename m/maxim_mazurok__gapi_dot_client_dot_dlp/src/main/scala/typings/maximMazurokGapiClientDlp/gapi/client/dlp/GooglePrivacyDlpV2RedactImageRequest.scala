package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RedactImageRequest extends js.Object {
  
  /** The content must be PNG, JPEG, SVG or BMP. */
  var byteItem: js.UndefOr[GooglePrivacyDlpV2ByteContentItem] = js.native
  
  /** The configuration for specifying what content to redact from images. */
  var imageRedactionConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2ImageRedactionConfig]] = js.native
  
  /** Whether the response should include findings along with the redacted image. */
  var includeFindings: js.UndefOr[Boolean] = js.native
  
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.native
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2RedactImageRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RedactImageRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RedactImageRequestOps[Self <: GooglePrivacyDlpV2RedactImageRequest] (val x: Self) extends AnyVal {
    
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
    def setByteItem(value: GooglePrivacyDlpV2ByteContentItem): Self = this.set("byteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteItem: Self = this.set("byteItem", js.undefined)
    
    @scala.inline
    def setImageRedactionConfigsVarargs(value: GooglePrivacyDlpV2ImageRedactionConfig*): Self = this.set("imageRedactionConfigs", js.Array(value :_*))
    
    @scala.inline
    def setImageRedactionConfigs(value: js.Array[GooglePrivacyDlpV2ImageRedactionConfig]): Self = this.set("imageRedactionConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRedactionConfigs: Self = this.set("imageRedactionConfigs", js.undefined)
    
    @scala.inline
    def setIncludeFindings(value: Boolean): Self = this.set("includeFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFindings: Self = this.set("includeFindings", js.undefined)
    
    @scala.inline
    def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = this.set("inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectConfig: Self = this.set("inspectConfig", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
  }
}
