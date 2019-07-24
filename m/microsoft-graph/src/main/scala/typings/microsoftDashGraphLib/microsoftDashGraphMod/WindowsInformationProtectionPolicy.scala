package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionPolicy extends WindowsInformationProtection {
  // Offline interval before app data is wiped (days)
  var daysWithoutContactBeforeUnenroll: js.UndefOr[scala.Double] = js.undefined
  // Enrollment url for the MDM
  var mdmEnrollmentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become
    * PIN or password locked. Range is an integer X where 0 &amp;lt;= X &amp;lt;= 999.
    */
  var minutesOfInactivityBeforeDeviceLock: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The
    * largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy
    * setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows
    * 10, version 1511. Default is 0.
    */
  var numberOfPastPinsRemembered: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe
    * functionality. Range is an integer X where 4 &amp;lt;= X &amp;lt;= 16 for desktop and 0 &amp;lt;= X &amp;lt;= 999 for
    * mobile devices.
    */
  var passwordMaximumAttemptCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to
    * change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for
    * this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in
    * Windows 10, version 1511. Default is 0.
    */
  var pinExpirationDays: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinLowercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.undefined
  /**
    * Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number
    * you can configure for this policy setting is 4. The largest number you can configure must be less than the number
    * configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
    */
  var pinMinimumLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special
    * characters for Windows Hello for Business PIN gestures include: ! ' # $ % &amp; ' ( ) + , - . / : ; &amp;lt; = &amp;gt;
    * ? @ [ / ] ^ ` {
    */
  var pinSpecialCharacters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.undefined
  /**
    * Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinUppercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.undefined
  // New property in RS2, pending documentation
  var revokeOnMdmHandoffDisabled: js.UndefOr[scala.Boolean] = js.undefined
  // Boolean value that sets Windows Hello for Business as a method for signing into Windows.
  var windowsHelloForBusinessBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object WindowsInformationProtectionPolicy {
  @scala.inline
  def apply(
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    azureRightsManagementServicesAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    createdDateTime: java.lang.String = null,
    dataRecoveryCertificate: WindowsInformationProtectionDataRecoveryCertificate = null,
    daysWithoutContactBeforeUnenroll: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    enforcementLevel: WindowsInformationProtectionEnforcementLevel = null,
    enterpriseDomain: java.lang.String = null,
    enterpriseIPRanges: js.Array[WindowsInformationProtectionIPRangeCollection] = null,
    enterpriseIPRangesAreAuthoritative: js.UndefOr[scala.Boolean] = js.undefined,
    enterpriseInternalProxyServers: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseNetworkDomainNames: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProtectedDomainNames: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProxiedDomains: js.Array[WindowsInformationProtectionProxiedDomainCollection] = null,
    enterpriseProxyServers: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProxyServersAreAuthoritative: js.UndefOr[scala.Boolean] = js.undefined,
    exemptAppLockerFiles: js.Array[WindowsInformationProtectionAppLockerFile] = null,
    exemptApps: js.Array[WindowsInformationProtectionApp] = null,
    iconsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    indexingEncryptedStoresOrItemsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    isAssigned: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    mdmEnrollmentUrl: java.lang.String = null,
    minutesOfInactivityBeforeDeviceLock: scala.Int | scala.Double = null,
    neutralDomainResources: js.Array[WindowsInformationProtectionResourceCollection] = null,
    numberOfPastPinsRemembered: scala.Int | scala.Double = null,
    passwordMaximumAttemptCount: scala.Int | scala.Double = null,
    pinExpirationDays: scala.Int | scala.Double = null,
    pinLowercaseLetters: WindowsInformationProtectionPinCharacterRequirements = null,
    pinMinimumLength: scala.Int | scala.Double = null,
    pinSpecialCharacters: WindowsInformationProtectionPinCharacterRequirements = null,
    pinUppercaseLetters: WindowsInformationProtectionPinCharacterRequirements = null,
    protectedAppLockerFiles: js.Array[WindowsInformationProtectionAppLockerFile] = null,
    protectedApps: js.Array[WindowsInformationProtectionApp] = null,
    protectionUnderLockConfigRequired: js.UndefOr[scala.Boolean] = js.undefined,
    revokeOnMdmHandoffDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    revokeOnUnenrollDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    rightsManagementServicesTemplateId: java.lang.String = null,
    smbAutoEncryptedFileExtensions: js.Array[WindowsInformationProtectionResourceCollection] = null,
    version: java.lang.String = null,
    windowsHelloForBusinessBlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): WindowsInformationProtectionPolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(azureRightsManagementServicesAllowed)) __obj.updateDynamic("azureRightsManagementServicesAllowed")(azureRightsManagementServicesAllowed)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (dataRecoveryCertificate != null) __obj.updateDynamic("dataRecoveryCertificate")(dataRecoveryCertificate)
    if (daysWithoutContactBeforeUnenroll != null) __obj.updateDynamic("daysWithoutContactBeforeUnenroll")(daysWithoutContactBeforeUnenroll.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (enforcementLevel != null) __obj.updateDynamic("enforcementLevel")(enforcementLevel)
    if (enterpriseDomain != null) __obj.updateDynamic("enterpriseDomain")(enterpriseDomain)
    if (enterpriseIPRanges != null) __obj.updateDynamic("enterpriseIPRanges")(enterpriseIPRanges)
    if (!js.isUndefined(enterpriseIPRangesAreAuthoritative)) __obj.updateDynamic("enterpriseIPRangesAreAuthoritative")(enterpriseIPRangesAreAuthoritative)
    if (enterpriseInternalProxyServers != null) __obj.updateDynamic("enterpriseInternalProxyServers")(enterpriseInternalProxyServers)
    if (enterpriseNetworkDomainNames != null) __obj.updateDynamic("enterpriseNetworkDomainNames")(enterpriseNetworkDomainNames)
    if (enterpriseProtectedDomainNames != null) __obj.updateDynamic("enterpriseProtectedDomainNames")(enterpriseProtectedDomainNames)
    if (enterpriseProxiedDomains != null) __obj.updateDynamic("enterpriseProxiedDomains")(enterpriseProxiedDomains)
    if (enterpriseProxyServers != null) __obj.updateDynamic("enterpriseProxyServers")(enterpriseProxyServers)
    if (!js.isUndefined(enterpriseProxyServersAreAuthoritative)) __obj.updateDynamic("enterpriseProxyServersAreAuthoritative")(enterpriseProxyServersAreAuthoritative)
    if (exemptAppLockerFiles != null) __obj.updateDynamic("exemptAppLockerFiles")(exemptAppLockerFiles)
    if (exemptApps != null) __obj.updateDynamic("exemptApps")(exemptApps)
    if (!js.isUndefined(iconsVisible)) __obj.updateDynamic("iconsVisible")(iconsVisible)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(indexingEncryptedStoresOrItemsBlocked)) __obj.updateDynamic("indexingEncryptedStoresOrItemsBlocked")(indexingEncryptedStoresOrItemsBlocked)
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (mdmEnrollmentUrl != null) __obj.updateDynamic("mdmEnrollmentUrl")(mdmEnrollmentUrl)
    if (minutesOfInactivityBeforeDeviceLock != null) __obj.updateDynamic("minutesOfInactivityBeforeDeviceLock")(minutesOfInactivityBeforeDeviceLock.asInstanceOf[js.Any])
    if (neutralDomainResources != null) __obj.updateDynamic("neutralDomainResources")(neutralDomainResources)
    if (numberOfPastPinsRemembered != null) __obj.updateDynamic("numberOfPastPinsRemembered")(numberOfPastPinsRemembered.asInstanceOf[js.Any])
    if (passwordMaximumAttemptCount != null) __obj.updateDynamic("passwordMaximumAttemptCount")(passwordMaximumAttemptCount.asInstanceOf[js.Any])
    if (pinExpirationDays != null) __obj.updateDynamic("pinExpirationDays")(pinExpirationDays.asInstanceOf[js.Any])
    if (pinLowercaseLetters != null) __obj.updateDynamic("pinLowercaseLetters")(pinLowercaseLetters)
    if (pinMinimumLength != null) __obj.updateDynamic("pinMinimumLength")(pinMinimumLength.asInstanceOf[js.Any])
    if (pinSpecialCharacters != null) __obj.updateDynamic("pinSpecialCharacters")(pinSpecialCharacters)
    if (pinUppercaseLetters != null) __obj.updateDynamic("pinUppercaseLetters")(pinUppercaseLetters)
    if (protectedAppLockerFiles != null) __obj.updateDynamic("protectedAppLockerFiles")(protectedAppLockerFiles)
    if (protectedApps != null) __obj.updateDynamic("protectedApps")(protectedApps)
    if (!js.isUndefined(protectionUnderLockConfigRequired)) __obj.updateDynamic("protectionUnderLockConfigRequired")(protectionUnderLockConfigRequired)
    if (!js.isUndefined(revokeOnMdmHandoffDisabled)) __obj.updateDynamic("revokeOnMdmHandoffDisabled")(revokeOnMdmHandoffDisabled)
    if (!js.isUndefined(revokeOnUnenrollDisabled)) __obj.updateDynamic("revokeOnUnenrollDisabled")(revokeOnUnenrollDisabled)
    if (rightsManagementServicesTemplateId != null) __obj.updateDynamic("rightsManagementServicesTemplateId")(rightsManagementServicesTemplateId)
    if (smbAutoEncryptedFileExtensions != null) __obj.updateDynamic("smbAutoEncryptedFileExtensions")(smbAutoEncryptedFileExtensions)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(windowsHelloForBusinessBlocked)) __obj.updateDynamic("windowsHelloForBusinessBlocked")(windowsHelloForBusinessBlocked)
    __obj.asInstanceOf[WindowsInformationProtectionPolicy]
  }
}

