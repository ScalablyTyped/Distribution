package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Result extends StObject {
  
  /**
    * Statistics related to the processing of hybrid inspect. Early access feature is in a pre-release state and might change or have limited support. For more information, see
    * https://cloud.google.com/products#product-launch-stages.
    */
  var hybridStats: js.UndefOr[GooglePrivacyDlpV2HybridInspectStatistics] = js.undefined
  
  /** Statistics of how many instances of each info type were found during inspect job. */
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeStats]] = js.undefined
  
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[String] = js.undefined
  
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Result {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Result]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ResultMutableBuilder[Self <: GooglePrivacyDlpV2Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHybridStats(value: GooglePrivacyDlpV2HybridInspectStatistics): Self = StObject.set(x, "hybridStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHybridStatsUndefined: Self = StObject.set(x, "hybridStats", js.undefined)
    
    @scala.inline
    def setInfoTypeStats(value: js.Array[GooglePrivacyDlpV2InfoTypeStats]): Self = StObject.set(x, "infoTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeStatsUndefined: Self = StObject.set(x, "infoTypeStats", js.undefined)
    
    @scala.inline
    def setInfoTypeStatsVarargs(value: GooglePrivacyDlpV2InfoTypeStats*): Self = StObject.set(x, "infoTypeStats", js.Array(value :_*))
    
    @scala.inline
    def setProcessedBytes(value: String): Self = StObject.set(x, "processedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedBytesUndefined: Self = StObject.set(x, "processedBytes", js.undefined)
    
    @scala.inline
    def setTotalEstimatedBytes(value: String): Self = StObject.set(x, "totalEstimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalEstimatedBytesUndefined: Self = StObject.set(x, "totalEstimatedBytes", js.undefined)
  }
}
