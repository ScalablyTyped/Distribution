package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InformationProtection extends StObject {
  
  var bitlocker: js.UndefOr[NullableOption[Bitlocker]] = js.undefined
  
  var threatAssessmentRequests: js.UndefOr[NullableOption[js.Array[ThreatAssessmentRequest]]] = js.undefined
}
object InformationProtection {
  
  inline def apply(): InformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InformationProtection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InformationProtection] (val x: Self) extends AnyVal {
    
    inline def setBitlocker(value: NullableOption[Bitlocker]): Self = StObject.set(x, "bitlocker", value.asInstanceOf[js.Any])
    
    inline def setBitlockerNull: Self = StObject.set(x, "bitlocker", null)
    
    inline def setBitlockerUndefined: Self = StObject.set(x, "bitlocker", js.undefined)
    
    inline def setThreatAssessmentRequests(value: NullableOption[js.Array[ThreatAssessmentRequest]]): Self = StObject.set(x, "threatAssessmentRequests", value.asInstanceOf[js.Any])
    
    inline def setThreatAssessmentRequestsNull: Self = StObject.set(x, "threatAssessmentRequests", null)
    
    inline def setThreatAssessmentRequestsUndefined: Self = StObject.set(x, "threatAssessmentRequests", js.undefined)
    
    inline def setThreatAssessmentRequestsVarargs(value: ThreatAssessmentRequest*): Self = StObject.set(x, "threatAssessmentRequests", js.Array(value*))
  }
}
