package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgContact
  extends StObject
     with DirectoryObject {
  
  var addresses: js.UndefOr[NullableOption[js.Array[PhysicalOfficeAddress]]] = js.undefined
  
  var companyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var department: js.UndefOr[NullableOption[String]] = js.undefined
  
  var directReports: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var givenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var jobTitle: js.UndefOr[NullableOption[String]] = js.undefined
  
  var mail: js.UndefOr[NullableOption[String]] = js.undefined
  
  var mailNickname: js.UndefOr[NullableOption[String]] = js.undefined
  
  var manager: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.undefined
  
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.undefined
  
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var surname: js.UndefOr[NullableOption[String]] = js.undefined
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
}
object OrgContact {
  
  @scala.inline
  def apply(): OrgContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgContact]
  }
  
  @scala.inline
  implicit class OrgContactMutableBuilder[Self <: OrgContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: NullableOption[js.Array[PhysicalOfficeAddress]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: PhysicalOfficeAddress*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameNull: Self = StObject.set(x, "companyName", null)
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDirectReports(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "directReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectReportsNull: Self = StObject.set(x, "directReports", null)
    
    @scala.inline
    def setDirectReportsUndefined: Self = StObject.set(x, "directReports", js.undefined)
    
    @scala.inline
    def setDirectReportsVarargs(value: DirectoryObject*): Self = StObject.set(x, "directReports", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleNull: Self = StObject.set(x, "jobTitle", null)
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setMail(value: NullableOption[String]): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailNickname(value: NullableOption[String]): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailNicknameNull: Self = StObject.set(x, "mailNickname", null)
    
    @scala.inline
    def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    @scala.inline
    def setMailNull: Self = StObject.set(x, "mail", null)
    
    @scala.inline
    def setMailUndefined: Self = StObject.set(x, "mail", js.undefined)
    
    @scala.inline
    def setManager(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerNull: Self = StObject.set(x, "manager", null)
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    @scala.inline
    def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = StObject.set(x, "onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesProvisioningErrorsNull: Self = StObject.set(x, "onPremisesProvisioningErrors", null)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsUndefined: Self = StObject.set(x, "onPremisesProvisioningErrors", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = StObject.set(x, "onPremisesProvisioningErrors", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    @scala.inline
    def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setPhones(value: NullableOption[js.Array[Phone]]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    @scala.inline
    def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = StObject.set(x, "phones", js.Array(value :_*))
    
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = StObject.set(x, "proxyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyAddressesUndefined: Self = StObject.set(x, "proxyAddresses", js.undefined)
    
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = StObject.set(x, "proxyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    @scala.inline
    def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value :_*))
  }
}
