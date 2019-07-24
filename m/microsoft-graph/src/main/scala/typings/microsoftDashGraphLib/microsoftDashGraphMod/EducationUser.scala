package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationUser extends Entity {
  // True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.undefined
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.undefined
  /**
    * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Classes to which the user belongs. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.undefined
  // Entity who created the user.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Where this user was created from. The possible values are: sis, manual.
  var externalSource: js.UndefOr[EducationExternalSource] = js.undefined
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  // The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[java.lang.String] = js.undefined
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[java.lang.String] = js.undefined
  // Mail address of user.
  var mailingAddress: js.UndefOr[PhysicalAddress] = js.undefined
  // The middle name of user.
  var middleName: js.UndefOr[java.lang.String] = js.undefined
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[java.lang.String] = js.undefined
  var officeLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two can be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[PasswordProfile] = js.undefined
  // The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
  var preferredLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default role for a user. The user's role might be different in an individual class. The possible values are: student,
    * teacher. Supports $filter.
    */
  var primaryRole: js.UndefOr[EducationUserRole] = js.undefined
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.undefined
  var refreshTokensValidFromDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Address where user lives.
  var residenceAddress: js.UndefOr[PhysicalAddress] = js.undefined
  // Schools to which the user belongs. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.undefined
  var showInAddressList: js.UndefOr[scala.Boolean] = js.undefined
  // If the primary role is student, this block will contain student specific data.
  var student: js.UndefOr[EducationStudent] = js.undefined
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[java.lang.String] = js.undefined
  // If the primary role is teacher, this block will conatin teacher specific data.
  var teacher: js.UndefOr[EducationTeacher] = js.undefined
  /**
    * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal
    * requirement to check for availability of services in countries or regions. Examples include: 'US', 'JP', and 'GB'. Not
    * nullable. Supports $filter.
    */
  var usageLocation: js.UndefOr[java.lang.String] = js.undefined
  // The directory user corresponding to this user.
  var user: js.UndefOr[User] = js.undefined
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant’s collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[java.lang.String] = js.undefined
}

object EducationUser {
  @scala.inline
  def apply(
    accountEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    assignedLicenses: js.Array[AssignedLicense] = null,
    assignedPlans: js.Array[AssignedPlan] = null,
    businessPhones: js.Array[java.lang.String] = null,
    classes: js.Array[EducationClass] = null,
    createdBy: IdentitySet = null,
    department: java.lang.String = null,
    displayName: java.lang.String = null,
    externalSource: EducationExternalSource = null,
    givenName: java.lang.String = null,
    id: java.lang.String = null,
    mail: java.lang.String = null,
    mailNickname: java.lang.String = null,
    mailingAddress: PhysicalAddress = null,
    middleName: java.lang.String = null,
    mobilePhone: java.lang.String = null,
    officeLocation: java.lang.String = null,
    passwordPolicies: java.lang.String = null,
    passwordProfile: PasswordProfile = null,
    preferredLanguage: java.lang.String = null,
    primaryRole: EducationUserRole = null,
    provisionedPlans: js.Array[ProvisionedPlan] = null,
    refreshTokensValidFromDateTime: java.lang.String = null,
    residenceAddress: PhysicalAddress = null,
    schools: js.Array[EducationSchool] = null,
    showInAddressList: js.UndefOr[scala.Boolean] = js.undefined,
    student: EducationStudent = null,
    surname: java.lang.String = null,
    teacher: EducationTeacher = null,
    usageLocation: java.lang.String = null,
    user: User = null,
    userPrincipalName: java.lang.String = null,
    userType: java.lang.String = null
  ): EducationUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountEnabled)) __obj.updateDynamic("accountEnabled")(accountEnabled)
    if (assignedLicenses != null) __obj.updateDynamic("assignedLicenses")(assignedLicenses)
    if (assignedPlans != null) __obj.updateDynamic("assignedPlans")(assignedPlans)
    if (businessPhones != null) __obj.updateDynamic("businessPhones")(businessPhones)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (department != null) __obj.updateDynamic("department")(department)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (externalSource != null) __obj.updateDynamic("externalSource")(externalSource)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (mail != null) __obj.updateDynamic("mail")(mail)
    if (mailNickname != null) __obj.updateDynamic("mailNickname")(mailNickname)
    if (mailingAddress != null) __obj.updateDynamic("mailingAddress")(mailingAddress)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone)
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation)
    if (passwordPolicies != null) __obj.updateDynamic("passwordPolicies")(passwordPolicies)
    if (passwordProfile != null) __obj.updateDynamic("passwordProfile")(passwordProfile)
    if (preferredLanguage != null) __obj.updateDynamic("preferredLanguage")(preferredLanguage)
    if (primaryRole != null) __obj.updateDynamic("primaryRole")(primaryRole)
    if (provisionedPlans != null) __obj.updateDynamic("provisionedPlans")(provisionedPlans)
    if (refreshTokensValidFromDateTime != null) __obj.updateDynamic("refreshTokensValidFromDateTime")(refreshTokensValidFromDateTime)
    if (residenceAddress != null) __obj.updateDynamic("residenceAddress")(residenceAddress)
    if (schools != null) __obj.updateDynamic("schools")(schools)
    if (!js.isUndefined(showInAddressList)) __obj.updateDynamic("showInAddressList")(showInAddressList)
    if (student != null) __obj.updateDynamic("student")(student)
    if (surname != null) __obj.updateDynamic("surname")(surname)
    if (teacher != null) __obj.updateDynamic("teacher")(teacher)
    if (usageLocation != null) __obj.updateDynamic("usageLocation")(usageLocation)
    if (user != null) __obj.updateDynamic("user")(user)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    if (userType != null) __obj.updateDynamic("userType")(userType)
    __obj.asInstanceOf[EducationUser]
  }
}

