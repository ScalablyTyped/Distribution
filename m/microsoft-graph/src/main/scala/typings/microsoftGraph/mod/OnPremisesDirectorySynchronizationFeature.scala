package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesDirectorySynchronizationFeature extends StObject {
  
  // Used to block cloud object takeover via source anchor hard match if enabled.
  var blockCloudObjectTakeoverThroughHardMatchEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Use to block soft match for all objects if enabled for the tenant. Customers are encouraged to enable this feature and
    * keep it enabled until soft matching is required again for their tenancy. This flag should be enabled again after any
    * soft matching has been completed and is no longer needed.
    */
  var blockSoftMatchEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * When true, persists the values of Mobile and OtherMobile in on-premises AD during sync cycles instead of values of
    * MobilePhone or AlternateMobilePhones in Azure AD.
    */
  var bypassDirSyncOverridesEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that cloud password policy applies to users whose passwords are synchronized from on-premises.
  var cloudPasswordPolicyForPasswordSyncedUsersEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to enable concurrent user credentials update in OrgId.
  var concurrentCredentialUpdateEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to enable concurrent user creation in OrgId.
  var concurrentOrgIdProvisioningEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that device write-back is enabled.
  var deviceWritebackEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that directory extensions are being synced from on-premises AD to Azure AD.
  var directoryExtensionsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Used to indicate that for a Microsoft Forefront Online Protection for Exchange (FOPE) migrated tenant, the conflicting
    * proxy address should be migrated over.
    */
  var fopeConflictResolutionEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to enable object-level group writeback feature for additional group types.
  var groupWriteBackEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate on-premise password synchronization is enabled.
  var passwordSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that writeback of password resets from Azure AD to on-premises AD is enabled.
  var passwordWritebackEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that we should quarantine objects with conflicting proxy address.
  var quarantineUponProxyAddressesConflictEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that we should quarantine objects conflicting with duplicate userPrincipalName.
  var quarantineUponUpnConflictEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that we should soft match objects based on userPrincipalName.
  var softMatchOnUpnEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that we should synchronize userPrincipalName objects for managed users with licenses.
  var synchronizeUpnForManagedUsersEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that Microsoft 365 Group write-back is enabled.
  var unifiedGroupWritebackEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Used to indicate that feature to force password change for a user on logon is enabled while synchronizing on-premise
    * credentials.
    */
  var userForcePasswordChangeOnLogonEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Used to indicate that user writeback is enabled.
  var userWritebackEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object OnPremisesDirectorySynchronizationFeature {
  
  inline def apply(): OnPremisesDirectorySynchronizationFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesDirectorySynchronizationFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPremisesDirectorySynchronizationFeature] (val x: Self) extends AnyVal {
    
    inline def setBlockCloudObjectTakeoverThroughHardMatchEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "blockCloudObjectTakeoverThroughHardMatchEnabled", value.asInstanceOf[js.Any])
    
    inline def setBlockCloudObjectTakeoverThroughHardMatchEnabledNull: Self = StObject.set(x, "blockCloudObjectTakeoverThroughHardMatchEnabled", null)
    
    inline def setBlockCloudObjectTakeoverThroughHardMatchEnabledUndefined: Self = StObject.set(x, "blockCloudObjectTakeoverThroughHardMatchEnabled", js.undefined)
    
    inline def setBlockSoftMatchEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "blockSoftMatchEnabled", value.asInstanceOf[js.Any])
    
    inline def setBlockSoftMatchEnabledNull: Self = StObject.set(x, "blockSoftMatchEnabled", null)
    
    inline def setBlockSoftMatchEnabledUndefined: Self = StObject.set(x, "blockSoftMatchEnabled", js.undefined)
    
    inline def setBypassDirSyncOverridesEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "bypassDirSyncOverridesEnabled", value.asInstanceOf[js.Any])
    
    inline def setBypassDirSyncOverridesEnabledNull: Self = StObject.set(x, "bypassDirSyncOverridesEnabled", null)
    
    inline def setBypassDirSyncOverridesEnabledUndefined: Self = StObject.set(x, "bypassDirSyncOverridesEnabled", js.undefined)
    
    inline def setCloudPasswordPolicyForPasswordSyncedUsersEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "cloudPasswordPolicyForPasswordSyncedUsersEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudPasswordPolicyForPasswordSyncedUsersEnabledNull: Self = StObject.set(x, "cloudPasswordPolicyForPasswordSyncedUsersEnabled", null)
    
    inline def setCloudPasswordPolicyForPasswordSyncedUsersEnabledUndefined: Self = StObject.set(x, "cloudPasswordPolicyForPasswordSyncedUsersEnabled", js.undefined)
    
    inline def setConcurrentCredentialUpdateEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "concurrentCredentialUpdateEnabled", value.asInstanceOf[js.Any])
    
    inline def setConcurrentCredentialUpdateEnabledNull: Self = StObject.set(x, "concurrentCredentialUpdateEnabled", null)
    
    inline def setConcurrentCredentialUpdateEnabledUndefined: Self = StObject.set(x, "concurrentCredentialUpdateEnabled", js.undefined)
    
    inline def setConcurrentOrgIdProvisioningEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "concurrentOrgIdProvisioningEnabled", value.asInstanceOf[js.Any])
    
    inline def setConcurrentOrgIdProvisioningEnabledNull: Self = StObject.set(x, "concurrentOrgIdProvisioningEnabled", null)
    
    inline def setConcurrentOrgIdProvisioningEnabledUndefined: Self = StObject.set(x, "concurrentOrgIdProvisioningEnabled", js.undefined)
    
    inline def setDeviceWritebackEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "deviceWritebackEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceWritebackEnabledNull: Self = StObject.set(x, "deviceWritebackEnabled", null)
    
    inline def setDeviceWritebackEnabledUndefined: Self = StObject.set(x, "deviceWritebackEnabled", js.undefined)
    
    inline def setDirectoryExtensionsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "directoryExtensionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectoryExtensionsEnabledNull: Self = StObject.set(x, "directoryExtensionsEnabled", null)
    
    inline def setDirectoryExtensionsEnabledUndefined: Self = StObject.set(x, "directoryExtensionsEnabled", js.undefined)
    
    inline def setFopeConflictResolutionEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "fopeConflictResolutionEnabled", value.asInstanceOf[js.Any])
    
    inline def setFopeConflictResolutionEnabledNull: Self = StObject.set(x, "fopeConflictResolutionEnabled", null)
    
    inline def setFopeConflictResolutionEnabledUndefined: Self = StObject.set(x, "fopeConflictResolutionEnabled", js.undefined)
    
    inline def setGroupWriteBackEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "groupWriteBackEnabled", value.asInstanceOf[js.Any])
    
    inline def setGroupWriteBackEnabledNull: Self = StObject.set(x, "groupWriteBackEnabled", null)
    
    inline def setGroupWriteBackEnabledUndefined: Self = StObject.set(x, "groupWriteBackEnabled", js.undefined)
    
    inline def setPasswordSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "passwordSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setPasswordSyncEnabledNull: Self = StObject.set(x, "passwordSyncEnabled", null)
    
    inline def setPasswordSyncEnabledUndefined: Self = StObject.set(x, "passwordSyncEnabled", js.undefined)
    
    inline def setPasswordWritebackEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "passwordWritebackEnabled", value.asInstanceOf[js.Any])
    
    inline def setPasswordWritebackEnabledNull: Self = StObject.set(x, "passwordWritebackEnabled", null)
    
    inline def setPasswordWritebackEnabledUndefined: Self = StObject.set(x, "passwordWritebackEnabled", js.undefined)
    
    inline def setQuarantineUponProxyAddressesConflictEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "quarantineUponProxyAddressesConflictEnabled", value.asInstanceOf[js.Any])
    
    inline def setQuarantineUponProxyAddressesConflictEnabledNull: Self = StObject.set(x, "quarantineUponProxyAddressesConflictEnabled", null)
    
    inline def setQuarantineUponProxyAddressesConflictEnabledUndefined: Self = StObject.set(x, "quarantineUponProxyAddressesConflictEnabled", js.undefined)
    
    inline def setQuarantineUponUpnConflictEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "quarantineUponUpnConflictEnabled", value.asInstanceOf[js.Any])
    
    inline def setQuarantineUponUpnConflictEnabledNull: Self = StObject.set(x, "quarantineUponUpnConflictEnabled", null)
    
    inline def setQuarantineUponUpnConflictEnabledUndefined: Self = StObject.set(x, "quarantineUponUpnConflictEnabled", js.undefined)
    
    inline def setSoftMatchOnUpnEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "softMatchOnUpnEnabled", value.asInstanceOf[js.Any])
    
    inline def setSoftMatchOnUpnEnabledNull: Self = StObject.set(x, "softMatchOnUpnEnabled", null)
    
    inline def setSoftMatchOnUpnEnabledUndefined: Self = StObject.set(x, "softMatchOnUpnEnabled", js.undefined)
    
    inline def setSynchronizeUpnForManagedUsersEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "synchronizeUpnForManagedUsersEnabled", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeUpnForManagedUsersEnabledNull: Self = StObject.set(x, "synchronizeUpnForManagedUsersEnabled", null)
    
    inline def setSynchronizeUpnForManagedUsersEnabledUndefined: Self = StObject.set(x, "synchronizeUpnForManagedUsersEnabled", js.undefined)
    
    inline def setUnifiedGroupWritebackEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "unifiedGroupWritebackEnabled", value.asInstanceOf[js.Any])
    
    inline def setUnifiedGroupWritebackEnabledNull: Self = StObject.set(x, "unifiedGroupWritebackEnabled", null)
    
    inline def setUnifiedGroupWritebackEnabledUndefined: Self = StObject.set(x, "unifiedGroupWritebackEnabled", js.undefined)
    
    inline def setUserForcePasswordChangeOnLogonEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "userForcePasswordChangeOnLogonEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserForcePasswordChangeOnLogonEnabledNull: Self = StObject.set(x, "userForcePasswordChangeOnLogonEnabled", null)
    
    inline def setUserForcePasswordChangeOnLogonEnabledUndefined: Self = StObject.set(x, "userForcePasswordChangeOnLogonEnabled", js.undefined)
    
    inline def setUserWritebackEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "userWritebackEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserWritebackEnabledNull: Self = StObject.set(x, "userWritebackEnabled", null)
    
    inline def setUserWritebackEnabledUndefined: Self = StObject.set(x, "userWritebackEnabled", js.undefined)
  }
}
