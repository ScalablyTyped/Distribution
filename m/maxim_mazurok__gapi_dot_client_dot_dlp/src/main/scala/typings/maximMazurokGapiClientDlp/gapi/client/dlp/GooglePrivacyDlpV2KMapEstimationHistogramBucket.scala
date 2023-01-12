package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KMapEstimationHistogramBucket extends StObject {
  
  /** Number of records within these anonymity bounds. */
  var bucketSize: js.UndefOr[String] = js.undefined
  
  /** Total number of distinct quasi-identifier tuple values in this bucket. */
  var bucketValueCount: js.UndefOr[String] = js.undefined
  
  /** Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20. */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2KMapEstimationQuasiIdValues]] = js.undefined
  
  /** Always greater than or equal to min_anonymity. */
  var maxAnonymity: js.UndefOr[String] = js.undefined
  
  /** Always positive. */
  var minAnonymity: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2KMapEstimationHistogramBucket {
  
  inline def apply(): GooglePrivacyDlpV2KMapEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KMapEstimationHistogramBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2KMapEstimationHistogramBucket] (val x: Self) extends AnyVal {
    
    inline def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    inline def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    inline def setBucketValues(value: js.Array[GooglePrivacyDlpV2KMapEstimationQuasiIdValues]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    inline def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    inline def setBucketValuesVarargs(value: GooglePrivacyDlpV2KMapEstimationQuasiIdValues*): Self = StObject.set(x, "bucketValues", js.Array(value*))
    
    inline def setMaxAnonymity(value: String): Self = StObject.set(x, "maxAnonymity", value.asInstanceOf[js.Any])
    
    inline def setMaxAnonymityUndefined: Self = StObject.set(x, "maxAnonymity", js.undefined)
    
    inline def setMinAnonymity(value: String): Self = StObject.set(x, "minAnonymity", value.asInstanceOf[js.Any])
    
    inline def setMinAnonymityUndefined: Self = StObject.set(x, "minAnonymity", js.undefined)
  }
}
