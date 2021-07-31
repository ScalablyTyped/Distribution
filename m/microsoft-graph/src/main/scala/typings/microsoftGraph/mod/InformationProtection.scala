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
  
  @scala.inline
  def apply(): InformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InformationProtection]
  }
  
  @scala.inline
  implicit class InformationProtectionMutableBuilder[Self <: InformationProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreatAssessmentRequests(value: NullableOption[js.Array[ThreatAssessmentRequest]]): Self = StObject.set(x, "threatAssessmentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatAssessmentRequestsNull: Self = StObject.set(x, "threatAssessmentRequests", null)
    
    @scala.inline
    def setThreatAssessmentRequestsUndefined: Self = StObject.set(x, "threatAssessmentRequests", js.undefined)
    
    @scala.inline
    def setThreatAssessmentRequestsVarargs(value: ThreatAssessmentRequest*): Self = StObject.set(x, "threatAssessmentRequests", js.Array(value :_*))
  }
}
