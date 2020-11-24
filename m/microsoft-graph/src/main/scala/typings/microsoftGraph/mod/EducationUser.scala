package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationUser extends Entity {
  
  // True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.native
  
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.native
  
  /**
    * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  
  // Classes to which the user belongs. Nullable.
  var classes: js.UndefOr[NullableOption[js.Array[EducationClass]]] = js.native
  
  // Entity who created the user.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Where this user was created from. The possible values are: sis, manual.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.native
  
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[NullableOption[String]] = js.native
  
  // The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[NullableOption[String]] = js.native
  
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[NullableOption[String]] = js.native
  
  // Mail address of user.
  var mailingAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // The middle name of user.
  var middleName: js.UndefOr[NullableOption[String]] = js.native
  
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.native
  
  var officeLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two can be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the password profile for the user. The profile contains the user's password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[NullableOption[PasswordProfile]] = js.native
  
  // The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Default role for a user. The user's role might be different in an individual class. The possible values are: student,
    * teacher. Supports $filter.
    */
  var primaryRole: js.UndefOr[EducationUserRole] = js.native
  
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  
  var refreshTokensValidFromDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Address where user lives.
  var residenceAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // Schools to which the user belongs. Nullable.
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.native
  
  var showInAddressList: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If the primary role is student, this block will contain student specific data.
  var student: js.UndefOr[NullableOption[EducationStudent]] = js.native
  
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[NullableOption[String]] = js.native
  
  // If the primary role is teacher, this block will contain teacher specific data.
  var teacher: js.UndefOr[NullableOption[EducationTeacher]] = js.native
  
  /**
    * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal
    * requirement to check for availability of services in countries or regions. Examples include: 'US', 'JP', and 'GB'. Not
    * nullable. Supports $filter.
    */
  var usageLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // The directory user corresponding to this user.
  var user: js.UndefOr[NullableOption[User]] = js.native
  
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant's collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[NullableOption[String]] = js.native
}
object EducationUser {
  
  @scala.inline
  def apply(): EducationUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationUser]
  }
  
  @scala.inline
  implicit class EducationUserOps[Self <: EducationUser] (val x: Self) extends AnyVal {
    
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
    def setAccountEnabled(value: NullableOption[Boolean]): Self = this.set("accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountEnabled: Self = this.set("accountEnabled", js.undefined)
    
    @scala.inline
    def setAccountEnabledNull: Self = this.set("accountEnabled", null)
    
    @scala.inline
    def setAssignedLicensesVarargs(value: AssignedLicense*): Self = this.set("assignedLicenses", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLicenses(value: js.Array[AssignedLicense]): Self = this.set("assignedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedLicenses: Self = this.set("assignedLicenses", js.undefined)
    
    @scala.inline
    def setAssignedPlansVarargs(value: AssignedPlan*): Self = this.set("assignedPlans", js.Array(value :_*))
    
    @scala.inline
    def setAssignedPlans(value: js.Array[AssignedPlan]): Self = this.set("assignedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedPlans: Self = this.set("assignedPlans", js.undefined)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = this.set("businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = this.set("businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessPhones: Self = this.set("businessPhones", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: EducationClass*): Self = this.set("classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setClassesNull: Self = this.set("classes", null)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDepartmentNull: Self = this.set("department", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExternalSource(value: NullableOption[EducationExternalSource]): Self = this.set("externalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalSource: Self = this.set("externalSource", js.undefined)
    
    @scala.inline
    def setExternalSourceNull: Self = this.set("externalSource", null)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setGivenNameNull: Self = this.set("givenName", null)
    
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
    def setMailingAddress(value: NullableOption[PhysicalAddress]): Self = this.set("mailingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailingAddress: Self = this.set("mailingAddress", js.undefined)
    
    @scala.inline
    def setMailingAddressNull: Self = this.set("mailingAddress", null)
    
    @scala.inline
    def setMiddleName(value: NullableOption[String]): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setMiddleNameNull: Self = this.set("middleName", null)
    
    @scala.inline
    def setMobilePhone(value: NullableOption[String]): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    
    @scala.inline
    def setMobilePhoneNull: Self = this.set("mobilePhone", null)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = this.set("officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficeLocation: Self = this.set("officeLocation", js.undefined)
    
    @scala.inline
    def setOfficeLocationNull: Self = this.set("officeLocation", null)
    
    @scala.inline
    def setPasswordPolicies(value: NullableOption[String]): Self = this.set("passwordPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPolicies: Self = this.set("passwordPolicies", js.undefined)
    
    @scala.inline
    def setPasswordPoliciesNull: Self = this.set("passwordPolicies", null)
    
    @scala.inline
    def setPasswordProfile(value: NullableOption[PasswordProfile]): Self = this.set("passwordProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordProfile: Self = this.set("passwordProfile", js.undefined)
    
    @scala.inline
    def setPasswordProfileNull: Self = this.set("passwordProfile", null)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = this.set("preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredLanguage: Self = this.set("preferredLanguage", js.undefined)
    
    @scala.inline
    def setPreferredLanguageNull: Self = this.set("preferredLanguage", null)
    
    @scala.inline
    def setPrimaryRole(value: EducationUserRole): Self = this.set("primaryRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryRole: Self = this.set("primaryRole", js.undefined)
    
    @scala.inline
    def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = this.set("provisionedPlans", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = this.set("provisionedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedPlans: Self = this.set("provisionedPlans", js.undefined)
    
    @scala.inline
    def setRefreshTokensValidFromDateTime(value: NullableOption[String]): Self = this.set("refreshTokensValidFromDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshTokensValidFromDateTime: Self = this.set("refreshTokensValidFromDateTime", js.undefined)
    
    @scala.inline
    def setRefreshTokensValidFromDateTimeNull: Self = this.set("refreshTokensValidFromDateTime", null)
    
    @scala.inline
    def setResidenceAddress(value: NullableOption[PhysicalAddress]): Self = this.set("residenceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResidenceAddress: Self = this.set("residenceAddress", js.undefined)
    
    @scala.inline
    def setResidenceAddressNull: Self = this.set("residenceAddress", null)
    
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = this.set("schools", js.Array(value :_*))
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = this.set("schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchools: Self = this.set("schools", js.undefined)
    
    @scala.inline
    def setSchoolsNull: Self = this.set("schools", null)
    
    @scala.inline
    def setShowInAddressList(value: NullableOption[Boolean]): Self = this.set("showInAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInAddressList: Self = this.set("showInAddressList", js.undefined)
    
    @scala.inline
    def setShowInAddressListNull: Self = this.set("showInAddressList", null)
    
    @scala.inline
    def setStudent(value: NullableOption[EducationStudent]): Self = this.set("student", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudent: Self = this.set("student", js.undefined)
    
    @scala.inline
    def setStudentNull: Self = this.set("student", null)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    
    @scala.inline
    def setSurnameNull: Self = this.set("surname", null)
    
    @scala.inline
    def setTeacher(value: NullableOption[EducationTeacher]): Self = this.set("teacher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeacher: Self = this.set("teacher", js.undefined)
    
    @scala.inline
    def setTeacherNull: Self = this.set("teacher", null)
    
    @scala.inline
    def setUsageLocation(value: NullableOption[String]): Self = this.set("usageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageLocation: Self = this.set("usageLocation", js.undefined)
    
    @scala.inline
    def setUsageLocationNull: Self = this.set("usageLocation", null)
    
    @scala.inline
    def setUser(value: NullableOption[User]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
    
    @scala.inline
    def setUserType(value: NullableOption[String]): Self = this.set("userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserType: Self = this.set("userType", js.undefined)
    
    @scala.inline
    def setUserTypeNull: Self = this.set("userType", null)
  }
}
