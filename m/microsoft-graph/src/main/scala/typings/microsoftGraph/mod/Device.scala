package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends DirectoryObject {
  // true if the account is enabled; otherwise, false. Required.
  var accountEnabled: js.UndefOr[Boolean] = js.native
  // For internal use only. Not nullable.
  var alternativeSecurityIds: js.UndefOr[js.Array[AlternativeSecurityId]] = js.native
  /**
    * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var approximateLastSignInDateTime: js.UndefOr[String] = js.native
  /**
    * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var complianceExpirationDateTime: js.UndefOr[String] = js.native
  // Unique identifier set by Azure Device Registration Service at the time of registration.
  var deviceId: js.UndefOr[String] = js.native
  // For interal use only. Set to null.
  var deviceMetadata: js.UndefOr[String] = js.native
  // For interal use only.
  var deviceVersion: js.UndefOr[Double] = js.native
  // The display name for the device. Required.
  var displayName: js.UndefOr[String] = js.native
  // The collection of open extensions defined for the device. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be
    * updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isCompliant: js.UndefOr[Boolean] = js.native
  /**
    * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by
    * Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isManaged: js.UndefOr[Boolean] = js.native
  // Application identifier used to register device into MDM. Read-only. Supports $filter.
  var mdmAppId: js.UndefOr[String] = js.native
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
    * this: '2014-01-01T00:00:00Z' Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only.
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  // The type of operating system on the device. Required.
  var operatingSystem: js.UndefOr[String] = js.native
  // The version of the operating system on the device. Required.
  var operatingSystemVersion: js.UndefOr[String] = js.native
  // For interal use only. Not nullable.
  var physicalIds: js.UndefOr[js.Array[String]] = js.native
  // The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT
  var profileType: js.UndefOr[String] = js.native
  /**
    * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of
    * registration. Currently, there can be only one owner. Read-only. Nullable.
    */
  var registeredOwners: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered
    * users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
    */
  var registeredUsers: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // List of labels applied to the device by the system.
  var systemLabels: js.UndefOr[js.Array[String]] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Type of trust for the joined device. Read-only. Possible values: Workplace - indicates bring your own personal
    * devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD. For more
    * details, see Introduction to device management in Azure Active Directory
    */
  var trustType: js.UndefOr[String] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setAccountEnabled(value: Boolean): Self = this.set("accountEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountEnabled: Self = this.set("accountEnabled", js.undefined)
    @scala.inline
    def setAlternativeSecurityIdsVarargs(value: AlternativeSecurityId*): Self = this.set("alternativeSecurityIds", js.Array(value :_*))
    @scala.inline
    def setAlternativeSecurityIds(value: js.Array[AlternativeSecurityId]): Self = this.set("alternativeSecurityIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeSecurityIds: Self = this.set("alternativeSecurityIds", js.undefined)
    @scala.inline
    def setApproximateLastSignInDateTime(value: String): Self = this.set("approximateLastSignInDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproximateLastSignInDateTime: Self = this.set("approximateLastSignInDateTime", js.undefined)
    @scala.inline
    def setComplianceExpirationDateTime(value: String): Self = this.set("complianceExpirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceExpirationDateTime: Self = this.set("complianceExpirationDateTime", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDeviceMetadata(value: String): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
    @scala.inline
    def setDeviceVersion(value: Double): Self = this.set("deviceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceVersion: Self = this.set("deviceVersion", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setIsCompliant(value: Boolean): Self = this.set("isCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCompliant: Self = this.set("isCompliant", js.undefined)
    @scala.inline
    def setIsManaged(value: Boolean): Self = this.set("isManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsManaged: Self = this.set("isManaged", js.undefined)
    @scala.inline
    def setMdmAppId(value: String): Self = this.set("mdmAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdmAppId: Self = this.set("mdmAppId", js.undefined)
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    @scala.inline
    def setMemberOf(value: js.Array[DirectoryObject]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: String): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    @scala.inline
    def setOnPremisesSyncEnabled(value: Boolean): Self = this.set("onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesSyncEnabled: Self = this.set("onPremisesSyncEnabled", js.undefined)
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    @scala.inline
    def setOperatingSystemVersion(value: String): Self = this.set("operatingSystemVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersion: Self = this.set("operatingSystemVersion", js.undefined)
    @scala.inline
    def setPhysicalIdsVarargs(value: String*): Self = this.set("physicalIds", js.Array(value :_*))
    @scala.inline
    def setPhysicalIds(value: js.Array[String]): Self = this.set("physicalIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalIds: Self = this.set("physicalIds", js.undefined)
    @scala.inline
    def setProfileType(value: String): Self = this.set("profileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileType: Self = this.set("profileType", js.undefined)
    @scala.inline
    def setRegisteredOwnersVarargs(value: DirectoryObject*): Self = this.set("registeredOwners", js.Array(value :_*))
    @scala.inline
    def setRegisteredOwners(value: js.Array[DirectoryObject]): Self = this.set("registeredOwners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredOwners: Self = this.set("registeredOwners", js.undefined)
    @scala.inline
    def setRegisteredUsersVarargs(value: DirectoryObject*): Self = this.set("registeredUsers", js.Array(value :_*))
    @scala.inline
    def setRegisteredUsers(value: js.Array[DirectoryObject]): Self = this.set("registeredUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredUsers: Self = this.set("registeredUsers", js.undefined)
    @scala.inline
    def setSystemLabelsVarargs(value: String*): Self = this.set("systemLabels", js.Array(value :_*))
    @scala.inline
    def setSystemLabels(value: js.Array[String]): Self = this.set("systemLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemLabels: Self = this.set("systemLabels", js.undefined)
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    @scala.inline
    def setTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
    @scala.inline
    def setTrustType(value: String): Self = this.set("trustType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustType: Self = this.set("trustType", js.undefined)
  }
  
}

