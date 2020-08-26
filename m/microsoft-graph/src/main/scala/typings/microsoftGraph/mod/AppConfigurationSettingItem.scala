package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppConfigurationSettingItem extends js.Object {
  // app configuration key.
  var appConfigKey: js.UndefOr[String] = js.native
  // app configuration key type. Possible values are: stringType, integerType, realType, booleanType, tokenType.
  var appConfigKeyType: js.UndefOr[MdmAppConfigKeyType] = js.native
  // app configuration key value.
  var appConfigKeyValue: js.UndefOr[String] = js.native
}

object AppConfigurationSettingItem {
  @scala.inline
  def apply(): AppConfigurationSettingItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfigurationSettingItem]
  }
  @scala.inline
  implicit class AppConfigurationSettingItemOps[Self <: AppConfigurationSettingItem] (val x: Self) extends AnyVal {
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
    def setAppConfigKey(value: String): Self = this.set("appConfigKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppConfigKey: Self = this.set("appConfigKey", js.undefined)
    @scala.inline
    def setAppConfigKeyType(value: MdmAppConfigKeyType): Self = this.set("appConfigKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppConfigKeyType: Self = this.set("appConfigKeyType", js.undefined)
    @scala.inline
    def setAppConfigKeyValue(value: String): Self = this.set("appConfigKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppConfigKeyValue: Self = this.set("appConfigKeyValue", js.undefined)
  }
  
}

