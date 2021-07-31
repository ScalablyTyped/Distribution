package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectTemplate extends StObject {
  
  /** Output only. The creation timestamp of an inspectTemplate. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Short description (max 256 chars). */
  var description: js.UndefOr[String] = js.undefined
  
  /** Display name (max 256 chars). */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The core content of the template. Configuration of the scanning process. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Output only. The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
    * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of an inspectTemplate. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2InspectTemplate {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectTemplate]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectTemplateMutableBuilder[Self <: GooglePrivacyDlpV2InspectTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
