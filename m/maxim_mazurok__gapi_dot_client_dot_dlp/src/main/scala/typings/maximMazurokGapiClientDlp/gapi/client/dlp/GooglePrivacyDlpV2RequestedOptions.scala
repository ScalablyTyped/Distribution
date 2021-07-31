package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RequestedOptions extends StObject {
  
  /** Inspect config. */
  var jobConfig: js.UndefOr[GooglePrivacyDlpV2InspectJobConfig] = js.undefined
  
  /** If run with an InspectTemplate, a snapshot of its state at the time of this run. */
  var snapshotInspectTemplate: js.UndefOr[GooglePrivacyDlpV2InspectTemplate] = js.undefined
}
object GooglePrivacyDlpV2RequestedOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RequestedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RequestedOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RequestedOptionsMutableBuilder[Self <: GooglePrivacyDlpV2RequestedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobConfig(value: GooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "jobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobConfigUndefined: Self = StObject.set(x, "jobConfig", js.undefined)
    
    @scala.inline
    def setSnapshotInspectTemplate(value: GooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "snapshotInspectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotInspectTemplateUndefined: Self = StObject.set(x, "snapshotInspectTemplate", js.undefined)
  }
}
