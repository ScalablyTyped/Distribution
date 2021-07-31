package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ReidentifyContentRequest extends StObject {
  
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Template to use. Any configuration directly specified in `inspect_config` will override those set in the template. Singular fields that are set in this request will replace their
    * corresponding fields in the template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.undefined
  
  /** The item to re-identify. Will be treated as text. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration for the re-identification of the content item. This field shares the same proto message type that is used for de-identification, however its usage here is for the
    * reversal of the previous de-identification. Re-identification is performed by examining the transformations used to de-identify the items and executing the reverse. This requires
    * that only reversible transformations be provided here. The reversible transformations are: - `CryptoDeterministicConfig` - `CryptoReplaceFfxFpeConfig`
    */
  var reidentifyConfig: js.UndefOr[GooglePrivacyDlpV2DeidentifyConfig] = js.undefined
  
  /**
    * Template to use. References an instance of `DeidentifyTemplate`. Any configuration directly specified in `reidentify_config` or `inspect_config` will override those set in the
    * template. The `DeidentifyTemplate` used must include only reversible transformations. Singular fields that are set in this request will replace their corresponding fields in the
    * template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var reidentifyTemplateName: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2ReidentifyContentRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ReidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReidentifyContentRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ReidentifyContentRequestMutableBuilder[Self <: GooglePrivacyDlpV2ReidentifyContentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    @scala.inline
    def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    @scala.inline
    def setItem(value: GooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setReidentifyConfig(value: GooglePrivacyDlpV2DeidentifyConfig): Self = StObject.set(x, "reidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReidentifyConfigUndefined: Self = StObject.set(x, "reidentifyConfig", js.undefined)
    
    @scala.inline
    def setReidentifyTemplateName(value: String): Self = StObject.set(x, "reidentifyTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReidentifyTemplateNameUndefined: Self = StObject.set(x, "reidentifyTemplateName", js.undefined)
  }
}
