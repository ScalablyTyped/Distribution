package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends DirectoryObject {
  // true if the account is enabled; otherwise, false. Required.
  var accountEnabled: js.UndefOr[Boolean] = js.undefined
  // For internal use only. Not nullable.
  var alternativeSecurityIds: js.UndefOr[js.Array[AlternativeSecurityId]] = js.undefined
  /**
    * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var approximateLastSignInDateTime: js.UndefOr[String] = js.undefined
  /**
    * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var complianceExpirationDateTime: js.UndefOr[String] = js.undefined
  // Unique identifier set by Azure Device Registration Service at the time of registration.
  var deviceId: js.UndefOr[String] = js.undefined
  // For interal use only. Set to null.
  var deviceMetadata: js.UndefOr[String] = js.undefined
  // For interal use only.
  var deviceVersion: js.UndefOr[Double] = js.undefined
  // The display name for the device. Required.
  var displayName: js.UndefOr[String] = js.undefined
  // The collection of open extensions defined for the device. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
    * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be
    * updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isCompliant: js.UndefOr[Boolean] = js.undefined
  /**
    * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by
    * Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isManaged: js.UndefOr[Boolean] = js.undefined
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
    * this: '2014-01-01T00:00:00Z' Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.undefined
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only.
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined
  // The type of operating system on the device. Required.
  var operatingSystem: js.UndefOr[String] = js.undefined
  // The version of the operating system on the device. Required.
  var operatingSystemVersion: js.UndefOr[String] = js.undefined
  // For interal use only. Not nullable.
  var physicalIds: js.UndefOr[js.Array[String]] = js.undefined
  // The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT
  var profileType: js.UndefOr[String] = js.undefined
  /**
    * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of
    * registration. Currently, there can be only one owner. Read-only. Nullable.
    */
  var registeredOwners: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered
    * users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
    */
  var registeredUsers: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  // List of labels applied to the device by the system.
  var systemLabels: js.UndefOr[js.Array[String]] = js.undefined
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Type of trust for the joined device. Read-only. Possible values: Workplace - indicates bring your own personal
    * devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD. For more
    * details, see Introduction to device management in Azure Active Directory
    */
  var trustType: js.UndefOr[String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    accountEnabled: js.UndefOr[Boolean] = js.undefined,
    alternativeSecurityIds: js.Array[AlternativeSecurityId] = null,
    approximateLastSignInDateTime: String = null,
    complianceExpirationDateTime: String = null,
    deletedDateTime: String = null,
    deviceId: String = null,
    deviceMetadata: String = null,
    deviceVersion: Int | Double = null,
    displayName: String = null,
    extensions: js.Array[Extension] = null,
    id: String = null,
    isCompliant: js.UndefOr[Boolean] = js.undefined,
    isManaged: js.UndefOr[Boolean] = js.undefined,
    memberOf: js.Array[DirectoryObject] = null,
    onPremisesLastSyncDateTime: String = null,
    onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    operatingSystem: String = null,
    operatingSystemVersion: String = null,
    physicalIds: js.Array[String] = null,
    profileType: String = null,
    registeredOwners: js.Array[DirectoryObject] = null,
    registeredUsers: js.Array[DirectoryObject] = null,
    systemLabels: js.Array[String] = null,
    transitiveMemberOf: js.Array[DirectoryObject] = null,
    trustType: String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountEnabled)) __obj.updateDynamic("accountEnabled")(accountEnabled.asInstanceOf[js.Any])
    if (alternativeSecurityIds != null) __obj.updateDynamic("alternativeSecurityIds")(alternativeSecurityIds.asInstanceOf[js.Any])
    if (approximateLastSignInDateTime != null) __obj.updateDynamic("approximateLastSignInDateTime")(approximateLastSignInDateTime.asInstanceOf[js.Any])
    if (complianceExpirationDateTime != null) __obj.updateDynamic("complianceExpirationDateTime")(complianceExpirationDateTime.asInstanceOf[js.Any])
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (deviceVersion != null) __obj.updateDynamic("deviceVersion")(deviceVersion.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompliant)) __obj.updateDynamic("isCompliant")(isCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(isManaged)) __obj.updateDynamic("isManaged")(isManaged.asInstanceOf[js.Any])
    if (memberOf != null) __obj.updateDynamic("memberOf")(memberOf.asInstanceOf[js.Any])
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (operatingSystemVersion != null) __obj.updateDynamic("operatingSystemVersion")(operatingSystemVersion.asInstanceOf[js.Any])
    if (physicalIds != null) __obj.updateDynamic("physicalIds")(physicalIds.asInstanceOf[js.Any])
    if (profileType != null) __obj.updateDynamic("profileType")(profileType.asInstanceOf[js.Any])
    if (registeredOwners != null) __obj.updateDynamic("registeredOwners")(registeredOwners.asInstanceOf[js.Any])
    if (registeredUsers != null) __obj.updateDynamic("registeredUsers")(registeredUsers.asInstanceOf[js.Any])
    if (systemLabels != null) __obj.updateDynamic("systemLabels")(systemLabels.asInstanceOf[js.Any])
    if (transitiveMemberOf != null) __obj.updateDynamic("transitiveMemberOf")(transitiveMemberOf.asInstanceOf[js.Any])
    if (trustType != null) __obj.updateDynamic("trustType")(trustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

