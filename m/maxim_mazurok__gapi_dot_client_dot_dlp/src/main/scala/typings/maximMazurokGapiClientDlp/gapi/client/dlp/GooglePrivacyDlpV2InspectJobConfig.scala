package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectJobConfig extends js.Object {
  
  /** Actions to execute at the completion of the job. */
  var actions: js.UndefOr[js.Array[GooglePrivacyDlpV2Action]] = js.native
  
  /** How and what to scan for. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.native
  
  /** If provided, will be used as the default for all values in InspectConfig. `inspect_config` will be merged into the values persisted as part of the template. */
  var inspectTemplateName: js.UndefOr[String] = js.native
  
  /** The data to scan. */
  var storageConfig: js.UndefOr[GooglePrivacyDlpV2StorageConfig] = js.native
}
object GooglePrivacyDlpV2InspectJobConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectJobConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectJobConfigOps[Self <: GooglePrivacyDlpV2InspectJobConfig] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: GooglePrivacyDlpV2Action*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[GooglePrivacyDlpV2Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = this.set("inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectConfig: Self = this.set("inspectConfig", js.undefined)
    
    @scala.inline
    def setInspectTemplateName(value: String): Self = this.set("inspectTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectTemplateName: Self = this.set("inspectTemplateName", js.undefined)
    
    @scala.inline
    def setStorageConfig(value: GooglePrivacyDlpV2StorageConfig): Self = this.set("storageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageConfig: Self = this.set("storageConfig", js.undefined)
  }
}
