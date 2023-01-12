package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationClass
  extends StObject
     with Entity {
  
  // All categories associated with this class. Nullable.
  var assignmentCategories: js.UndefOr[NullableOption[js.Array[EducationCategory]]] = js.undefined
  
  // Specifies class-level defaults respected by new assignments created in the class.
  var assignmentDefaults: js.UndefOr[NullableOption[EducationAssignmentDefaults]] = js.undefined
  
  // Specifies class-level assignments settings.
  var assignmentSettings: js.UndefOr[NullableOption[EducationAssignmentSettings]] = js.undefined
  
  // All assignments associated with this class. Nullable.
  var assignments: js.UndefOr[NullableOption[js.Array[EducationAssignment]]] = js.undefined
  
  // Class code used by the school to identify the class.
  var classCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  var course: js.UndefOr[NullableOption[EducationCourse]] = js.undefined
  
  // Entity who created the class
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Description of the class.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the class.
  var displayName: js.UndefOr[String] = js.undefined
  
  // ID of the class from the syncing system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the class in the syncing system.
  var externalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // How this class was created. Possible values are: sis, manual.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.undefined
  
  // The name of the external source this resources was generated from.
  var externalSourceDetail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Grade level of the class.
  var grade: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The underlying Microsoft 365 group object.
  var group: js.UndefOr[NullableOption[Group]] = js.undefined
  
  // Mail name for sending email to all members, if this is enabled.
  var mailNickname: js.UndefOr[String] = js.undefined
  
  // All users in the class. Nullable.
  var members: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.undefined
  
  // All schools that this class is associated with. Nullable.
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.undefined
  
  // All teachers in the class. Nullable.
  var teachers: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.undefined
  
  // Term for this class.
  var term: js.UndefOr[NullableOption[EducationTerm]] = js.undefined
}
object EducationClass {
  
  inline def apply(): EducationClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationClass] (val x: Self) extends AnyVal {
    
    inline def setAssignmentCategories(value: NullableOption[js.Array[EducationCategory]]): Self = StObject.set(x, "assignmentCategories", value.asInstanceOf[js.Any])
    
    inline def setAssignmentCategoriesNull: Self = StObject.set(x, "assignmentCategories", null)
    
    inline def setAssignmentCategoriesUndefined: Self = StObject.set(x, "assignmentCategories", js.undefined)
    
    inline def setAssignmentCategoriesVarargs(value: EducationCategory*): Self = StObject.set(x, "assignmentCategories", js.Array(value*))
    
    inline def setAssignmentDefaults(value: NullableOption[EducationAssignmentDefaults]): Self = StObject.set(x, "assignmentDefaults", value.asInstanceOf[js.Any])
    
    inline def setAssignmentDefaultsNull: Self = StObject.set(x, "assignmentDefaults", null)
    
    inline def setAssignmentDefaultsUndefined: Self = StObject.set(x, "assignmentDefaults", js.undefined)
    
    inline def setAssignmentSettings(value: NullableOption[EducationAssignmentSettings]): Self = StObject.set(x, "assignmentSettings", value.asInstanceOf[js.Any])
    
    inline def setAssignmentSettingsNull: Self = StObject.set(x, "assignmentSettings", null)
    
    inline def setAssignmentSettingsUndefined: Self = StObject.set(x, "assignmentSettings", js.undefined)
    
    inline def setAssignments(value: NullableOption[js.Array[EducationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: EducationAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setClassCode(value: NullableOption[String]): Self = StObject.set(x, "classCode", value.asInstanceOf[js.Any])
    
    inline def setClassCodeNull: Self = StObject.set(x, "classCode", null)
    
    inline def setClassCodeUndefined: Self = StObject.set(x, "classCode", js.undefined)
    
    inline def setCourse(value: NullableOption[EducationCourse]): Self = StObject.set(x, "course", value.asInstanceOf[js.Any])
    
    inline def setCourseNull: Self = StObject.set(x, "course", null)
    
    inline def setCourseUndefined: Self = StObject.set(x, "course", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setExternalName(value: NullableOption[String]): Self = StObject.set(x, "externalName", value.asInstanceOf[js.Any])
    
    inline def setExternalNameNull: Self = StObject.set(x, "externalName", null)
    
    inline def setExternalNameUndefined: Self = StObject.set(x, "externalName", js.undefined)
    
    inline def setExternalSource(value: NullableOption[EducationExternalSource]): Self = StObject.set(x, "externalSource", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceDetail(value: NullableOption[String]): Self = StObject.set(x, "externalSourceDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceDetailNull: Self = StObject.set(x, "externalSourceDetail", null)
    
    inline def setExternalSourceDetailUndefined: Self = StObject.set(x, "externalSourceDetail", js.undefined)
    
    inline def setExternalSourceNull: Self = StObject.set(x, "externalSource", null)
    
    inline def setExternalSourceUndefined: Self = StObject.set(x, "externalSource", js.undefined)
    
    inline def setGrade(value: NullableOption[String]): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    inline def setGradeNull: Self = StObject.set(x, "grade", null)
    
    inline def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    inline def setGroup(value: NullableOption[Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMailNickname(value: String): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    inline def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: EducationUser*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
    
    inline def setSchoolsNull: Self = StObject.set(x, "schools", null)
    
    inline def setSchoolsUndefined: Self = StObject.set(x, "schools", js.undefined)
    
    inline def setSchoolsVarargs(value: EducationSchool*): Self = StObject.set(x, "schools", js.Array(value*))
    
    inline def setTeachers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
    
    inline def setTeachersNull: Self = StObject.set(x, "teachers", null)
    
    inline def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
    
    inline def setTeachersVarargs(value: EducationUser*): Self = StObject.set(x, "teachers", js.Array(value*))
    
    inline def setTerm(value: NullableOption[EducationTerm]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermNull: Self = StObject.set(x, "term", null)
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
  }
}
