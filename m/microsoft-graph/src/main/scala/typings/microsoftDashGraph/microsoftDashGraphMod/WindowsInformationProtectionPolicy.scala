package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionPolicy extends WindowsInformationProtection {
  // Offline interval before app data is wiped (days)
  var daysWithoutContactBeforeUnenroll: js.UndefOr[Double] = js.undefined
  // Enrollment url for the MDM
  var mdmEnrollmentUrl: js.UndefOr[String] = js.undefined
  /**
    * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become
    * PIN or password locked. Range is an integer X where 0 &amp;lt;= X &amp;lt;= 999.
    */
  var minutesOfInactivityBeforeDeviceLock: js.UndefOr[Double] = js.undefined
  /**
    * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The
    * largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy
    * setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows
    * 10, version 1511. Default is 0.
    */
  var numberOfPastPinsRemembered: js.UndefOr[Double] = js.undefined
  /**
    * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe
    * functionality. Range is an integer X where 4 &amp;lt;= X &amp;lt;= 16 for desktop and 0 &amp;lt;= X &amp;lt;= 999 for
    * mobile devices.
    */
  var passwordMaximumAttemptCount: js.UndefOr[Double] = js.undefined
  /**
    * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to
    * change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for
    * this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in
    * Windows 10, version 1511. Default is 0.
    */
  var pinExpirationDays: js.UndefOr[Double] = js.undefined
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
  var pinMinimumLength: js.UndefOr[Double] = js.undefined
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
  var revokeOnMdmHandoffDisabled: js.UndefOr[Boolean] = js.undefined
  // Boolean value that sets Windows Hello for Business as a method for signing into Windows.
  var windowsHelloForBusinessBlocked: js.UndefOr[Boolean] = js.undefined
}

object WindowsInformationProtectionPolicy {
  @scala.inline
  def apply(
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    azureRightsManagementServicesAllowed: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    dataRecoveryCertificate: WindowsInformationProtectionDataRecoveryCertificate = null,
    daysWithoutContactBeforeUnenroll: Int | Double = null,
    description: String = null,
    displayName: String = null,
    enforcementLevel: WindowsInformationProtectionEnforcementLevel = null,
    enterpriseDomain: String = null,
    enterpriseIPRanges: js.Array[WindowsInformationProtectionIPRangeCollection] = null,
    enterpriseIPRangesAreAuthoritative: js.UndefOr[Boolean] = js.undefined,
    enterpriseInternalProxyServers: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseNetworkDomainNames: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProtectedDomainNames: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProxiedDomains: js.Array[WindowsInformationProtectionProxiedDomainCollection] = null,
    enterpriseProxyServers: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProxyServersAreAuthoritative: js.UndefOr[Boolean] = js.undefined,
    exemptAppLockerFiles: js.Array[WindowsInformationProtectionAppLockerFile] = null,
    exemptApps: js.Array[WindowsInformationProtectionApp] = null,
    iconsVisible: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    indexingEncryptedStoresOrItemsBlocked: js.UndefOr[Boolean] = js.undefined,
    isAssigned: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    mdmEnrollmentUrl: String = null,
    minutesOfInactivityBeforeDeviceLock: Int | Double = null,
    neutralDomainResources: js.Array[WindowsInformationProtectionResourceCollection] = null,
    numberOfPastPinsRemembered: Int | Double = null,
    passwordMaximumAttemptCount: Int | Double = null,
    pinExpirationDays: Int | Double = null,
    pinLowercaseLetters: WindowsInformationProtectionPinCharacterRequirements = null,
    pinMinimumLength: Int | Double = null,
    pinSpecialCharacters: WindowsInformationProtectionPinCharacterRequirements = null,
    pinUppercaseLetters: WindowsInformationProtectionPinCharacterRequirements = null,
    protectedAppLockerFiles: js.Array[WindowsInformationProtectionAppLockerFile] = null,
    protectedApps: js.Array[WindowsInformationProtectionApp] = null,
    protectionUnderLockConfigRequired: js.UndefOr[Boolean] = js.undefined,
    revokeOnMdmHandoffDisabled: js.UndefOr[Boolean] = js.undefined,
    revokeOnUnenrollDisabled: js.UndefOr[Boolean] = js.undefined,
    rightsManagementServicesTemplateId: String = null,
    smbAutoEncryptedFileExtensions: js.Array[WindowsInformationProtectionResourceCollection] = null,
    version: String = null,
    windowsHelloForBusinessBlocked: js.UndefOr[Boolean] = js.undefined
  ): WindowsInformationProtectionPolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(azureRightsManagementServicesAllowed)) __obj.updateDynamic("azureRightsManagementServicesAllowed")(azureRightsManagementServicesAllowed.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (dataRecoveryCertificate != null) __obj.updateDynamic("dataRecoveryCertificate")(dataRecoveryCertificate.asInstanceOf[js.Any])
    if (daysWithoutContactBeforeUnenroll != null) __obj.updateDynamic("daysWithoutContactBeforeUnenroll")(daysWithoutContactBeforeUnenroll.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enforcementLevel != null) __obj.updateDynamic("enforcementLevel")(enforcementLevel.asInstanceOf[js.Any])
    if (enterpriseDomain != null) __obj.updateDynamic("enterpriseDomain")(enterpriseDomain.asInstanceOf[js.Any])
    if (enterpriseIPRanges != null) __obj.updateDynamic("enterpriseIPRanges")(enterpriseIPRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(enterpriseIPRangesAreAuthoritative)) __obj.updateDynamic("enterpriseIPRangesAreAuthoritative")(enterpriseIPRangesAreAuthoritative.asInstanceOf[js.Any])
    if (enterpriseInternalProxyServers != null) __obj.updateDynamic("enterpriseInternalProxyServers")(enterpriseInternalProxyServers.asInstanceOf[js.Any])
    if (enterpriseNetworkDomainNames != null) __obj.updateDynamic("enterpriseNetworkDomainNames")(enterpriseNetworkDomainNames.asInstanceOf[js.Any])
    if (enterpriseProtectedDomainNames != null) __obj.updateDynamic("enterpriseProtectedDomainNames")(enterpriseProtectedDomainNames.asInstanceOf[js.Any])
    if (enterpriseProxiedDomains != null) __obj.updateDynamic("enterpriseProxiedDomains")(enterpriseProxiedDomains.asInstanceOf[js.Any])
    if (enterpriseProxyServers != null) __obj.updateDynamic("enterpriseProxyServers")(enterpriseProxyServers.asInstanceOf[js.Any])
    if (!js.isUndefined(enterpriseProxyServersAreAuthoritative)) __obj.updateDynamic("enterpriseProxyServersAreAuthoritative")(enterpriseProxyServersAreAuthoritative.asInstanceOf[js.Any])
    if (exemptAppLockerFiles != null) __obj.updateDynamic("exemptAppLockerFiles")(exemptAppLockerFiles.asInstanceOf[js.Any])
    if (exemptApps != null) __obj.updateDynamic("exemptApps")(exemptApps.asInstanceOf[js.Any])
    if (!js.isUndefined(iconsVisible)) __obj.updateDynamic("iconsVisible")(iconsVisible.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indexingEncryptedStoresOrItemsBlocked)) __obj.updateDynamic("indexingEncryptedStoresOrItemsBlocked")(indexingEncryptedStoresOrItemsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (mdmEnrollmentUrl != null) __obj.updateDynamic("mdmEnrollmentUrl")(mdmEnrollmentUrl.asInstanceOf[js.Any])
    if (minutesOfInactivityBeforeDeviceLock != null) __obj.updateDynamic("minutesOfInactivityBeforeDeviceLock")(minutesOfInactivityBeforeDeviceLock.asInstanceOf[js.Any])
    if (neutralDomainResources != null) __obj.updateDynamic("neutralDomainResources")(neutralDomainResources.asInstanceOf[js.Any])
    if (numberOfPastPinsRemembered != null) __obj.updateDynamic("numberOfPastPinsRemembered")(numberOfPastPinsRemembered.asInstanceOf[js.Any])
    if (passwordMaximumAttemptCount != null) __obj.updateDynamic("passwordMaximumAttemptCount")(passwordMaximumAttemptCount.asInstanceOf[js.Any])
    if (pinExpirationDays != null) __obj.updateDynamic("pinExpirationDays")(pinExpirationDays.asInstanceOf[js.Any])
    if (pinLowercaseLetters != null) __obj.updateDynamic("pinLowercaseLetters")(pinLowercaseLetters.asInstanceOf[js.Any])
    if (pinMinimumLength != null) __obj.updateDynamic("pinMinimumLength")(pinMinimumLength.asInstanceOf[js.Any])
    if (pinSpecialCharacters != null) __obj.updateDynamic("pinSpecialCharacters")(pinSpecialCharacters.asInstanceOf[js.Any])
    if (pinUppercaseLetters != null) __obj.updateDynamic("pinUppercaseLetters")(pinUppercaseLetters.asInstanceOf[js.Any])
    if (protectedAppLockerFiles != null) __obj.updateDynamic("protectedAppLockerFiles")(protectedAppLockerFiles.asInstanceOf[js.Any])
    if (protectedApps != null) __obj.updateDynamic("protectedApps")(protectedApps.asInstanceOf[js.Any])
    if (!js.isUndefined(protectionUnderLockConfigRequired)) __obj.updateDynamic("protectionUnderLockConfigRequired")(protectionUnderLockConfigRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(revokeOnMdmHandoffDisabled)) __obj.updateDynamic("revokeOnMdmHandoffDisabled")(revokeOnMdmHandoffDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(revokeOnUnenrollDisabled)) __obj.updateDynamic("revokeOnUnenrollDisabled")(revokeOnUnenrollDisabled.asInstanceOf[js.Any])
    if (rightsManagementServicesTemplateId != null) __obj.updateDynamic("rightsManagementServicesTemplateId")(rightsManagementServicesTemplateId.asInstanceOf[js.Any])
    if (smbAutoEncryptedFileExtensions != null) __obj.updateDynamic("smbAutoEncryptedFileExtensions")(smbAutoEncryptedFileExtensions.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHelloForBusinessBlocked)) __obj.updateDynamic("windowsHelloForBusinessBlocked")(windowsHelloForBusinessBlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionPolicy]
  }
}

