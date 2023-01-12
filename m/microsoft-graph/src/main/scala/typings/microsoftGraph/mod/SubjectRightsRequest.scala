package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectRightsRequest
  extends StObject
     with Entity {
  
  // Identity that the request is assigned to.
  var assignedTo: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  /**
    * The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var closedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity information for the entity that created the request.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Information about the data subject.
  var dataSubject: js.UndefOr[NullableOption[DataSubject]] = js.undefined
  
  /**
    * The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee,
    * student, teacher, faculty, other, unknownFutureValue.
    */
  var dataSubjectType: js.UndefOr[NullableOption[DataSubjectType]] = js.undefined
  
  // Description for the request.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the request.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Collection of history change events.
  var history: js.UndefOr[NullableOption[js.Array[SubjectRightsRequestHistory]]] = js.undefined
  
  // Insight about the request.
  var insight: js.UndefOr[NullableOption[SubjectRightsRequestDetail]] = js.undefined
  
  /**
    * The date and time when the request is internally due. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var internalDueDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity information for the entity that last modified the request.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The date and time when the request was last modified. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of notes associcated with the request.
  var notes: js.UndefOr[NullableOption[js.Array[AuthoredNote]]] = js.undefined
  
  // List of regulations that this request will fulfill.
  var regulations: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Information about the different stages for the request.
  var stages: js.UndefOr[NullableOption[js.Array[SubjectRightsRequestStageDetail]]] = js.undefined
  
  // The status of the request.. Possible values are: active, closed, unknownFutureValue.
  var status: js.UndefOr[NullableOption[SubjectRightsRequestStatus]] = js.undefined
  
  // Information about the Microsoft Teams team that was created for the request.
  var team: js.UndefOr[NullableOption[Team]] = js.undefined
  
  // The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue.
  var `type`: js.UndefOr[NullableOption[SubjectRightsRequestType]] = js.undefined
}
object SubjectRightsRequest {
  
  inline def apply(): SubjectRightsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectRightsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectRightsRequest] (val x: Self) extends AnyVal {
    
    inline def setAssignedTo(value: NullableOption[Identity]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setClosedDateTime(value: NullableOption[String]): Self = StObject.set(x, "closedDateTime", value.asInstanceOf[js.Any])
    
    inline def setClosedDateTimeNull: Self = StObject.set(x, "closedDateTime", null)
    
    inline def setClosedDateTimeUndefined: Self = StObject.set(x, "closedDateTime", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDataSubject(value: NullableOption[DataSubject]): Self = StObject.set(x, "dataSubject", value.asInstanceOf[js.Any])
    
    inline def setDataSubjectNull: Self = StObject.set(x, "dataSubject", null)
    
    inline def setDataSubjectType(value: NullableOption[DataSubjectType]): Self = StObject.set(x, "dataSubjectType", value.asInstanceOf[js.Any])
    
    inline def setDataSubjectTypeNull: Self = StObject.set(x, "dataSubjectType", null)
    
    inline def setDataSubjectTypeUndefined: Self = StObject.set(x, "dataSubjectType", js.undefined)
    
    inline def setDataSubjectUndefined: Self = StObject.set(x, "dataSubject", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHistory(value: NullableOption[js.Array[SubjectRightsRequestHistory]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: SubjectRightsRequestHistory*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setInsight(value: NullableOption[SubjectRightsRequestDetail]): Self = StObject.set(x, "insight", value.asInstanceOf[js.Any])
    
    inline def setInsightNull: Self = StObject.set(x, "insight", null)
    
    inline def setInsightUndefined: Self = StObject.set(x, "insight", js.undefined)
    
    inline def setInternalDueDateTime(value: NullableOption[String]): Self = StObject.set(x, "internalDueDateTime", value.asInstanceOf[js.Any])
    
    inline def setInternalDueDateTimeNull: Self = StObject.set(x, "internalDueDateTime", null)
    
    inline def setInternalDueDateTimeUndefined: Self = StObject.set(x, "internalDueDateTime", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setNotes(value: NullableOption[js.Array[AuthoredNote]]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: AuthoredNote*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setRegulations(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "regulations", value.asInstanceOf[js.Any])
    
    inline def setRegulationsNull: Self = StObject.set(x, "regulations", null)
    
    inline def setRegulationsUndefined: Self = StObject.set(x, "regulations", js.undefined)
    
    inline def setRegulationsVarargs(value: String*): Self = StObject.set(x, "regulations", js.Array(value*))
    
    inline def setStages(value: NullableOption[js.Array[SubjectRightsRequestStageDetail]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesNull: Self = StObject.set(x, "stages", null)
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: SubjectRightsRequestStageDetail*): Self = StObject.set(x, "stages", js.Array(value*))
    
    inline def setStatus(value: NullableOption[SubjectRightsRequestStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTeam(value: NullableOption[Team]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamNull: Self = StObject.set(x, "team", null)
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setType(value: NullableOption[SubjectRightsRequestType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
