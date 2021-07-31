package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectResult extends StObject {
  
  /** List of findings for an item. */
  var findings: js.UndefOr[js.Array[GooglePrivacyDlpV2Finding]] = js.undefined
  
  /**
    * If true, then this item might have more findings than were returned, and the findings returned are an arbitrary subset of all findings. The findings list might be truncated because
    * the input items were too large, or because the server reached the maximum amount of resources allowed for a single API call. For best results, divide the input into smaller batches.
    */
  var findingsTruncated: js.UndefOr[Boolean] = js.undefined
}
object GooglePrivacyDlpV2InspectResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectResultMutableBuilder[Self <: GooglePrivacyDlpV2InspectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: js.Array[GooglePrivacyDlpV2Finding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsTruncated(value: Boolean): Self = StObject.set(x, "findingsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsTruncatedUndefined: Self = StObject.set(x, "findingsTruncated", js.undefined)
    
    @scala.inline
    def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    @scala.inline
    def setFindingsVarargs(value: GooglePrivacyDlpV2Finding*): Self = StObject.set(x, "findings", js.Array(value :_*))
  }
}
