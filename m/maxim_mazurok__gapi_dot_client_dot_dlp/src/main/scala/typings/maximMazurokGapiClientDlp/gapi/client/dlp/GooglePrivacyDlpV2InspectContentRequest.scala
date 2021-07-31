package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectContentRequest extends StObject {
  
  /** Configuration for the inspector. What specified here will override the template referenced by the inspect_template_name argument. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Template to use. Any configuration directly specified in inspect_config will override those set in the template. Singular fields that are set in this request will replace their
    * corresponding fields in the template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.undefined
  
  /** The item to inspect. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2InspectContentRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectContentRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectContentRequestMutableBuilder[Self <: GooglePrivacyDlpV2InspectContentRequest] (val x: Self) extends AnyVal {
    
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
  }
}
