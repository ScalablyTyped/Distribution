package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPCAccountManagerPolicy extends js.Object {
  /** Configures when accounts are deleted. Possible values are: immediate, diskSpaceThreshold, diskSpaceThresholdOrInactiveThreshold. */
  var accountDeletionPolicy: js.UndefOr[SharedPCAccountDeletionPolicyType] = js.undefined
  /**
    * Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts.
    * Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
    */
  var cacheAccountsAboveDiskFreePercentage: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days.
    * Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold
    */
  var inactiveThresholdDays: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space.
    * Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
    */
  var removeAccountsBelowDiskFreePercentage: js.UndefOr[scala.Double] = js.undefined
}

object SharedPCAccountManagerPolicy {
  @scala.inline
  def apply(
    accountDeletionPolicy: SharedPCAccountDeletionPolicyType = null,
    cacheAccountsAboveDiskFreePercentage: scala.Int | scala.Double = null,
    inactiveThresholdDays: scala.Int | scala.Double = null,
    removeAccountsBelowDiskFreePercentage: scala.Int | scala.Double = null
  ): SharedPCAccountManagerPolicy = {
    val __obj = js.Dynamic.literal()
    if (accountDeletionPolicy != null) __obj.updateDynamic("accountDeletionPolicy")(accountDeletionPolicy)
    if (cacheAccountsAboveDiskFreePercentage != null) __obj.updateDynamic("cacheAccountsAboveDiskFreePercentage")(cacheAccountsAboveDiskFreePercentage.asInstanceOf[js.Any])
    if (inactiveThresholdDays != null) __obj.updateDynamic("inactiveThresholdDays")(inactiveThresholdDays.asInstanceOf[js.Any])
    if (removeAccountsBelowDiskFreePercentage != null) __obj.updateDynamic("removeAccountsBelowDiskFreePercentage")(removeAccountsBelowDiskFreePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPCAccountManagerPolicy]
  }
}

