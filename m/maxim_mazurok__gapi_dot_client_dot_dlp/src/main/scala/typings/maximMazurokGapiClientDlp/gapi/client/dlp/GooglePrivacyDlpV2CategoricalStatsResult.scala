package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CategoricalStatsResult extends StObject {
  
  /** Histogram of value frequencies in the column. */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.native
}
object GooglePrivacyDlpV2CategoricalStatsResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CategoricalStatsResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CategoricalStatsResultMutableBuilder[Self <: GooglePrivacyDlpV2CategoricalStatsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]): Self = StObject.set(x, "valueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.undefined)
    
    @scala.inline
    def setValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2CategoricalStatsHistogramBucket*): Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.Array(value :_*))
  }
}
