package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationSchool extends EducationOrganization {
  // Address of the school.
  var address: js.UndefOr[PhysicalAddress] = js.native
  // Classes taught at the school. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.native
  // Entity who created the school.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // ID of school in syncing system.
  var externalId: js.UndefOr[String] = js.native
  // ID of principal in syncing system.
  var externalPrincipalId: js.UndefOr[String] = js.native
  var fax: js.UndefOr[String] = js.native
  // Highest grade taught.
  var highestGrade: js.UndefOr[String] = js.native
  // Lowest grade taught.
  var lowestGrade: js.UndefOr[String] = js.native
  // Phone number of school.
  var phone: js.UndefOr[String] = js.native
  // Email address of the principal.
  var principalEmail: js.UndefOr[String] = js.native
  // Name of the principal.
  var principalName: js.UndefOr[String] = js.native
  // School Number.
  var schoolNumber: js.UndefOr[String] = js.native
  // Users in the school. Nullable.
  var users: js.UndefOr[js.Array[EducationUser]] = js.native
}

object EducationSchool {
  @scala.inline
  def apply(): EducationSchool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSchool]
  }
  @scala.inline
  implicit class EducationSchoolOps[Self <: EducationSchool] (val x: Self) extends AnyVal {
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
    def setAddress(value: PhysicalAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setClassesVarargs(value: EducationClass*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[EducationClass]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCreatedBy(value: IdentitySet): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setExternalPrincipalId(value: String): Self = this.set("externalPrincipalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalPrincipalId: Self = this.set("externalPrincipalId", js.undefined)
    @scala.inline
    def setFax(value: String): Self = this.set("fax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFax: Self = this.set("fax", js.undefined)
    @scala.inline
    def setHighestGrade(value: String): Self = this.set("highestGrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighestGrade: Self = this.set("highestGrade", js.undefined)
    @scala.inline
    def setLowestGrade(value: String): Self = this.set("lowestGrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowestGrade: Self = this.set("lowestGrade", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPrincipalEmail(value: String): Self = this.set("principalEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalEmail: Self = this.set("principalEmail", js.undefined)
    @scala.inline
    def setPrincipalName(value: String): Self = this.set("principalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalName: Self = this.set("principalName", js.undefined)
    @scala.inline
    def setSchoolNumber(value: String): Self = this.set("schoolNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchoolNumber: Self = this.set("schoolNumber", js.undefined)
    @scala.inline
    def setUsersVarargs(value: EducationUser*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[EducationUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

