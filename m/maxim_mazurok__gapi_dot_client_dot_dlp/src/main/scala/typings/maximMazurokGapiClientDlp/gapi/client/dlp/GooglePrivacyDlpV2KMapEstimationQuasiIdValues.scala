package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KMapEstimationQuasiIdValues extends StObject {
  
  /** The estimated anonymity for these quasi-identifier values. */
  var estimatedAnonymity: js.UndefOr[String] = js.undefined
  
  /** The quasi-identifier values. */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.undefined
}
object GooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  
  inline def apply(): GooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
  
  extension [Self <: GooglePrivacyDlpV2KMapEstimationQuasiIdValues](x: Self) {
    
    inline def setEstimatedAnonymity(value: String): Self = StObject.set(x, "estimatedAnonymity", value.asInstanceOf[js.Any])
    
    inline def setEstimatedAnonymityUndefined: Self = StObject.set(x, "estimatedAnonymity", js.undefined)
    
    inline def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    inline def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
  }
}
