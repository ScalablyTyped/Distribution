package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Result extends StObject {
  
  /** Statistics related to the processing of hybrid inspect. */
  var hybridStats: js.UndefOr[GooglePrivacyDlpV2HybridInspectStatistics] = js.undefined
  
  /** Statistics of how many instances of each info type were found during inspect job. */
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeStats]] = js.undefined
  
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[String] = js.undefined
  
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Result {
  
  inline def apply(): GooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Result]
  }
  
  extension [Self <: GooglePrivacyDlpV2Result](x: Self) {
    
    inline def setHybridStats(value: GooglePrivacyDlpV2HybridInspectStatistics): Self = StObject.set(x, "hybridStats", value.asInstanceOf[js.Any])
    
    inline def setHybridStatsUndefined: Self = StObject.set(x, "hybridStats", js.undefined)
    
    inline def setInfoTypeStats(value: js.Array[GooglePrivacyDlpV2InfoTypeStats]): Self = StObject.set(x, "infoTypeStats", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeStatsUndefined: Self = StObject.set(x, "infoTypeStats", js.undefined)
    
    inline def setInfoTypeStatsVarargs(value: GooglePrivacyDlpV2InfoTypeStats*): Self = StObject.set(x, "infoTypeStats", js.Array(value*))
    
    inline def setProcessedBytes(value: String): Self = StObject.set(x, "processedBytes", value.asInstanceOf[js.Any])
    
    inline def setProcessedBytesUndefined: Self = StObject.set(x, "processedBytes", js.undefined)
    
    inline def setTotalEstimatedBytes(value: String): Self = StObject.set(x, "totalEstimatedBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalEstimatedBytesUndefined: Self = StObject.set(x, "totalEstimatedBytes", js.undefined)
  }
}
