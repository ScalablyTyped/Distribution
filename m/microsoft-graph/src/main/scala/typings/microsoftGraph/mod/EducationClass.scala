package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationClass
  extends StObject
     with Entity {
  
  // Class code used by the school to identify the class.
  var classCode: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  
  // How this class was created. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.undefined
  
  // The directory group corresponding to this class.
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
  
  @scala.inline
  def apply(): EducationClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationClass]
  }
  
  @scala.inline
  implicit class EducationClassMutableBuilder[Self <: EducationClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassCode(value: NullableOption[String]): Self = StObject.set(x, "classCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassCodeNull: Self = StObject.set(x, "classCode", null)
    
    @scala.inline
    def setClassCodeUndefined: Self = StObject.set(x, "classCode", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setExternalName(value: NullableOption[String]): Self = StObject.set(x, "externalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalNameNull: Self = StObject.set(x, "externalName", null)
    
    @scala.inline
    def setExternalNameUndefined: Self = StObject.set(x, "externalName", js.undefined)
    
    @scala.inline
    def setExternalSource(value: NullableOption[EducationExternalSource]): Self = StObject.set(x, "externalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalSourceNull: Self = StObject.set(x, "externalSource", null)
    
    @scala.inline
    def setExternalSourceUndefined: Self = StObject.set(x, "externalSource", js.undefined)
    
    @scala.inline
    def setGroup(value: NullableOption[Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setMailNickname(value: String): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: EducationUser*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchoolsNull: Self = StObject.set(x, "schools", null)
    
    @scala.inline
    def setSchoolsUndefined: Self = StObject.set(x, "schools", js.undefined)
    
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = StObject.set(x, "schools", js.Array(value :_*))
    
    @scala.inline
    def setTeachers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeachersNull: Self = StObject.set(x, "teachers", null)
    
    @scala.inline
    def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
    
    @scala.inline
    def setTeachersVarargs(value: EducationUser*): Self = StObject.set(x, "teachers", js.Array(value :_*))
    
    @scala.inline
    def setTerm(value: NullableOption[EducationTerm]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermNull: Self = StObject.set(x, "term", null)
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
  }
}
