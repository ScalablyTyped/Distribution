package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KAnonymityResult extends StObject {
  
  /** Histogram of k-anonymity equivalence classes. */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.undefined
}
object GooglePrivacyDlpV2KAnonymityResult {
  
  inline def apply(): GooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KAnonymityResult]
  }
  
  extension [Self <: GooglePrivacyDlpV2KAnonymityResult](x: Self) {
    
    inline def setEquivalenceClassHistogramBuckets(value: js.Array[GooglePrivacyDlpV2KAnonymityHistogramBucket]): Self = StObject.set(x, "equivalenceClassHistogramBuckets", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassHistogramBucketsUndefined: Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.undefined)
    
    inline def setEquivalenceClassHistogramBucketsVarargs(value: GooglePrivacyDlpV2KAnonymityHistogramBucket*): Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.Array(value :_*))
  }
}
