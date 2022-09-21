package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationSubmission
  extends StObject
     with Entity {
  
  var outcomes: js.UndefOr[NullableOption[js.Array[EducationOutcome]]] = js.undefined
  
  // User who moved the status of this submission to reassigned.
  var reassignedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var reassignedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Who this submission is assigned to.
  var recipient: js.UndefOr[NullableOption[EducationSubmissionRecipient]] = js.undefined
  
  var resources: js.UndefOr[NullableOption[js.Array[EducationSubmissionResource]]] = js.undefined
  
  // Folder where all file resources for this submission need to be stored.
  var resourcesFolderUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User who moved the status of this submission to returned.
  var returnedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var returnedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Read-only. Possible values are: working, submitted, released, returned, and reassigned. Note that you must use the
    * Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned.
    */
  var status: js.UndefOr[NullableOption[EducationSubmissionStatus]] = js.undefined
  
  // User who moved the resource into the submitted state.
  var submittedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z
    */
  var submittedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var submittedResources: js.UndefOr[NullableOption[js.Array[EducationSubmissionResource]]] = js.undefined
  
  // User who moved the resource from submitted into the working state.
  var unsubmittedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z
    */
  var unsubmittedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationSubmission {
  
  inline def apply(): EducationSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSubmission]
  }
  
  extension [Self <: EducationSubmission](x: Self) {
    
    inline def setOutcomes(value: NullableOption[js.Array[EducationOutcome]]): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesNull: Self = StObject.set(x, "outcomes", null)
    
    inline def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    inline def setOutcomesVarargs(value: EducationOutcome*): Self = StObject.set(x, "outcomes", js.Array(value*))
    
    inline def setReassignedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "reassignedBy", value.asInstanceOf[js.Any])
    
    inline def setReassignedByNull: Self = StObject.set(x, "reassignedBy", null)
    
    inline def setReassignedByUndefined: Self = StObject.set(x, "reassignedBy", js.undefined)
    
    inline def setReassignedDateTime(value: NullableOption[String]): Self = StObject.set(x, "reassignedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReassignedDateTimeNull: Self = StObject.set(x, "reassignedDateTime", null)
    
    inline def setReassignedDateTimeUndefined: Self = StObject.set(x, "reassignedDateTime", js.undefined)
    
    inline def setRecipient(value: NullableOption[EducationSubmissionRecipient]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientNull: Self = StObject.set(x, "recipient", null)
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setResources(value: NullableOption[js.Array[EducationSubmissionResource]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesFolderUrl(value: NullableOption[String]): Self = StObject.set(x, "resourcesFolderUrl", value.asInstanceOf[js.Any])
    
    inline def setResourcesFolderUrlNull: Self = StObject.set(x, "resourcesFolderUrl", null)
    
    inline def setResourcesFolderUrlUndefined: Self = StObject.set(x, "resourcesFolderUrl", js.undefined)
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: EducationSubmissionResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setReturnedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "returnedBy", value.asInstanceOf[js.Any])
    
    inline def setReturnedByNull: Self = StObject.set(x, "returnedBy", null)
    
    inline def setReturnedByUndefined: Self = StObject.set(x, "returnedBy", js.undefined)
    
    inline def setReturnedDateTime(value: NullableOption[String]): Self = StObject.set(x, "returnedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReturnedDateTimeNull: Self = StObject.set(x, "returnedDateTime", null)
    
    inline def setReturnedDateTimeUndefined: Self = StObject.set(x, "returnedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[EducationSubmissionStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubmittedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "submittedBy", value.asInstanceOf[js.Any])
    
    inline def setSubmittedByNull: Self = StObject.set(x, "submittedBy", null)
    
    inline def setSubmittedByUndefined: Self = StObject.set(x, "submittedBy", js.undefined)
    
    inline def setSubmittedDateTime(value: NullableOption[String]): Self = StObject.set(x, "submittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDateTimeNull: Self = StObject.set(x, "submittedDateTime", null)
    
    inline def setSubmittedDateTimeUndefined: Self = StObject.set(x, "submittedDateTime", js.undefined)
    
    inline def setSubmittedResources(value: NullableOption[js.Array[EducationSubmissionResource]]): Self = StObject.set(x, "submittedResources", value.asInstanceOf[js.Any])
    
    inline def setSubmittedResourcesNull: Self = StObject.set(x, "submittedResources", null)
    
    inline def setSubmittedResourcesUndefined: Self = StObject.set(x, "submittedResources", js.undefined)
    
    inline def setSubmittedResourcesVarargs(value: EducationSubmissionResource*): Self = StObject.set(x, "submittedResources", js.Array(value*))
    
    inline def setUnsubmittedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "unsubmittedBy", value.asInstanceOf[js.Any])
    
    inline def setUnsubmittedByNull: Self = StObject.set(x, "unsubmittedBy", null)
    
    inline def setUnsubmittedByUndefined: Self = StObject.set(x, "unsubmittedBy", js.undefined)
    
    inline def setUnsubmittedDateTime(value: NullableOption[String]): Self = StObject.set(x, "unsubmittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setUnsubmittedDateTimeNull: Self = StObject.set(x, "unsubmittedDateTime", null)
    
    inline def setUnsubmittedDateTimeUndefined: Self = StObject.set(x, "unsubmittedDateTime", js.undefined)
  }
}
