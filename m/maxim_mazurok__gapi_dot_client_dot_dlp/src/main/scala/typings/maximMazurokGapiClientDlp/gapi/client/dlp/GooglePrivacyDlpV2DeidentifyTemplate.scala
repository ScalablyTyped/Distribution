package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeidentifyTemplate extends StObject {
  
  /** Output only. The creation timestamp of an inspectTemplate. */
  var createTime: js.UndefOr[String] = js.native
  
  /** ///////////// // The core content of the template // /////////////// */
  var deidentifyConfig: js.UndefOr[GooglePrivacyDlpV2DeidentifyConfig] = js.native
  
  /** Short description (max 256 chars). */
  var description: js.UndefOr[String] = js.native
  
  /** Display name (max 256 chars). */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only. The template name. The template will have one of the following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR
    * `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of an inspectTemplate. */
  var updateTime: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2DeidentifyTemplate {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeidentifyTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeidentifyTemplate]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeidentifyTemplateMutableBuilder[Self <: GooglePrivacyDlpV2DeidentifyTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeidentifyConfig(value: GooglePrivacyDlpV2DeidentifyConfig): Self = StObject.set(x, "deidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyConfigUndefined: Self = StObject.set(x, "deidentifyConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
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
