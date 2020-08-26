package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration {
  // mdm app configuration Base64 binary.
  var encodedSettingXml: js.UndefOr[Double] = js.native
  // app configuration setting items.
  var settings: js.UndefOr[js.Array[AppConfigurationSettingItem]] = js.native
}

object IosMobileAppConfiguration {
  @scala.inline
  def apply(): IosMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMobileAppConfiguration]
  }
  @scala.inline
  implicit class IosMobileAppConfigurationOps[Self <: IosMobileAppConfiguration] (val x: Self) extends AnyVal {
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
    def setEncodedSettingXml(value: Double): Self = this.set("encodedSettingXml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodedSettingXml: Self = this.set("encodedSettingXml", js.undefined)
    @scala.inline
    def setSettingsVarargs(value: AppConfigurationSettingItem*): Self = this.set("settings", js.Array(value :_*))
    @scala.inline
    def setSettings(value: js.Array[AppConfigurationSettingItem]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

