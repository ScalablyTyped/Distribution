package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatAssessmentResult extends Entity {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The result message for each threat assessment.
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  // The threat assessment result type. Possible values are: checkPolicy, rescan.
  var resultType: js.UndefOr[NullableOption[ThreatAssessmentResultType]] = js.native
}
object ThreatAssessmentResult {
  
  @scala.inline
  def apply(): ThreatAssessmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatAssessmentResult]
  }
  
  @scala.inline
  implicit class ThreatAssessmentResultOps[Self <: ThreatAssessmentResult] (val x: Self) extends AnyVal {
    
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
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setResultType(value: NullableOption[ThreatAssessmentResultType]): Self = this.set("resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
    
    @scala.inline
    def setResultTypeNull: Self = this.set("resultType", null)
  }
}
