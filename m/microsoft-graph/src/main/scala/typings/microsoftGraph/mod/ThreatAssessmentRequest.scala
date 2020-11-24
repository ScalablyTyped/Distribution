package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatAssessmentRequest extends Entity {
  
  // The threat category. Possible values are: spam, phishing, malware.
  var category: js.UndefOr[ThreatCategory] = js.native
  
  // The content type of threat assessment. Possible values are: mail, url, file.
  var contentType: js.UndefOr[NullableOption[ThreatAssessmentContentType]] = js.native
  
  // The threat assessment request creator.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The expected assessment from submitter. Possible values are: block, unblock.
  var expectedAssessment: js.UndefOr[ThreatExpectedAssessment] = js.native
  
  // The source of the threat assessment request. Possible values are: user, administrator.
  var requestSource: js.UndefOr[NullableOption[ThreatAssessmentRequestSource]] = js.native
  
  /**
    * A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return
    * this property unless you apply $expand on it.
    */
  var results: js.UndefOr[NullableOption[js.Array[ThreatAssessmentResult]]] = js.native
  
  // The assessment process status. Possible values are: pending, completed.
  var status: js.UndefOr[NullableOption[ThreatAssessmentStatus]] = js.native
}
object ThreatAssessmentRequest {
  
  @scala.inline
  def apply(): ThreatAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatAssessmentRequest]
  }
  
  @scala.inline
  implicit class ThreatAssessmentRequestOps[Self <: ThreatAssessmentRequest] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: ThreatCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContentType(value: NullableOption[ThreatAssessmentContentType]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentTypeNull: Self = this.set("contentType", null)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setExpectedAssessment(value: ThreatExpectedAssessment): Self = this.set("expectedAssessment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedAssessment: Self = this.set("expectedAssessment", js.undefined)
    
    @scala.inline
    def setRequestSource(value: NullableOption[ThreatAssessmentRequestSource]): Self = this.set("requestSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestSource: Self = this.set("requestSource", js.undefined)
    
    @scala.inline
    def setRequestSourceNull: Self = this.set("requestSource", null)
    
    @scala.inline
    def setResultsVarargs(value: ThreatAssessmentResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: NullableOption[js.Array[ThreatAssessmentResult]]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setResultsNull: Self = this.set("results", null)
    
    @scala.inline
    def setStatus(value: NullableOption[ThreatAssessmentStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
