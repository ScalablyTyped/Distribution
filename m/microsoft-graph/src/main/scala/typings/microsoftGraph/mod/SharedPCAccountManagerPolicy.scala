package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPCAccountManagerPolicy extends js.Object {
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
  var cacheAccountsAboveDiskFreePercentage: js.UndefOr[Double] = js.undefined
  /**
    * Specifies when the accounts will start being deleted when they have not been logged on during the specified period,
    * given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or
    * DiskSpaceThresholdOrInactiveThreshold.
    */
  var inactiveThresholdDays: js.UndefOr[Double] = js.undefined
  /**
    * Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts
    * that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is
    * DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
    */
  var removeAccountsBelowDiskFreePercentage: js.UndefOr[Double] = js.undefined
}

object SharedPCAccountManagerPolicy {
  @scala.inline
  def apply(
    accountDeletionPolicy: SharedPCAccountDeletionPolicyType = null,
    cacheAccountsAboveDiskFreePercentage: js.UndefOr[Double] = js.undefined,
    inactiveThresholdDays: js.UndefOr[Double] = js.undefined,
    removeAccountsBelowDiskFreePercentage: js.UndefOr[Double] = js.undefined
  ): SharedPCAccountManagerPolicy = {
    val __obj = js.Dynamic.literal()
    if (accountDeletionPolicy != null) __obj.updateDynamic("accountDeletionPolicy")(accountDeletionPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheAccountsAboveDiskFreePercentage)) __obj.updateDynamic("cacheAccountsAboveDiskFreePercentage")(cacheAccountsAboveDiskFreePercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveThresholdDays)) __obj.updateDynamic("inactiveThresholdDays")(inactiveThresholdDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAccountsBelowDiskFreePercentage)) __obj.updateDynamic("removeAccountsBelowDiskFreePercentage")(removeAccountsBelowDiskFreePercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPCAccountManagerPolicy]
  }
}

