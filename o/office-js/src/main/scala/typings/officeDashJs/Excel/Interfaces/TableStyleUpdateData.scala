package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableStyle object, for use in `tableStyle.set({ ... })`. */
trait TableStyleUpdateData extends js.Object {
  /**
    *
    * Gets the name of the TableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}

object TableStyleUpdateData {
  @scala.inline
  def apply(name: String = null): TableStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyleUpdateData]
  }
}

