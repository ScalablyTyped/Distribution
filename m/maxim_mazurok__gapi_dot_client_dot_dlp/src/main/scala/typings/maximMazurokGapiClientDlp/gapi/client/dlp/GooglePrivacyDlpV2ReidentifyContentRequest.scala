package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ReidentifyContentRequest extends js.Object {
  
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.native
  
  /**
    * Template to use. Any configuration directly specified in `inspect_config` will override those set in the template. Singular fields that are set in this request will replace their
    * corresponding fields in the template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  
  /** The item to re-identify. Will be treated as text. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.native
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * Configuration for the re-identification of the content item. This field shares the same proto message type that is used for de-identification, however its usage here is for the
    * reversal of the previous de-identification. Re-identification is performed by examining the transformations used to de-identify the items and executing the reverse. This requires
    * that only reversible transformations be provided here. The reversible transformations are: - `CryptoDeterministicConfig` - `CryptoReplaceFfxFpeConfig`
    */
  var reidentifyConfig: js.UndefOr[GooglePrivacyDlpV2DeidentifyConfig] = js.native
  
  /**
    * Template to use. References an instance of `DeidentifyTemplate`. Any configuration directly specified in `reidentify_config` or `inspect_config` will override those set in the
    * template. The `DeidentifyTemplate` used must include only reversible transformations. Singular fields that are set in this request will replace their corresponding fields in the
    * template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var reidentifyTemplateName: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2ReidentifyContentRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ReidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReidentifyContentRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ReidentifyContentRequestOps[Self <: GooglePrivacyDlpV2ReidentifyContentRequest] (val x: Self) extends AnyVal {
    
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
    def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = this.set("inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectConfig: Self = this.set("inspectConfig", js.undefined)
    
    @scala.inline
    def setInspectTemplateName(value: String): Self = this.set("inspectTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectTemplateName: Self = this.set("inspectTemplateName", js.undefined)
    
    @scala.inline
    def setItem(value: GooglePrivacyDlpV2ContentItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setReidentifyConfig(value: GooglePrivacyDlpV2DeidentifyConfig): Self = this.set("reidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReidentifyConfig: Self = this.set("reidentifyConfig", js.undefined)
    
    @scala.inline
    def setReidentifyTemplateName(value: String): Self = this.set("reidentifyTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReidentifyTemplateName: Self = this.set("reidentifyTemplateName", js.undefined)
  }
}
