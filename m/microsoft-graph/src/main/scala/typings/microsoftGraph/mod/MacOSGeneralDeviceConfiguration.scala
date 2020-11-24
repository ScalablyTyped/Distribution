package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacOSGeneralDeviceConfiguration extends DeviceConfiguration {
  
  // List that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.native
  
  // An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
  var emailInDomainSuffixes: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of character sets a password must contain. Valid values 0 to 4
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minutes of inactivity required before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minutes of inactivity required before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of previous passwords to block.
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  
  // Type of password that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
}
object MacOSGeneralDeviceConfiguration {
  
  @scala.inline
  def apply(): MacOSGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSGeneralDeviceConfiguration]
  }
  
  @scala.inline
  implicit class MacOSGeneralDeviceConfigurationOps[Self <: MacOSGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCompliantAppListType(value: AppListType): Self = this.set("compliantAppListType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliantAppListType: Self = this.set("compliantAppListType", js.undefined)
    
    @scala.inline
    def setCompliantAppsListVarargs(value: AppListItem*): Self = this.set("compliantAppsList", js.Array(value :_*))
    
    @scala.inline
    def setCompliantAppsList(value: NullableOption[js.Array[AppListItem]]): Self = this.set("compliantAppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliantAppsList: Self = this.set("compliantAppsList", js.undefined)
    
    @scala.inline
    def setCompliantAppsListNull: Self = this.set("compliantAppsList", null)
    
    @scala.inline
    def setEmailInDomainSuffixesVarargs(value: String*): Self = this.set("emailInDomainSuffixes", js.Array(value :_*))
    
    @scala.inline
    def setEmailInDomainSuffixes(value: NullableOption[js.Array[String]]): Self = this.set("emailInDomainSuffixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailInDomainSuffixes: Self = this.set("emailInDomainSuffixes", js.undefined)
    
    @scala.inline
    def setEmailInDomainSuffixesNull: Self = this.set("emailInDomainSuffixes", null)
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = this.set("passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = this.set("passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = this.set("passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = this.set("passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeLock: Self = this.set("passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockNull: Self = this.set("passwordMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeScreenTimeout: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = this.set("passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
  }
}
