package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedPCAccountManagerPolicy extends js.Object {
  
  /**
    * Configures when accounts are deleted. Possible values are: immediate, diskSpaceThreshold,
    * diskSpaceThresholdOrInactiveThreshold.
    */
  var accountDeletionPolicy: js.UndefOr[SharedPCAccountDeletionPolicyType] = js.native
  
  /**
    * Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only
    * applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to
    * 100
    */
  var cacheAccountsAboveDiskFreePercentage: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Specifies when the accounts will start being deleted when they have not been logged on during the specified period,
    * given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or
    * DiskSpaceThresholdOrInactiveThreshold.
    */
  var inactiveThresholdDays: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts
    * that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is
    * DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
    */
  var removeAccountsBelowDiskFreePercentage: js.UndefOr[NullableOption[Double]] = js.native
}
object SharedPCAccountManagerPolicy {
  
  @scala.inline
  def apply(): SharedPCAccountManagerPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPCAccountManagerPolicy]
  }
  
  @scala.inline
  implicit class SharedPCAccountManagerPolicyOps[Self <: SharedPCAccountManagerPolicy] (val x: Self) extends AnyVal {
    
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
    def setAccountDeletionPolicy(value: SharedPCAccountDeletionPolicyType): Self = this.set("accountDeletionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountDeletionPolicy: Self = this.set("accountDeletionPolicy", js.undefined)
    
    @scala.inline
    def setCacheAccountsAboveDiskFreePercentage(value: NullableOption[Double]): Self = this.set("cacheAccountsAboveDiskFreePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheAccountsAboveDiskFreePercentage: Self = this.set("cacheAccountsAboveDiskFreePercentage", js.undefined)
    
    @scala.inline
    def setCacheAccountsAboveDiskFreePercentageNull: Self = this.set("cacheAccountsAboveDiskFreePercentage", null)
    
    @scala.inline
    def setInactiveThresholdDays(value: NullableOption[Double]): Self = this.set("inactiveThresholdDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveThresholdDays: Self = this.set("inactiveThresholdDays", js.undefined)
    
    @scala.inline
    def setInactiveThresholdDaysNull: Self = this.set("inactiveThresholdDays", null)
    
    @scala.inline
    def setRemoveAccountsBelowDiskFreePercentage(value: NullableOption[Double]): Self = this.set("removeAccountsBelowDiskFreePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAccountsBelowDiskFreePercentage: Self = this.set("removeAccountsBelowDiskFreePercentage", js.undefined)
    
    @scala.inline
    def setRemoveAccountsBelowDiskFreePercentageNull: Self = this.set("removeAccountsBelowDiskFreePercentage", null)
  }
}
