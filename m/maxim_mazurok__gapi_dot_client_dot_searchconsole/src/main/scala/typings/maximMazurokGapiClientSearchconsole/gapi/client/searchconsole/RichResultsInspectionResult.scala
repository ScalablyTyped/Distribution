package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichResultsInspectionResult extends StObject {
  
  /** A list of zero or more rich results detected on this page. Rich results that cannot even be parsed due to syntactic issues will not be listed here. */
  var detectedItems: js.UndefOr[js.Array[DetectedItems]] = js.undefined
  
  /** High-level rich results inspection result for this URL. */
  var verdict: js.UndefOr[String] = js.undefined
}
object RichResultsInspectionResult {
  
  inline def apply(): RichResultsInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichResultsInspectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichResultsInspectionResult] (val x: Self) extends AnyVal {
    
    inline def setDetectedItems(value: js.Array[DetectedItems]): Self = StObject.set(x, "detectedItems", value.asInstanceOf[js.Any])
    
    inline def setDetectedItemsUndefined: Self = StObject.set(x, "detectedItems", js.undefined)
    
    inline def setDetectedItemsVarargs(value: DetectedItems*): Self = StObject.set(x, "detectedItems", js.Array(value*))
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
