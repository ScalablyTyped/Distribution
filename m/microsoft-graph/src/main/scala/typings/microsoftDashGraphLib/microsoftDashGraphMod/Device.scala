package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends DirectoryObject {
  /** true if the account is enabled; otherwise, false. Required. */
  var accountEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** For internal use only. Not nullable. */
  var alternativeSecurityIds: js.UndefOr[js.Array[AlternativeSecurityId]] = js.undefined
  /**
    * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var approximateLastSignInDateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var complianceExpirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier set by Azure Device Registration Service at the time of registration. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** For interal use only. Set to null. */
  var deviceMetadata: js.UndefOr[java.lang.String] = js.undefined
  /** For interal use only. */
  var deviceVersion: js.UndefOr[scala.Double] = js.undefined
  /** The display name for the device. Required. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of open extensions defined for the device. Read-only. Nullable. */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
    * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only.
    * This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false.
    * This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isManaged: js.UndefOr[scala.Boolean] = js.undefined
  /** Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. */
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z' Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced;
    * null if this object has never been synced from an on-premises directory (default). Read-only.
    */
  var onPremisesSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The type of operating system on the device. Required. */
  var operatingSystem: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the operating system on the device. Required. */
  var operatingSystemVersion: js.UndefOr[java.lang.String] = js.undefined
  /** For interal use only. Not nullable. */
  var physicalIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT */
  var profileType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration.
    * Currently, there can be only one owner. Read-only. Nullable.
    */
  var registeredOwners: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Collection of registered users of the device.
    * For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
    */
  var registeredUsers: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /** List of labels applied to the device by the system. */
  var systemLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Type of trust for the joined device. Read-only.
    * Possible values: Workplace - indicates bring your own personal devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD.
    * For more details, see Introduction to device management in Azure Active Directory
    */
  var trustType: js.UndefOr[java.lang.String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    accountEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    alternativeSecurityIds: js.Array[AlternativeSecurityId] = null,
    approximateLastSignInDateTime: java.lang.String = null,
    complianceExpirationDateTime: java.lang.String = null,
    deletedDateTime: java.lang.String = null,
    deviceId: java.lang.String = null,
    deviceMetadata: java.lang.String = null,
    deviceVersion: scala.Int | scala.Double = null,
    displayName: java.lang.String = null,
    extensions: js.Array[Extension] = null,
    id: java.lang.String = null,
    isCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    isManaged: js.UndefOr[scala.Boolean] = js.undefined,
    memberOf: js.Array[DirectoryObject] = null,
    onPremisesLastSyncDateTime: java.lang.String = null,
    onPremisesSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    operatingSystem: java.lang.String = null,
    operatingSystemVersion: java.lang.String = null,
    physicalIds: js.Array[java.lang.String] = null,
    profileType: java.lang.String = null,
    registeredOwners: js.Array[DirectoryObject] = null,
    registeredUsers: js.Array[DirectoryObject] = null,
    systemLabels: js.Array[java.lang.String] = null,
    transitiveMemberOf: js.Array[DirectoryObject] = null,
    trustType: java.lang.String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountEnabled)) __obj.updateDynamic("accountEnabled")(accountEnabled)
    if (alternativeSecurityIds != null) __obj.updateDynamic("alternativeSecurityIds")(alternativeSecurityIds)
    if (approximateLastSignInDateTime != null) __obj.updateDynamic("approximateLastSignInDateTime")(approximateLastSignInDateTime)
    if (complianceExpirationDateTime != null) __obj.updateDynamic("complianceExpirationDateTime")(complianceExpirationDateTime)
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata)
    if (deviceVersion != null) __obj.updateDynamic("deviceVersion")(deviceVersion.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isCompliant)) __obj.updateDynamic("isCompliant")(isCompliant)
    if (!js.isUndefined(isManaged)) __obj.updateDynamic("isManaged")(isManaged)
    if (memberOf != null) __obj.updateDynamic("memberOf")(memberOf)
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime)
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled)
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem)
    if (operatingSystemVersion != null) __obj.updateDynamic("operatingSystemVersion")(operatingSystemVersion)
    if (physicalIds != null) __obj.updateDynamic("physicalIds")(physicalIds)
    if (profileType != null) __obj.updateDynamic("profileType")(profileType)
    if (registeredOwners != null) __obj.updateDynamic("registeredOwners")(registeredOwners)
    if (registeredUsers != null) __obj.updateDynamic("registeredUsers")(registeredUsers)
    if (systemLabels != null) __obj.updateDynamic("systemLabels")(systemLabels)
    if (transitiveMemberOf != null) __obj.updateDynamic("transitiveMemberOf")(transitiveMemberOf)
    if (trustType != null) __obj.updateDynamic("trustType")(trustType)
    __obj.asInstanceOf[Device]
  }
}

