package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingValue extends js.Object {
  /** Name of the setting (as defined by the groupSettingTemplate). */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the setting. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object SettingValue {
  @scala.inline
  def apply(name: java.lang.String = null, value: java.lang.String = null): SettingValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SettingValue]
  }
}

