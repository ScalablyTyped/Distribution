package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationClass extends Entity {
  // Class code used by the school to identify the class.
  var classCode: js.UndefOr[String] = js.native
  // Entity who created the class
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // Description of the class.
  var description: js.UndefOr[String] = js.native
  // Name of the class.
  var displayName: js.UndefOr[String] = js.native
  // ID of the class from the syncing system.
  var externalId: js.UndefOr[String] = js.native
  // Name of the class in the syncing system.
  var externalName: js.UndefOr[String] = js.native
  // How this class was created. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[EducationExternalSource] = js.native
  // The directory group corresponding to this class.
  var group: js.UndefOr[Group] = js.native
  // Mail name for sending email to all members, if this is enabled.
  var mailNickname: js.UndefOr[String] = js.native
  // All users in the class. Nullable.
  var members: js.UndefOr[js.Array[EducationUser]] = js.native
  // All schools that this class is associated with. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.native
  // All teachers in the class. Nullable.
  var teachers: js.UndefOr[js.Array[EducationUser]] = js.native
  // Term for this class.
  var term: js.UndefOr[EducationTerm] = js.native
}

object EducationClass {
  @scala.inline
  def apply(): EducationClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationClass]
  }
  @scala.inline
  implicit class EducationClassOps[Self <: EducationClass] (val x: Self) extends AnyVal {
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
    def setClassCode(value: String): Self = this.set("classCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassCode: Self = this.set("classCode", js.undefined)
    @scala.inline
    def setCreatedBy(value: IdentitySet): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setExternalName(value: String): Self = this.set("externalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalName: Self = this.set("externalName", js.undefined)
    @scala.inline
    def setExternalSource(value: EducationExternalSource): Self = this.set("externalSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalSource: Self = this.set("externalSource", js.undefined)
    @scala.inline
    def setGroup(value: Group): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setMailNickname(value: String): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    @scala.inline
    def setMembersVarargs(value: EducationUser*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[EducationUser]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = this.set("schools", js.Array(value :_*))
    @scala.inline
    def setSchools(value: js.Array[EducationSchool]): Self = this.set("schools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchools: Self = this.set("schools", js.undefined)
    @scala.inline
    def setTeachersVarargs(value: EducationUser*): Self = this.set("teachers", js.Array(value :_*))
    @scala.inline
    def setTeachers(value: js.Array[EducationUser]): Self = this.set("teachers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeachers: Self = this.set("teachers", js.undefined)
    @scala.inline
    def setTerm(value: EducationTerm): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
  }
  
}

