package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgContact
  extends StObject
     with DirectoryObject {
  
  // Postal addresses for this organizational contact. For now a contact can only have one physical address.
  var addresses: js.UndefOr[NullableOption[js.Array[PhysicalOfficeAddress]]] = js.undefined
  
  /**
    * Name of the company that this organizational contact belongs to. Supports $filter (eq, ne, not, ge, le, in, startsWith,
    * and eq for null values).
    */
  var companyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The name for the department in which the contact works. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq
    * for null values).
    */
  var department: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The contact's direct reports. (The users and contacts that have their manager property set to this contact.) Read-only.
    * Nullable. Supports $expand.
    */
  var directReports: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null
    * values), $search, and $orderBy.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null
    * values).
    */
  var givenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null
    * values).
    */
  var jobTitle: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le,
    * in, startsWith, and eq for null values).
    */
  var mail: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq,
    * ne, not, ge, le, in, startsWith, and eq for null values).
    */
  var mailNickname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user or contact that is this contact's manager. Read-only. Supports $expand and $filter (eq) by id.
  var manager: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  // Groups that this contact is a member of. Read-only. Nullable. Supports $expand.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Date and time when this organizational contact was last synchronized from on-premises AD. This date and time
    * information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not for category
    * and propertyCausingError), /$count eq 0, /$count ne 0.
    */
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.undefined
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced
    * from an on-premises directory (default). Supports $filter (eq, ne, not, in, and eq for null values).
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each
    * type can ever be present in the collection.
    */
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.undefined
  
  /**
    * For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter
    * expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0).
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null
    * values).
    */
  var surname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Groups that this contact is a member of, including groups that the contact is nested under. Read-only. Nullable.
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
}
object OrgContact {
  
  inline def apply(): OrgContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgContact] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: NullableOption[js.Array[PhysicalOfficeAddress]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: PhysicalOfficeAddress*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCompanyName(value: NullableOption[String]): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameNull: Self = StObject.set(x, "companyName", null)
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setDepartment(value: NullableOption[String]): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setDirectReports(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "directReports", value.asInstanceOf[js.Any])
    
    inline def setDirectReportsNull: Self = StObject.set(x, "directReports", null)
    
    inline def setDirectReportsUndefined: Self = StObject.set(x, "directReports", js.undefined)
    
    inline def setDirectReportsVarargs(value: DirectoryObject*): Self = StObject.set(x, "directReports", js.Array(value*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setJobTitle(value: NullableOption[String]): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    inline def setJobTitleNull: Self = StObject.set(x, "jobTitle", null)
    
    inline def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    inline def setMail(value: NullableOption[String]): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
    
    inline def setMailNickname(value: NullableOption[String]): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    inline def setMailNicknameNull: Self = StObject.set(x, "mailNickname", null)
    
    inline def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    inline def setMailNull: Self = StObject.set(x, "mail", null)
    
    inline def setMailUndefined: Self = StObject.set(x, "mail", js.undefined)
    
    inline def setManager(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerNull: Self = StObject.set(x, "manager", null)
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    inline def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    inline def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    inline def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value*))
    
    inline def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    inline def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    inline def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = StObject.set(x, "onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesProvisioningErrorsNull: Self = StObject.set(x, "onPremisesProvisioningErrors", null)
    
    inline def setOnPremisesProvisioningErrorsUndefined: Self = StObject.set(x, "onPremisesProvisioningErrors", js.undefined)
    
    inline def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = StObject.set(x, "onPremisesProvisioningErrors", js.Array(value*))
    
    inline def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    inline def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    inline def setPhones(value: NullableOption[js.Array[Phone]]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    inline def setPhonesVarargs(value: Phone*): Self = StObject.set(x, "phones", js.Array(value*))
    
    inline def setProxyAddresses(value: js.Array[String]): Self = StObject.set(x, "proxyAddresses", value.asInstanceOf[js.Any])
    
    inline def setProxyAddressesUndefined: Self = StObject.set(x, "proxyAddresses", js.undefined)
    
    inline def setProxyAddressesVarargs(value: String*): Self = StObject.set(x, "proxyAddresses", js.Array(value*))
    
    inline def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    inline def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    inline def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    inline def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    inline def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value*))
  }
}
