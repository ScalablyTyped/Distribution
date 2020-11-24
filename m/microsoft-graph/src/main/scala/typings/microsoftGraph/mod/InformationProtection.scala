package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InformationProtection extends Entity {
  
  var threatAssessmentRequests: js.UndefOr[NullableOption[js.Array[ThreatAssessmentRequest]]] = js.native
}
object InformationProtection {
  
  @scala.inline
  def apply(): InformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InformationProtection]
  }
  
  @scala.inline
  implicit class InformationProtectionOps[Self <: InformationProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThreatAssessmentRequestsVarargs(value: ThreatAssessmentRequest*): Self = this.set("threatAssessmentRequests", js.Array(value :_*))
    
    @scala.inline
    def setThreatAssessmentRequests(value: NullableOption[js.Array[ThreatAssessmentRequest]]): Self = this.set("threatAssessmentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatAssessmentRequests: Self = this.set("threatAssessmentRequests", js.undefined)
    
    @scala.inline
    def setThreatAssessmentRequestsNull: Self = this.set("threatAssessmentRequests", null)
  }
}
