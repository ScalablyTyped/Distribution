package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DeltaPresenceEstimationResult extends StObject {
  
  /**
    * The intervals [min_probability, max_probability) do not overlap. If a value doesn't correspond to any such interval, the associated frequency is zero. For example, the following
    * records: {min_probability: 0, max_probability: 0.1, frequency: 17} {min_probability: 0.2, max_probability: 0.3, frequency: 42} {min_probability: 0.3, max_probability: 0.4,
    * frequency: 99} mean that there are no record with an estimated probability in [0.1, 0.2) nor larger or equal to 0.4.
    */
  var deltaPresenceEstimationHistogram: js.UndefOr[js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]] = js.undefined
}
object GooglePrivacyDlpV2DeltaPresenceEstimationResult {
  
  inline def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationResult]
  }
  
  extension [Self <: GooglePrivacyDlpV2DeltaPresenceEstimationResult](x: Self) {
    
    inline def setDeltaPresenceEstimationHistogram(value: js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]): Self = StObject.set(x, "deltaPresenceEstimationHistogram", value.asInstanceOf[js.Any])
    
    inline def setDeltaPresenceEstimationHistogramUndefined: Self = StObject.set(x, "deltaPresenceEstimationHistogram", js.undefined)
    
    inline def setDeltaPresenceEstimationHistogramVarargs(value: GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket*): Self = StObject.set(x, "deltaPresenceEstimationHistogram", js.Array(value*))
  }
}
