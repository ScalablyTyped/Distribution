package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomProperty object, for use in `customProperty.set({ ... })`. */
trait CustomPropertyUpdateData extends js.Object {
  /**
    *
    * The value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CustomPropertyUpdateData {
  @scala.inline
  def apply(value: js.Any = null): CustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyUpdateData]
  }
}

