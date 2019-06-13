package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationClass extends Entity {
  /** Class code used by the school to identify the class. */
  var classCode: js.UndefOr[java.lang.String] = js.undefined
  /** Entity who created the class */
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  /** Description of the class. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the class. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the class from the syncing system. */
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the class in the syncing system. */
  var externalName: js.UndefOr[java.lang.String] = js.undefined
  /** How this class was created. The possible values are: sis, manual, unknownFutureValue. */
  var externalSource: js.UndefOr[EducationExternalSource] = js.undefined
  /** The directory group corresponding to this class. */
  var group: js.UndefOr[Group] = js.undefined
  /** Mail name for sending email to all members, if this is enabled. */
  var mailNickname: js.UndefOr[java.lang.String] = js.undefined
  /** All users in the class. Nullable. */
  var members: js.UndefOr[js.Array[EducationUser]] = js.undefined
  /** All schools that this class is associated with. Nullable. */
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.undefined
  /** All teachers in the class. Nullable. */
  var teachers: js.UndefOr[js.Array[EducationUser]] = js.undefined
  /** Term for this class. */
  var term: js.UndefOr[EducationTerm] = js.undefined
}

object EducationClass {
  @scala.inline
  def apply(
    classCode: java.lang.String = null,
    createdBy: IdentitySet = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    externalId: java.lang.String = null,
    externalName: java.lang.String = null,
    externalSource: EducationExternalSource = null,
    group: Group = null,
    id: java.lang.String = null,
    mailNickname: java.lang.String = null,
    members: js.Array[EducationUser] = null,
    schools: js.Array[EducationSchool] = null,
    teachers: js.Array[EducationUser] = null,
    term: EducationTerm = null
  ): EducationClass = {
    val __obj = js.Dynamic.literal()
    if (classCode != null) __obj.updateDynamic("classCode")(classCode)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (externalName != null) __obj.updateDynamic("externalName")(externalName)
    if (externalSource != null) __obj.updateDynamic("externalSource")(externalSource)
    if (group != null) __obj.updateDynamic("group")(group)
    if (id != null) __obj.updateDynamic("id")(id)
    if (mailNickname != null) __obj.updateDynamic("mailNickname")(mailNickname)
    if (members != null) __obj.updateDynamic("members")(members)
    if (schools != null) __obj.updateDynamic("schools")(schools)
    if (teachers != null) __obj.updateDynamic("teachers")(teachers)
    if (term != null) __obj.updateDynamic("term")(term)
    __obj.asInstanceOf[EducationClass]
  }
}

