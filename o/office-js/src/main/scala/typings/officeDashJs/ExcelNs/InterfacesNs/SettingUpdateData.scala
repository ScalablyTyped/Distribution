package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Setting object, for use in `setting.set({ ... })`. */
trait SettingUpdateData extends js.Object {
  /**
    *
    * Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object SettingUpdateData {
  @scala.inline
  def apply(value: js.Any = null): SettingUpdateData = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SettingUpdateData]
  }
}

