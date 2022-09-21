package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2LDiversityResult extends StObject {
  
  /** Histogram of l-diversity equivalence class sensitive value frequencies. */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2LDiversityHistogramBucket]] = js.undefined
}
object GooglePrivacyDlpV2LDiversityResult {
  
  inline def apply(): GooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityResult]
  }
  
  extension [Self <: GooglePrivacyDlpV2LDiversityResult](x: Self) {
    
    inline def setSensitiveValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2LDiversityHistogramBucket]): Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    inline def setSensitiveValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", js.undefined)
    
    inline def setSensitiveValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2LDiversityHistogramBucket*): Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", js.Array(value*))
  }
}
