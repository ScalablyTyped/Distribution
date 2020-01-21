package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingValue extends js.Object {
  // Name of the setting (as defined by the groupSettingTemplate).
  var name: js.UndefOr[String] = js.undefined
  // Value of the setting.
  var value: js.UndefOr[String] = js.undefined
}

object SettingValue {
  @scala.inline
  def apply(name: String = null, value: String = null): SettingValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingValue]
  }
}

