package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationSettingState extends js.Object {
  // Current value of setting on device
  var currentValue: js.UndefOr[String] = js.native
  // Error code for the setting
  var errorCode: js.UndefOr[Double] = js.native
  // Error description
  var errorDescription: js.UndefOr[String] = js.native
  // Name of setting instance that is being reported.
  var instanceDisplayName: js.UndefOr[String] = js.native
  // The setting that is being reported
  var setting: js.UndefOr[String] = js.native
  // Localized/user friendly setting name that is being reported
  var settingName: js.UndefOr[String] = js.native
  // Contributing policies
  var sources: js.UndefOr[js.Array[SettingSource]] = js.native
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.native
  // UserEmail
  var userEmail: js.UndefOr[String] = js.native
  // UserId
  var userId: js.UndefOr[String] = js.native
  // UserName
  var userName: js.UndefOr[String] = js.native
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object DeviceConfigurationSettingState {
  @scala.inline
  def apply(): DeviceConfigurationSettingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationSettingState]
  }
  @scala.inline
  implicit class DeviceConfigurationSettingStateOps[Self <: DeviceConfigurationSettingState] (val x: Self) extends AnyVal {
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
    def setCurrentValue(value: String): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentValue: Self = this.set("currentValue", js.undefined)
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorDescription(value: String): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDescription: Self = this.set("errorDescription", js.undefined)
    @scala.inline
    def setInstanceDisplayName(value: String): Self = this.set("instanceDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceDisplayName: Self = this.set("instanceDisplayName", js.undefined)
    @scala.inline
    def setSetting(value: String): Self = this.set("setting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
    @scala.inline
    def setSettingName(value: String): Self = this.set("settingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingName: Self = this.set("settingName", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: SettingSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[SettingSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setState(value: ComplianceStatus): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
  }
  
}

