package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedPCAccountManagerPolicy extends StObject {
  
  /**
    * Configures when accounts are deleted. Possible values are: immediate, diskSpaceThreshold,
    * diskSpaceThresholdOrInactiveThreshold.
    */
  var accountDeletionPolicy: js.UndefOr[SharedPCAccountDeletionPolicyType] = js.undefined
  
  /**
    * Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only
    * applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to
    * 100
    */
  var cacheAccountsAboveDiskFreePercentage: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies when the accounts will start being deleted when they have not been logged on during the specified period,
    * given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or
    * DiskSpaceThresholdOrInactiveThreshold.
    */
  var inactiveThresholdDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts
    * that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is
    * DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
    */
  var removeAccountsBelowDiskFreePercentage: js.UndefOr[NullableOption[Double]] = js.undefined
}
object SharedPCAccountManagerPolicy {
  
  inline def apply(): SharedPCAccountManagerPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPCAccountManagerPolicy]
  }
  
  extension [Self <: SharedPCAccountManagerPolicy](x: Self) {
    
    inline def setAccountDeletionPolicy(value: SharedPCAccountDeletionPolicyType): Self = StObject.set(x, "accountDeletionPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccountDeletionPolicyUndefined: Self = StObject.set(x, "accountDeletionPolicy", js.undefined)
    
    inline def setCacheAccountsAboveDiskFreePercentage(value: NullableOption[Double]): Self = StObject.set(x, "cacheAccountsAboveDiskFreePercentage", value.asInstanceOf[js.Any])
    
    inline def setCacheAccountsAboveDiskFreePercentageNull: Self = StObject.set(x, "cacheAccountsAboveDiskFreePercentage", null)
    
    inline def setCacheAccountsAboveDiskFreePercentageUndefined: Self = StObject.set(x, "cacheAccountsAboveDiskFreePercentage", js.undefined)
    
    inline def setInactiveThresholdDays(value: NullableOption[Double]): Self = StObject.set(x, "inactiveThresholdDays", value.asInstanceOf[js.Any])
    
    inline def setInactiveThresholdDaysNull: Self = StObject.set(x, "inactiveThresholdDays", null)
    
    inline def setInactiveThresholdDaysUndefined: Self = StObject.set(x, "inactiveThresholdDays", js.undefined)
    
    inline def setRemoveAccountsBelowDiskFreePercentage(value: NullableOption[Double]): Self = StObject.set(x, "removeAccountsBelowDiskFreePercentage", value.asInstanceOf[js.Any])
    
    inline def setRemoveAccountsBelowDiskFreePercentageNull: Self = StObject.set(x, "removeAccountsBelowDiskFreePercentage", null)
    
    inline def setRemoveAccountsBelowDiskFreePercentageUndefined: Self = StObject.set(x, "removeAccountsBelowDiskFreePercentage", js.undefined)
  }
}
