package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgContact extends DirectoryObject {
  var addresses: js.UndefOr[js.Array[PhysicalOfficeAddress]] = js.native
  var companyName: js.UndefOr[String] = js.native
  var department: js.UndefOr[String] = js.native
  var directReports: js.UndefOr[js.Array[DirectoryObject]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
  var jobTitle: js.UndefOr[String] = js.native
  var mail: js.UndefOr[String] = js.native
  var mailNickname: js.UndefOr[String] = js.native
  var manager: js.UndefOr[DirectoryObject] = js.native
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.native
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  var phones: js.UndefOr[js.Array[Phone]] = js.native
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  var surname: js.UndefOr[String] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
}

object OrgContact {
  @scala.inline
  def apply(): OrgContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgContact]
  }
  @scala.inline
  implicit class OrgContactOps[Self <: OrgContact] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: PhysicalOfficeAddress*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[PhysicalOfficeAddress]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    @scala.inline
    def setDirectReportsVarargs(value: DirectoryObject*): Self = this.set("directReports", js.Array(value :_*))
    @scala.inline
    def setDirectReports(value: js.Array[DirectoryObject]): Self = this.set("directReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectReports: Self = this.set("directReports", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    @scala.inline
    def setMail(value: String): Self = this.set("mail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMail: Self = this.set("mail", js.undefined)
    @scala.inline
    def setMailNickname(value: String): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    @scala.inline
    def setManager(value: DirectoryObject): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    @scala.inline
    def setMemberOf(value: js.Array[DirectoryObject]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: String): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = this.set("onPremisesProvisioningErrors", js.Array(value :_*))
    @scala.inline
    def setOnPremisesProvisioningErrors(value: js.Array[OnPremisesProvisioningError]): Self = this.set("onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesProvisioningErrors: Self = this.set("onPremisesProvisioningErrors", js.undefined)
    @scala.inline
    def setOnPremisesSyncEnabled(value: Boolean): Self = this.set("onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesSyncEnabled: Self = this.set("onPremisesSyncEnabled", js.undefined)
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = this.set("phones", js.Array(value :_*))
    @scala.inline
    def setPhones(value: js.Array[Phone]): Self = this.set("phones", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = this.set("proxyAddresses", js.Array(value :_*))
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = this.set("proxyAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyAddresses: Self = this.set("proxyAddresses", js.undefined)
    @scala.inline
    def setSurname(value: String): Self = this.set("surname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    @scala.inline
    def setTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
  }
  
}

