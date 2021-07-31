package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectJobConfig extends StObject {
  
  /** Actions to execute at the completion of the job. */
  var actions: js.UndefOr[js.Array[GooglePrivacyDlpV2Action]] = js.undefined
  
  /** How and what to scan for. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /** If provided, will be used as the default for all values in InspectConfig. `inspect_config` will be merged into the values persisted as part of the template. */
  var inspectTemplateName: js.UndefOr[String] = js.undefined
  
  /** The data to scan. */
  var storageConfig: js.UndefOr[GooglePrivacyDlpV2StorageConfig] = js.undefined
}
object GooglePrivacyDlpV2InspectJobConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectJobConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectJobConfigMutableBuilder[Self <: GooglePrivacyDlpV2InspectJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[GooglePrivacyDlpV2Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: GooglePrivacyDlpV2Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    @scala.inline
    def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    @scala.inline
    def setStorageConfig(value: GooglePrivacyDlpV2StorageConfig): Self = StObject.set(x, "storageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageConfigUndefined: Self = StObject.set(x, "storageConfig", js.undefined)
  }
}
