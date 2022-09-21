package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TransformationOverview extends StObject {
  
  /** Transformations applied to the dataset. */
  var transformationSummaries: js.UndefOr[js.Array[GooglePrivacyDlpV2TransformationSummary]] = js.undefined
  
  /** Total size in bytes that were transformed in some way. */
  var transformedBytes: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2TransformationOverview {
  
  inline def apply(): GooglePrivacyDlpV2TransformationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationOverview]
  }
  
  extension [Self <: GooglePrivacyDlpV2TransformationOverview](x: Self) {
    
    inline def setTransformationSummaries(value: js.Array[GooglePrivacyDlpV2TransformationSummary]): Self = StObject.set(x, "transformationSummaries", value.asInstanceOf[js.Any])
    
    inline def setTransformationSummariesUndefined: Self = StObject.set(x, "transformationSummaries", js.undefined)
    
    inline def setTransformationSummariesVarargs(value: GooglePrivacyDlpV2TransformationSummary*): Self = StObject.set(x, "transformationSummaries", js.Array(value*))
    
    inline def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    inline def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
