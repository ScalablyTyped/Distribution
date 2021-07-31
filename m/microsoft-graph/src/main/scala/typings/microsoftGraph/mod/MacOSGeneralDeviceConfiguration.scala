package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOSGeneralDeviceConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // List that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  // An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
  var emailInDomainSuffixes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of character sets a password must contain. Valid values 0 to 4
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity required before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity required before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passwords to block.
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  
  // Type of password that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
}
object MacOSGeneralDeviceConfiguration {
  
  @scala.inline
  def apply(): MacOSGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSGeneralDeviceConfiguration]
  }
  
  @scala.inline
  implicit class MacOSGeneralDeviceConfigurationMutableBuilder[Self <: MacOSGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliantAppListType(value: AppListType): Self = StObject.set(x, "compliantAppListType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantAppListTypeUndefined: Self = StObject.set(x, "compliantAppListType", js.undefined)
    
    @scala.inline
    def setCompliantAppsList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "compliantAppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantAppsListNull: Self = StObject.set(x, "compliantAppsList", null)
    
    @scala.inline
    def setCompliantAppsListUndefined: Self = StObject.set(x, "compliantAppsList", js.undefined)
    
    @scala.inline
    def setCompliantAppsListVarargs(value: AppListItem*): Self = StObject.set(x, "compliantAppsList", js.Array(value :_*))
    
    @scala.inline
    def setEmailInDomainSuffixes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "emailInDomainSuffixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailInDomainSuffixesNull: Self = StObject.set(x, "emailInDomainSuffixes", null)
    
    @scala.inline
    def setEmailInDomainSuffixesUndefined: Self = StObject.set(x, "emailInDomainSuffixes", js.undefined)
    
    @scala.inline
    def setEmailInDomainSuffixesVarargs(value: String*): Self = StObject.set(x, "emailInDomainSuffixes", js.Array(value :_*))
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
  }
}
