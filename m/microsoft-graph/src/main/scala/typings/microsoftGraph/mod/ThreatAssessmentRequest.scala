package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatAssessmentRequest
  extends StObject
     with Entity {
  
  // The threat category. Possible values are: spam, phishing, malware.
  var category: js.UndefOr[ThreatCategory] = js.undefined
  
  // The content type of threat assessment. Possible values are: mail, url, file.
  var contentType: js.UndefOr[NullableOption[ThreatAssessmentContentType]] = js.undefined
  
  // The threat assessment request creator.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The expected assessment from submitter. Possible values are: block, unblock.
  var expectedAssessment: js.UndefOr[ThreatExpectedAssessment] = js.undefined
  
  // The source of the threat assessment request. Possible values are: user, administrator.
  var requestSource: js.UndefOr[NullableOption[ThreatAssessmentRequestSource]] = js.undefined
  
  /**
    * A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return
    * this property unless you apply $expand on it.
    */
  var results: js.UndefOr[NullableOption[js.Array[ThreatAssessmentResult]]] = js.undefined
  
  // The assessment process status. Possible values are: pending, completed.
  var status: js.UndefOr[NullableOption[ThreatAssessmentStatus]] = js.undefined
}
object ThreatAssessmentRequest {
  
  @scala.inline
  def apply(): ThreatAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatAssessmentRequest]
  }
  
  @scala.inline
  implicit class ThreatAssessmentRequestMutableBuilder[Self <: ThreatAssessmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ThreatCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContentType(value: NullableOption[ThreatAssessmentContentType]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setExpectedAssessment(value: ThreatExpectedAssessment): Self = StObject.set(x, "expectedAssessment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedAssessmentUndefined: Self = StObject.set(x, "expectedAssessment", js.undefined)
    
    @scala.inline
    def setRequestSource(value: NullableOption[ThreatAssessmentRequestSource]): Self = StObject.set(x, "requestSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSourceNull: Self = StObject.set(x, "requestSource", null)
    
    @scala.inline
    def setRequestSourceUndefined: Self = StObject.set(x, "requestSource", js.undefined)
    
    @scala.inline
    def setResults(value: NullableOption[js.Array[ThreatAssessmentResult]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsNull: Self = StObject.set(x, "results", null)
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: ThreatAssessmentResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: NullableOption[ThreatAssessmentStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
