package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device
  extends StObject
     with DirectoryObject {
  
  /**
    * true if the account is enabled; otherwise, false. Required. Default is true. Supports $filter (eq, ne, not, in). Only
    * callers in Global Administrator and Cloud Device Administrator roles can set this property.
    */
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // For internal use only. Not nullable. Supports $filter (eq, not, ge, le).
  var alternativeSecurityIds: js.UndefOr[js.Array[AlternativeSecurityId]] = js.undefined
  
  /**
    * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null
    * values) and $orderBy.
    */
  var approximateLastSignInDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    * Read-only.
    */
  var complianceExpirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Unique identifier set by Azure Device Registration Service at the time of registration. This is an alternate key that
    * can be used to reference the device object. Supports $filter (eq, ne, not, startsWith).
    */
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only. Set to null.
  var deviceMetadata: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only.
  var deviceVersion: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null
    * values), $search, and $orderBy.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of open extensions defined for the device. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  /**
    * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be
    * updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne,
    * not).
    */
  var isCompliant: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by
    * Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
    */
  var isManaged: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith).
  var mdmAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and
    * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in).
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null
    * values).
    */
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The version of the operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq
    * on null values).
    */
  var operatingSystemVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith,/$count eq 0, /$count ne 0).
  var physicalIds: js.UndefOr[js.Array[String]] = js.undefined
  
  // The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT.
  var profileType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of
    * registration. Read-only. Nullable. Supports $expand.
    */
  var registeredOwners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered
    * users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports
    * $expand.
    */
  var registeredUsers: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // List of labels applied to the device by the system. Supports $filter (/$count eq 0, /$count ne 0).
  var systemLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  // Groups and administrative units that the device is a member of. This operation is transitive. Supports $expand.
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Type of trust for the joined device. Read-only. Possible values: Workplace (indicates bring your own personal devices),
    * AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details,
    * see Introduction to device management in Azure Active Directory
    */
  var trustType: js.UndefOr[NullableOption[String]] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setAccountEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "accountEnabled", value.asInstanceOf[js.Any])
    
    inline def setAccountEnabledNull: Self = StObject.set(x, "accountEnabled", null)
    
    inline def setAccountEnabledUndefined: Self = StObject.set(x, "accountEnabled", js.undefined)
    
    inline def setAlternativeSecurityIds(value: js.Array[AlternativeSecurityId]): Self = StObject.set(x, "alternativeSecurityIds", value.asInstanceOf[js.Any])
    
    inline def setAlternativeSecurityIdsUndefined: Self = StObject.set(x, "alternativeSecurityIds", js.undefined)
    
    inline def setAlternativeSecurityIdsVarargs(value: AlternativeSecurityId*): Self = StObject.set(x, "alternativeSecurityIds", js.Array(value*))
    
    inline def setApproximateLastSignInDateTime(value: NullableOption[String]): Self = StObject.set(x, "approximateLastSignInDateTime", value.asInstanceOf[js.Any])
    
    inline def setApproximateLastSignInDateTimeNull: Self = StObject.set(x, "approximateLastSignInDateTime", null)
    
    inline def setApproximateLastSignInDateTimeUndefined: Self = StObject.set(x, "approximateLastSignInDateTime", js.undefined)
    
    inline def setComplianceExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "complianceExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setComplianceExpirationDateTimeNull: Self = StObject.set(x, "complianceExpirationDateTime", null)
    
    inline def setComplianceExpirationDateTimeUndefined: Self = StObject.set(x, "complianceExpirationDateTime", js.undefined)
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceMetadata(value: NullableOption[String]): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataNull: Self = StObject.set(x, "deviceMetadata", null)
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    inline def setDeviceVersion(value: NullableOption[Double]): Self = StObject.set(x, "deviceVersion", value.asInstanceOf[js.Any])
    
    inline def setDeviceVersionNull: Self = StObject.set(x, "deviceVersion", null)
    
    inline def setDeviceVersionUndefined: Self = StObject.set(x, "deviceVersion", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setIsCompliant(value: NullableOption[Boolean]): Self = StObject.set(x, "isCompliant", value.asInstanceOf[js.Any])
    
    inline def setIsCompliantNull: Self = StObject.set(x, "isCompliant", null)
    
    inline def setIsCompliantUndefined: Self = StObject.set(x, "isCompliant", js.undefined)
    
    inline def setIsManaged(value: NullableOption[Boolean]): Self = StObject.set(x, "isManaged", value.asInstanceOf[js.Any])
    
    inline def setIsManagedNull: Self = StObject.set(x, "isManaged", null)
    
    inline def setIsManagedUndefined: Self = StObject.set(x, "isManaged", js.undefined)
    
    inline def setMdmAppId(value: NullableOption[String]): Self = StObject.set(x, "mdmAppId", value.asInstanceOf[js.Any])
    
    inline def setMdmAppIdNull: Self = StObject.set(x, "mdmAppId", null)
    
    inline def setMdmAppIdUndefined: Self = StObject.set(x, "mdmAppId", js.undefined)
    
    inline def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    inline def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    inline def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    inline def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value*))
    
    inline def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    inline def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    inline def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    inline def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    inline def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setOperatingSystemVersion(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemVersion", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionNull: Self = StObject.set(x, "operatingSystemVersion", null)
    
    inline def setOperatingSystemVersionUndefined: Self = StObject.set(x, "operatingSystemVersion", js.undefined)
    
    inline def setPhysicalIds(value: js.Array[String]): Self = StObject.set(x, "physicalIds", value.asInstanceOf[js.Any])
    
    inline def setPhysicalIdsUndefined: Self = StObject.set(x, "physicalIds", js.undefined)
    
    inline def setPhysicalIdsVarargs(value: String*): Self = StObject.set(x, "physicalIds", js.Array(value*))
    
    inline def setProfileType(value: NullableOption[String]): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
    
    inline def setProfileTypeNull: Self = StObject.set(x, "profileType", null)
    
    inline def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
    
    inline def setRegisteredOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "registeredOwners", value.asInstanceOf[js.Any])
    
    inline def setRegisteredOwnersNull: Self = StObject.set(x, "registeredOwners", null)
    
    inline def setRegisteredOwnersUndefined: Self = StObject.set(x, "registeredOwners", js.undefined)
    
    inline def setRegisteredOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "registeredOwners", js.Array(value*))
    
    inline def setRegisteredUsers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "registeredUsers", value.asInstanceOf[js.Any])
    
    inline def setRegisteredUsersNull: Self = StObject.set(x, "registeredUsers", null)
    
    inline def setRegisteredUsersUndefined: Self = StObject.set(x, "registeredUsers", js.undefined)
    
    inline def setRegisteredUsersVarargs(value: DirectoryObject*): Self = StObject.set(x, "registeredUsers", js.Array(value*))
    
    inline def setSystemLabels(value: js.Array[String]): Self = StObject.set(x, "systemLabels", value.asInstanceOf[js.Any])
    
    inline def setSystemLabelsUndefined: Self = StObject.set(x, "systemLabels", js.undefined)
    
    inline def setSystemLabelsVarargs(value: String*): Self = StObject.set(x, "systemLabels", js.Array(value*))
    
    inline def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    inline def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    inline def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    inline def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value*))
    
    inline def setTrustType(value: NullableOption[String]): Self = StObject.set(x, "trustType", value.asInstanceOf[js.Any])
    
    inline def setTrustTypeNull: Self = StObject.set(x, "trustType", null)
    
    inline def setTrustTypeUndefined: Self = StObject.set(x, "trustType", js.undefined)
  }
}
