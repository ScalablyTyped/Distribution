package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileUsabilityInspectionResult extends StObject {
  
  /** A list of zero or more mobile-usability issues detected for this URL. */
  var issues: js.UndefOr[js.Array[MobileUsabilityIssue]] = js.undefined
  
  /** High-level mobile-usability inspection result for this URL. */
  var verdict: js.UndefOr[String] = js.undefined
}
object MobileUsabilityInspectionResult {
  
  inline def apply(): MobileUsabilityInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileUsabilityInspectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileUsabilityInspectionResult] (val x: Self) extends AnyVal {
    
    inline def setIssues(value: js.Array[MobileUsabilityIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: MobileUsabilityIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
