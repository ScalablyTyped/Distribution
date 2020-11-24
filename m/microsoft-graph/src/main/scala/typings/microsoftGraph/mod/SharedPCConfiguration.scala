package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedPCConfiguration extends DeviceConfiguration {
  
  // Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
  var accountManagerPolicy: js.UndefOr[NullableOption[SharedPCAccountManagerPolicy]] = js.native
  
  // Specifies whether local storage is allowed on a shared PC.
  var allowLocalStorage: js.UndefOr[Boolean] = js.native
  
  // Indicates which type of accounts are allowed to use on a shared PC. Possible values are: guest, domain.
  var allowedAccounts: js.UndefOr[SharedPCAllowedAccountType] = js.native
  
  // Disables the account manager for shared PC mode.
  var disableAccountManager: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and
    * later, this policy will be applied without setting Enabled to true.
    */
  var disableEduPolicies: js.UndefOr[Boolean] = js.native
  
  // Specifies whether the default shared PC power policies should be disabled.
  var disablePowerPolicies: js.UndefOr[Boolean] = js.native
  
  // Disables the requirement to sign in whenever the device wakes up from sleep mode.
  var disableSignInOnResume: js.UndefOr[Boolean] = js.native
  
  // Enables shared PC mode and applies the shared pc policies.
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents
    * the sleep timeout from occurring.
    */
  var idleTimeBeforeSleepInSeconds: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Specifies the display text for the account shown on the sign-in screen which launches the app specified by
    * SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
    */
  var kioskAppDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the application user model ID of the app to use with assigned access.
  var kioskAppUserModelId: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the daily start time of maintenance hour.
  var maintenanceStartTime: js.UndefOr[NullableOption[String]] = js.native
}
object SharedPCConfiguration {
  
  @scala.inline
  def apply(): SharedPCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPCConfiguration]
  }
  
  @scala.inline
  implicit class SharedPCConfigurationOps[Self <: SharedPCConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAccountManagerPolicy(value: NullableOption[SharedPCAccountManagerPolicy]): Self = this.set("accountManagerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountManagerPolicy: Self = this.set("accountManagerPolicy", js.undefined)
    
    @scala.inline
    def setAccountManagerPolicyNull: Self = this.set("accountManagerPolicy", null)
    
    @scala.inline
    def setAllowLocalStorage(value: Boolean): Self = this.set("allowLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLocalStorage: Self = this.set("allowLocalStorage", js.undefined)
    
    @scala.inline
    def setAllowedAccounts(value: SharedPCAllowedAccountType): Self = this.set("allowedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAccounts: Self = this.set("allowedAccounts", js.undefined)
    
    @scala.inline
    def setDisableAccountManager(value: Boolean): Self = this.set("disableAccountManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAccountManager: Self = this.set("disableAccountManager", js.undefined)
    
    @scala.inline
    def setDisableEduPolicies(value: Boolean): Self = this.set("disableEduPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEduPolicies: Self = this.set("disableEduPolicies", js.undefined)
    
    @scala.inline
    def setDisablePowerPolicies(value: Boolean): Self = this.set("disablePowerPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePowerPolicies: Self = this.set("disablePowerPolicies", js.undefined)
    
    @scala.inline
    def setDisableSignInOnResume(value: Boolean): Self = this.set("disableSignInOnResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSignInOnResume: Self = this.set("disableSignInOnResume", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIdleTimeBeforeSleepInSeconds(value: NullableOption[Double]): Self = this.set("idleTimeBeforeSleepInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeBeforeSleepInSeconds: Self = this.set("idleTimeBeforeSleepInSeconds", js.undefined)
    
    @scala.inline
    def setIdleTimeBeforeSleepInSecondsNull: Self = this.set("idleTimeBeforeSleepInSeconds", null)
    
    @scala.inline
    def setKioskAppDisplayName(value: NullableOption[String]): Self = this.set("kioskAppDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKioskAppDisplayName: Self = this.set("kioskAppDisplayName", js.undefined)
    
    @scala.inline
    def setKioskAppDisplayNameNull: Self = this.set("kioskAppDisplayName", null)
    
    @scala.inline
    def setKioskAppUserModelId(value: NullableOption[String]): Self = this.set("kioskAppUserModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKioskAppUserModelId: Self = this.set("kioskAppUserModelId", js.undefined)
    
    @scala.inline
    def setKioskAppUserModelIdNull: Self = this.set("kioskAppUserModelId", null)
    
    @scala.inline
    def setMaintenanceStartTime(value: NullableOption[String]): Self = this.set("maintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceStartTime: Self = this.set("maintenanceStartTime", js.undefined)
    
    @scala.inline
    def setMaintenanceStartTimeNull: Self = this.set("maintenanceStartTime", null)
  }
}
