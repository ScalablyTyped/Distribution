package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationUser
  extends StObject
     with Entity {
  
  // True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.undefined
  
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.undefined
  
  /**
    * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.undefined
  
  // Classes to which the user belongs. Nullable.
  var classes: js.UndefOr[NullableOption[js.Array[EducationClass]]] = js.undefined
  
  // Entity who created the user.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Where this user was created from. The possible values are: sis, manual.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.undefined
  
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Mail address of user.
  var mailingAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The middle name of user.
  var middleName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.undefined
  
  var officeLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two can be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the password profile for the user. The profile contains the user's password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[NullableOption[PasswordProfile]] = js.undefined
  
  // The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Default role for a user. The user's role might be different in an individual class. The possible values are: student,
    * teacher. Supports $filter.
    */
  var primaryRole: js.UndefOr[EducationUserRole] = js.undefined
  
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.undefined
  
  var refreshTokensValidFromDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Address where user lives.
  var residenceAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // Schools to which the user belongs. Nullable.
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.undefined
  
  var showInAddressList: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If the primary role is student, this block will contain student specific data.
  var student: js.UndefOr[NullableOption[EducationStudent]] = js.undefined
  
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If the primary role is teacher, this block will contain teacher specific data.
  var teacher: js.UndefOr[NullableOption[EducationTeacher]] = js.undefined
  
  /**
    * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal
    * requirement to check for availability of services in countries or regions. Examples include: 'US', 'JP', and 'GB'. Not
    * nullable. Supports $filter.
    */
  var usageLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The directory user corresponding to this user.
  var user: js.UndefOr[NullableOption[User]] = js.undefined
  
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant's collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationUser {
  
  @scala.inline
  def apply(): EducationUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationUser]
  }
  
  @scala.inline
  implicit class EducationUserMutableBuilder[Self <: EducationUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEnabledNull: Self = StObject.set(x, "accountEnabled", null)
    
    @scala.inline
    def setAccountEnabledUndefined: Self = StObject.set(x, "accountEnabled", js.undefined)
    
    @scala.inline
    def setAssignedLicenses(value: js.Array[AssignedLicense]): Self = StObject.set(x, "assignedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedLicensesUndefined: Self = StObject.set(x, "assignedLicenses", js.undefined)
    
    @scala.inline
    def setAssignedLicensesVarargs(value: AssignedLicense*): Self = StObject.set(x, "assignedLicenses", js.Array(value :_*))
    
    @scala.inline
    def setAssignedPlans(value: js.Array[AssignedPlan]): Self = StObject.set(x, "assignedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedPlansUndefined: Self = StObject.set(x, "assignedPlans", js.undefined)
    
    @scala.inline
    def setAssignedPlansVarargs(value: AssignedPlan*): Self = StObject.set(x, "assignedPlans", js.Array(value :_*))
    
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = StObject.set(x, "businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessPhonesUndefined: Self = StObject.set(x, "businessPhones", js.undefined)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = StObject.set(x, "businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesNull: Self = StObject.set(x, "classes", null)
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: EducationClass*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalSource(value: NullableOption[EducationExternalSource]): Self = StObject.set(x, "externalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalSourceNull: Self = StObject.set(x, "externalSource", null)
    
    @scala.inline
    def setExternalSourceUndefined: Self = StObject.set(x, "externalSource", js.undefined)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
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
    def setMailingAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "mailingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailingAddressNull: Self = StObject.set(x, "mailingAddress", null)
    
    @scala.inline
    def setMailingAddressUndefined: Self = StObject.set(x, "mailingAddress", js.undefined)
    
    @scala.inline
    def setMiddleName(value: NullableOption[String]): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleNameNull: Self = StObject.set(x, "middleName", null)
    
    @scala.inline
    def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    @scala.inline
    def setMobilePhone(value: NullableOption[String]): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneNull: Self = StObject.set(x, "mobilePhone", null)
    
    @scala.inline
    def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = StObject.set(x, "officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeLocationNull: Self = StObject.set(x, "officeLocation", null)
    
    @scala.inline
    def setOfficeLocationUndefined: Self = StObject.set(x, "officeLocation", js.undefined)
    
    @scala.inline
    def setPasswordPolicies(value: NullableOption[String]): Self = StObject.set(x, "passwordPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPoliciesNull: Self = StObject.set(x, "passwordPolicies", null)
    
    @scala.inline
    def setPasswordPoliciesUndefined: Self = StObject.set(x, "passwordPolicies", js.undefined)
    
    @scala.inline
    def setPasswordProfile(value: NullableOption[PasswordProfile]): Self = StObject.set(x, "passwordProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordProfileNull: Self = StObject.set(x, "passwordProfile", null)
    
    @scala.inline
    def setPasswordProfileUndefined: Self = StObject.set(x, "passwordProfile", js.undefined)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = StObject.set(x, "preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredLanguageNull: Self = StObject.set(x, "preferredLanguage", null)
    
    @scala.inline
    def setPreferredLanguageUndefined: Self = StObject.set(x, "preferredLanguage", js.undefined)
    
    @scala.inline
    def setPrimaryRole(value: EducationUserRole): Self = StObject.set(x, "primaryRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRoleUndefined: Self = StObject.set(x, "primaryRole", js.undefined)
    
    @scala.inline
    def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = StObject.set(x, "provisionedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedPlansUndefined: Self = StObject.set(x, "provisionedPlans", js.undefined)
    
    @scala.inline
    def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = StObject.set(x, "provisionedPlans", js.Array(value :_*))
    
    @scala.inline
    def setRefreshTokensValidFromDateTime(value: NullableOption[String]): Self = StObject.set(x, "refreshTokensValidFromDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokensValidFromDateTimeNull: Self = StObject.set(x, "refreshTokensValidFromDateTime", null)
    
    @scala.inline
    def setRefreshTokensValidFromDateTimeUndefined: Self = StObject.set(x, "refreshTokensValidFromDateTime", js.undefined)
    
    @scala.inline
    def setResidenceAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "residenceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidenceAddressNull: Self = StObject.set(x, "residenceAddress", null)
    
    @scala.inline
    def setResidenceAddressUndefined: Self = StObject.set(x, "residenceAddress", js.undefined)
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchoolsNull: Self = StObject.set(x, "schools", null)
    
    @scala.inline
    def setSchoolsUndefined: Self = StObject.set(x, "schools", js.undefined)
    
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = StObject.set(x, "schools", js.Array(value :_*))
    
    @scala.inline
    def setShowInAddressList(value: NullableOption[Boolean]): Self = StObject.set(x, "showInAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInAddressListNull: Self = StObject.set(x, "showInAddressList", null)
    
    @scala.inline
    def setShowInAddressListUndefined: Self = StObject.set(x, "showInAddressList", js.undefined)
    
    @scala.inline
    def setStudent(value: NullableOption[EducationStudent]): Self = StObject.set(x, "student", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentNull: Self = StObject.set(x, "student", null)
    
    @scala.inline
    def setStudentUndefined: Self = StObject.set(x, "student", js.undefined)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    @scala.inline
    def setTeacher(value: NullableOption[EducationTeacher]): Self = StObject.set(x, "teacher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeacherNull: Self = StObject.set(x, "teacher", null)
    
    @scala.inline
    def setTeacherUndefined: Self = StObject.set(x, "teacher", js.undefined)
    
    @scala.inline
    def setUsageLocation(value: NullableOption[String]): Self = StObject.set(x, "usageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageLocationNull: Self = StObject.set(x, "usageLocation", null)
    
    @scala.inline
    def setUsageLocationUndefined: Self = StObject.set(x, "usageLocation", js.undefined)
    
    @scala.inline
    def setUser(value: NullableOption[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserType(value: NullableOption[String]): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeNull: Self = StObject.set(x, "userType", null)
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "userType", js.undefined)
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
