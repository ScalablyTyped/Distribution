package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationClass extends Entity {
  // Class code used by the school to identify the class.
  var classCode: js.UndefOr[String] = js.undefined
  // Entity who created the class
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // Description of the class.
  var description: js.UndefOr[String] = js.undefined
  // Name of the class.
  var displayName: js.UndefOr[String] = js.undefined
  // ID of the class from the syncing system.
  var externalId: js.UndefOr[String] = js.undefined
  // Name of the class in the syncing system.
  var externalName: js.UndefOr[String] = js.undefined
  // How this class was created. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[EducationExternalSource] = js.undefined
  // The directory group corresponding to this class.
  var group: js.UndefOr[Group] = js.undefined
  // Mail name for sending email to all members, if this is enabled.
  var mailNickname: js.UndefOr[String] = js.undefined
  // All users in the class. Nullable.
  var members: js.UndefOr[js.Array[EducationUser]] = js.undefined
  // All schools that this class is associated with. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.undefined
  // All teachers in the class. Nullable.
  var teachers: js.UndefOr[js.Array[EducationUser]] = js.undefined
  // Term for this class.
  var term: js.UndefOr[EducationTerm] = js.undefined
}

object EducationClass {
  @scala.inline
  def apply(
    classCode: String = null,
    createdBy: IdentitySet = null,
    description: String = null,
    displayName: String = null,
    externalId: String = null,
    externalName: String = null,
    externalSource: EducationExternalSource = null,
    group: Group = null,
    id: String = null,
    mailNickname: String = null,
    members: js.Array[EducationUser] = null,
    schools: js.Array[EducationSchool] = null,
    teachers: js.Array[EducationUser] = null,
    term: EducationTerm = null
  ): EducationClass = {
    val __obj = js.Dynamic.literal()
    if (classCode != null) __obj.updateDynamic("classCode")(classCode.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (externalName != null) __obj.updateDynamic("externalName")(externalName.asInstanceOf[js.Any])
    if (externalSource != null) __obj.updateDynamic("externalSource")(externalSource.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mailNickname != null) __obj.updateDynamic("mailNickname")(mailNickname.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (schools != null) __obj.updateDynamic("schools")(schools.asInstanceOf[js.Any])
    if (teachers != null) __obj.updateDynamic("teachers")(teachers.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[EducationClass]
  }
}

