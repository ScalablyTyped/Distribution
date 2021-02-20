package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends DirectoryObject {
  
  // true if the account is enabled; otherwise, false. Required.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // For internal use only. Not nullable.
  var alternativeSecurityIds: js.UndefOr[js.Array[AlternativeSecurityId]] = js.native
  
  /**
    * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var approximateLastSignInDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var complianceExpirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique identifier set by Azure Device Registration Service at the time of registration.
  var deviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // For internal use only. Set to null.
  var deviceMetadata: js.UndefOr[NullableOption[String]] = js.native
  
  // For internal use only.
  var deviceVersion: js.UndefOr[NullableOption[Double]] = js.native
  
  // The display name for the device. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of open extensions defined for the device. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  /**
    * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be
    * updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isCompliant: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by
    * Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isManaged: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Application identifier used to register device into MDM. Read-only. Supports $filter.
  var mdmAppId: js.UndefOr[NullableOption[String]] = js.native
  
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and
    * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
    * like this: '2014-01-01T00:00:00Z' Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only.
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The type of operating system on the device. Required.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.native
  
  // The version of the operating system on the device. Required.
  var operatingSystemVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // For internal use only. Not nullable.
  var physicalIds: js.UndefOr[js.Array[String]] = js.native
  
  // The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT
  var profileType: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of
    * registration. Currently, there can be only one owner. Read-only. Nullable.
    */
  var registeredOwners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered
    * users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
    */
  var registeredUsers: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // List of labels applied to the device by the system.
  var systemLabels: js.UndefOr[js.Array[String]] = js.native
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Type of trust for the joined device. Read-only. Possible values: Workplace - indicates bring your own personal
    * devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD. For more
    * details, see Introduction to device management in Azure Active Directory
    */
  var trustType: js.UndefOr[NullableOption[String]] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEnabledNull: Self = StObject.set(x, "accountEnabled", null)
    
    @scala.inline
    def setAccountEnabledUndefined: Self = StObject.set(x, "accountEnabled", js.undefined)
    
    @scala.inline
    def setAlternativeSecurityIds(value: js.Array[AlternativeSecurityId]): Self = StObject.set(x, "alternativeSecurityIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeSecurityIdsUndefined: Self = StObject.set(x, "alternativeSecurityIds", js.undefined)
    
    @scala.inline
    def setAlternativeSecurityIdsVarargs(value: AlternativeSecurityId*): Self = StObject.set(x, "alternativeSecurityIds", js.Array(value :_*))
    
    @scala.inline
    def setApproximateLastSignInDateTime(value: NullableOption[String]): Self = StObject.set(x, "approximateLastSignInDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateLastSignInDateTimeNull: Self = StObject.set(x, "approximateLastSignInDateTime", null)
    
    @scala.inline
    def setApproximateLastSignInDateTimeUndefined: Self = StObject.set(x, "approximateLastSignInDateTime", js.undefined)
    
    @scala.inline
    def setComplianceExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "complianceExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceExpirationDateTimeNull: Self = StObject.set(x, "complianceExpirationDateTime", null)
    
    @scala.inline
    def setComplianceExpirationDateTimeUndefined: Self = StObject.set(x, "complianceExpirationDateTime", js.undefined)
    
    @scala.inline
    def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: NullableOption[String]): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataNull: Self = StObject.set(x, "deviceMetadata", null)
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    @scala.inline
    def setDeviceVersion(value: NullableOption[Double]): Self = StObject.set(x, "deviceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceVersionNull: Self = StObject.set(x, "deviceVersion", null)
    
    @scala.inline
    def setDeviceVersionUndefined: Self = StObject.set(x, "deviceVersion", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setIsCompliant(value: NullableOption[Boolean]): Self = StObject.set(x, "isCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompliantNull: Self = StObject.set(x, "isCompliant", null)
    
    @scala.inline
    def setIsCompliantUndefined: Self = StObject.set(x, "isCompliant", js.undefined)
    
    @scala.inline
    def setIsManaged(value: NullableOption[Boolean]): Self = StObject.set(x, "isManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManagedNull: Self = StObject.set(x, "isManaged", null)
    
    @scala.inline
    def setIsManagedUndefined: Self = StObject.set(x, "isManaged", js.undefined)
    
    @scala.inline
    def setMdmAppId(value: NullableOption[String]): Self = StObject.set(x, "mdmAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdmAppIdNull: Self = StObject.set(x, "mdmAppId", null)
    
    @scala.inline
    def setMdmAppIdUndefined: Self = StObject.set(x, "mdmAppId", js.undefined)
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    @scala.inline
    def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    @scala.inline
    def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersion(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemVersionNull: Self = StObject.set(x, "operatingSystemVersion", null)
    
    @scala.inline
    def setOperatingSystemVersionUndefined: Self = StObject.set(x, "operatingSystemVersion", js.undefined)
    
    @scala.inline
    def setPhysicalIds(value: js.Array[String]): Self = StObject.set(x, "physicalIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalIdsUndefined: Self = StObject.set(x, "physicalIds", js.undefined)
    
    @scala.inline
    def setPhysicalIdsVarargs(value: String*): Self = StObject.set(x, "physicalIds", js.Array(value :_*))
    
    @scala.inline
    def setProfileType(value: NullableOption[String]): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileTypeNull: Self = StObject.set(x, "profileType", null)
    
    @scala.inline
    def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
    
    @scala.inline
    def setRegisteredOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "registeredOwners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredOwnersNull: Self = StObject.set(x, "registeredOwners", null)
    
    @scala.inline
    def setRegisteredOwnersUndefined: Self = StObject.set(x, "registeredOwners", js.undefined)
    
    @scala.inline
    def setRegisteredOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "registeredOwners", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredUsers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "registeredUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredUsersNull: Self = StObject.set(x, "registeredUsers", null)
    
    @scala.inline
    def setRegisteredUsersUndefined: Self = StObject.set(x, "registeredUsers", js.undefined)
    
    @scala.inline
    def setRegisteredUsersVarargs(value: DirectoryObject*): Self = StObject.set(x, "registeredUsers", js.Array(value :_*))
    
    @scala.inline
    def setSystemLabels(value: js.Array[String]): Self = StObject.set(x, "systemLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLabelsUndefined: Self = StObject.set(x, "systemLabels", js.undefined)
    
    @scala.inline
    def setSystemLabelsVarargs(value: String*): Self = StObject.set(x, "systemLabels", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    @scala.inline
    def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setTrustType(value: NullableOption[String]): Self = StObject.set(x, "trustType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustTypeNull: Self = StObject.set(x, "trustType", null)
    
    @scala.inline
    def setTrustTypeUndefined: Self = StObject.set(x, "trustType", js.undefined)
  }
}
