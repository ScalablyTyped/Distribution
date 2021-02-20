package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LDiversityResult extends StObject {
  
  /** Histogram of l-diversity equivalence class sensitive value frequencies. */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2LDiversityHistogramBucket]] = js.native
}
object GooglePrivacyDlpV2LDiversityResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LDiversityResultMutableBuilder[Self <: GooglePrivacyDlpV2LDiversityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2LDiversityHistogramBucket]): Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", js.undefined)
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2LDiversityHistogramBucket*): Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", js.Array(value :_*))
  }
}
