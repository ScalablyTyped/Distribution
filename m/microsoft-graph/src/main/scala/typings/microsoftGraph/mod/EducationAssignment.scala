package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignment
  extends StObject
     with Entity {
  
  /**
    * Optional field to control the assignment behavior for adding assignments to students' and teachers' calendars when the
    * assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners,
    * unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to
    * get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
    */
  var addToCalendarAction: js.UndefOr[NullableOption[EducationAddToCalendarOptions]] = js.undefined
  
  /**
    * Optional field to control the assignment behavior for students who are added after the assignment is published. If not
    * specified, defaults to none value. Currently supports only two values: none or assignIfOpen.
    */
  var addedStudentAction: js.UndefOr[NullableOption[EducationAddedStudentAction]] = js.undefined
  
  /**
    * Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults
    * to true.
    */
  var allowLateSubmissions: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Identifies whether students can add their own resources to a submission or if they can only modify resources added by
    * the teacher.
    */
  var allowStudentsToAddResourcesToSubmission: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The date when the assignment should become active. If in the future, the assignment isn't shown to the student until
    * this date. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
    * example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var assignDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Which users, or whole class should receive a submission object once the assignment is published.
  var assignTo: js.UndefOr[NullableOption[EducationAssignmentRecipient]] = js.undefined
  
  /**
    * The moment that the assignment was published to students and the assignment shows up on the students timeline. The
    * Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var assignedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When set, enables users to easily find assignments of a given type. Read-only. Nullable.
  var categories: js.UndefOr[NullableOption[js.Array[EducationCategory]]] = js.undefined
  
  // Class which this assignment belongs.
  var classId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment
    * does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the
    * closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var closeDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Who created the assignment.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment when the assignment was created. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the assignment.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Date when the students assignment is due. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var dueDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // How the assignment will be graded.
  var grading: js.UndefOr[NullableOption[EducationAssignmentGradeType]] = js.undefined
  
  // Instructions for the assignment. This along with the display name tell the student what to do.
  var instructions: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
  
  // Who last modified the assignment.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment when the assignment was last modified. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null,
    * defaults to the General channel. This field only applies to assignments where the assignTo value is
    * educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been
    * published.
    */
  var notificationChannelUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Learning objects that are associated with this assignment. Only teachers can modify this list. Nullable.
  var resources: js.UndefOr[NullableOption[js.Array[EducationAssignmentResource]]] = js.undefined
  
  // Folder URL where all the file resources for this assignment are stored.
  var resourcesFolderUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When set, the grading rubric attached to this assignment.
  var rubric: js.UndefOr[NullableOption[EducationRubric]] = js.undefined
  
  // Status of the Assignment. You can't PATCH this value. Possible values are: draft, scheduled, published, assigned.
  var status: js.UndefOr[NullableOption[EducationAssignmentStatus]] = js.undefined
  
  // Once published, there is a submission object for each student representing their work and grade. Read-only. Nullable.
  var submissions: js.UndefOr[NullableOption[js.Array[EducationSubmission]]] = js.undefined
  
  // The deep link URL for the given assignment.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationAssignment {
  
  inline def apply(): EducationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignment]
  }
  
  extension [Self <: EducationAssignment](x: Self) {
    
    inline def setAddToCalendarAction(value: NullableOption[EducationAddToCalendarOptions]): Self = StObject.set(x, "addToCalendarAction", value.asInstanceOf[js.Any])
    
    inline def setAddToCalendarActionNull: Self = StObject.set(x, "addToCalendarAction", null)
    
    inline def setAddToCalendarActionUndefined: Self = StObject.set(x, "addToCalendarAction", js.undefined)
    
    inline def setAddedStudentAction(value: NullableOption[EducationAddedStudentAction]): Self = StObject.set(x, "addedStudentAction", value.asInstanceOf[js.Any])
    
    inline def setAddedStudentActionNull: Self = StObject.set(x, "addedStudentAction", null)
    
    inline def setAddedStudentActionUndefined: Self = StObject.set(x, "addedStudentAction", js.undefined)
    
    inline def setAllowLateSubmissions(value: NullableOption[Boolean]): Self = StObject.set(x, "allowLateSubmissions", value.asInstanceOf[js.Any])
    
    inline def setAllowLateSubmissionsNull: Self = StObject.set(x, "allowLateSubmissions", null)
    
    inline def setAllowLateSubmissionsUndefined: Self = StObject.set(x, "allowLateSubmissions", js.undefined)
    
    inline def setAllowStudentsToAddResourcesToSubmission(value: NullableOption[Boolean]): Self = StObject.set(x, "allowStudentsToAddResourcesToSubmission", value.asInstanceOf[js.Any])
    
    inline def setAllowStudentsToAddResourcesToSubmissionNull: Self = StObject.set(x, "allowStudentsToAddResourcesToSubmission", null)
    
    inline def setAllowStudentsToAddResourcesToSubmissionUndefined: Self = StObject.set(x, "allowStudentsToAddResourcesToSubmission", js.undefined)
    
    inline def setAssignDateTime(value: NullableOption[String]): Self = StObject.set(x, "assignDateTime", value.asInstanceOf[js.Any])
    
    inline def setAssignDateTimeNull: Self = StObject.set(x, "assignDateTime", null)
    
    inline def setAssignDateTimeUndefined: Self = StObject.set(x, "assignDateTime", js.undefined)
    
    inline def setAssignTo(value: NullableOption[EducationAssignmentRecipient]): Self = StObject.set(x, "assignTo", value.asInstanceOf[js.Any])
    
    inline def setAssignToNull: Self = StObject.set(x, "assignTo", null)
    
    inline def setAssignToUndefined: Self = StObject.set(x, "assignTo", js.undefined)
    
    inline def setAssignedDateTime(value: NullableOption[String]): Self = StObject.set(x, "assignedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAssignedDateTimeNull: Self = StObject.set(x, "assignedDateTime", null)
    
    inline def setAssignedDateTimeUndefined: Self = StObject.set(x, "assignedDateTime", js.undefined)
    
    inline def setCategories(value: NullableOption[js.Array[EducationCategory]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: EducationCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setClassId(value: NullableOption[String]): Self = StObject.set(x, "classId", value.asInstanceOf[js.Any])
    
    inline def setClassIdNull: Self = StObject.set(x, "classId", null)
    
    inline def setClassIdUndefined: Self = StObject.set(x, "classId", js.undefined)
    
    inline def setCloseDateTime(value: NullableOption[String]): Self = StObject.set(x, "closeDateTime", value.asInstanceOf[js.Any])
    
    inline def setCloseDateTimeNull: Self = StObject.set(x, "closeDateTime", null)
    
    inline def setCloseDateTimeUndefined: Self = StObject.set(x, "closeDateTime", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDueDateTime(value: NullableOption[String]): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDueDateTimeNull: Self = StObject.set(x, "dueDateTime", null)
    
    inline def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    inline def setGrading(value: NullableOption[EducationAssignmentGradeType]): Self = StObject.set(x, "grading", value.asInstanceOf[js.Any])
    
    inline def setGradingNull: Self = StObject.set(x, "grading", null)
    
    inline def setGradingUndefined: Self = StObject.set(x, "grading", js.undefined)
    
    inline def setInstructions(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsNull: Self = StObject.set(x, "instructions", null)
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setNotificationChannelUrl(value: NullableOption[String]): Self = StObject.set(x, "notificationChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUrlNull: Self = StObject.set(x, "notificationChannelUrl", null)
    
    inline def setNotificationChannelUrlUndefined: Self = StObject.set(x, "notificationChannelUrl", js.undefined)
    
    inline def setResources(value: NullableOption[js.Array[EducationAssignmentResource]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesFolderUrl(value: NullableOption[String]): Self = StObject.set(x, "resourcesFolderUrl", value.asInstanceOf[js.Any])
    
    inline def setResourcesFolderUrlNull: Self = StObject.set(x, "resourcesFolderUrl", null)
    
    inline def setResourcesFolderUrlUndefined: Self = StObject.set(x, "resourcesFolderUrl", js.undefined)
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: EducationAssignmentResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRubric(value: NullableOption[EducationRubric]): Self = StObject.set(x, "rubric", value.asInstanceOf[js.Any])
    
    inline def setRubricNull: Self = StObject.set(x, "rubric", null)
    
    inline def setRubricUndefined: Self = StObject.set(x, "rubric", js.undefined)
    
    inline def setStatus(value: NullableOption[EducationAssignmentStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubmissions(value: NullableOption[js.Array[EducationSubmission]]): Self = StObject.set(x, "submissions", value.asInstanceOf[js.Any])
    
    inline def setSubmissionsNull: Self = StObject.set(x, "submissions", null)
    
    inline def setSubmissionsUndefined: Self = StObject.set(x, "submissions", js.undefined)
    
    inline def setSubmissionsVarargs(value: EducationSubmission*): Self = StObject.set(x, "submissions", js.Array(value*))
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
