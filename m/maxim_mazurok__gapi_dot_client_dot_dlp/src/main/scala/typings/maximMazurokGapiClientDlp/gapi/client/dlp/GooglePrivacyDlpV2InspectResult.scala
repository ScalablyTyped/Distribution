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
  
  inline def apply(): GooglePrivacyDlpV2InspectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectResult]
  }
  
  extension [Self <: GooglePrivacyDlpV2InspectResult](x: Self) {
    
    inline def setFindings(value: js.Array[GooglePrivacyDlpV2Finding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsTruncated(value: Boolean): Self = StObject.set(x, "findingsTruncated", value.asInstanceOf[js.Any])
    
    inline def setFindingsTruncatedUndefined: Self = StObject.set(x, "findingsTruncated", js.undefined)
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: GooglePrivacyDlpV2Finding*): Self = StObject.set(x, "findings", js.Array(value :_*))
  }
}
