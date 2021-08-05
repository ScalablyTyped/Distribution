package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InformationProtection
  extends StObject
     with Entity {
  
  var threatAssessmentRequests: js.UndefOr[NullableOption[js.Array[ThreatAssessmentRequest]]] = js.undefined
}
object InformationProtection {
  
  inline def apply(): InformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InformationProtection]
  }
  
  extension [Self <: InformationProtection](x: Self) {
    
    inline def setThreatAssessmentRequests(value: NullableOption[js.Array[ThreatAssessmentRequest]]): Self = StObject.set(x, "threatAssessmentRequests", value.asInstanceOf[js.Any])
    
    inline def setThreatAssessmentRequestsNull: Self = StObject.set(x, "threatAssessmentRequests", null)
    
    inline def setThreatAssessmentRequestsUndefined: Self = StObject.set(x, "threatAssessmentRequests", js.undefined)
    
    inline def setThreatAssessmentRequestsVarargs(value: ThreatAssessmentRequest*): Self = StObject.set(x, "threatAssessmentRequests", js.Array(value :_*))
  }
}
