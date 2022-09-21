package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CategoricalStatsResult extends StObject {
  
  /** Histogram of value frequencies in the column. */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.undefined
}
object GooglePrivacyDlpV2CategoricalStatsResult {
  
  inline def apply(): GooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CategoricalStatsResult]
  }
  
  extension [Self <: GooglePrivacyDlpV2CategoricalStatsResult](x: Self) {
    
    inline def setValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]): Self = StObject.set(x, "valueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    inline def setValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.undefined)
    
    inline def setValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2CategoricalStatsHistogramBucket*): Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.Array(value*))
  }
}
