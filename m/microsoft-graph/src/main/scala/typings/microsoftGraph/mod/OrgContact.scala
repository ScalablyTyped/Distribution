package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgContact extends DirectoryObject {
  
  var addresses: js.UndefOr[NullableOption[js.Array[PhysicalOfficeAddress]]] = js.native
  
  var companyName: js.UndefOr[NullableOption[String]] = js.native
  
  var department: js.UndefOr[NullableOption[String]] = js.native
  
  var directReports: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  var givenName: js.UndefOr[NullableOption[String]] = js.native
  
  var jobTitle: js.UndefOr[NullableOption[String]] = js.native
  
  var mail: js.UndefOr[NullableOption[String]] = js.native
  
  var mailNickname: js.UndefOr[NullableOption[String]] = js.native
  
  var manager: js.UndefOr[NullableOption[DirectoryObject]] = js.native
  
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.native
  
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.native
  
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  
  var surname: js.UndefOr[NullableOption[String]] = js.native
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
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
    def setAddresses(value: NullableOption[js.Array[PhysicalOfficeAddress]]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAddressesNull: Self = this.set("addresses", null)
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setCompanyNameNull: Self = this.set("companyName", null)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDepartmentNull: Self = this.set("department", null)
    
    @scala.inline
    def setDirectReportsVarargs(value: DirectoryObject*): Self = this.set("directReports", js.Array(value :_*))
    
    @scala.inline
    def setDirectReports(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("directReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectReports: Self = this.set("directReports", js.undefined)
    
    @scala.inline
    def setDirectReportsNull: Self = this.set("directReports", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setGivenNameNull: Self = this.set("givenName", null)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setJobTitleNull: Self = this.set("jobTitle", null)
    
    @scala.inline
    def setMail(value: NullableOption[String]): Self = this.set("mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMail: Self = this.set("mail", js.undefined)
    
    @scala.inline
    def setMailNull: Self = this.set("mail", null)
    
    @scala.inline
    def setMailNickname(value: NullableOption[String]): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    
    @scala.inline
    def setMailNicknameNull: Self = this.set("mailNickname", null)
    
    @scala.inline
    def setManager(value: NullableOption[DirectoryObject]): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    
    @scala.inline
    def setManagerNull: Self = this.set("manager", null)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfNull: Self = this.set("memberOf", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = this.set("onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = this.set("onPremisesProvisioningErrors", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = this.set("onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesProvisioningErrors: Self = this.set("onPremisesProvisioningErrors", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsNull: Self = this.set("onPremisesProvisioningErrors", null)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = this.set("onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesSyncEnabled: Self = this.set("onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = this.set("onPremisesSyncEnabled", null)
    
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = this.set("phones", js.Array(value :_*))
    
    @scala.inline
    def setPhones(value: NullableOption[js.Array[Phone]]): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    
    @scala.inline
    def setPhonesNull: Self = this.set("phones", null)
    
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = this.set("proxyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = this.set("proxyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyAddresses: Self = this.set("proxyAddresses", js.undefined)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    
    @scala.inline
    def setSurnameNull: Self = this.set("surname", null)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = this.set("transitiveMemberOf", null)
  }
}
