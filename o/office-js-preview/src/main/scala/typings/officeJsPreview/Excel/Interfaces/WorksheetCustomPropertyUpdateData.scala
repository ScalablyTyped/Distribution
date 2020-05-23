package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the WorksheetCustomProperty object, for use in `worksheetCustomProperty.set({ ... })`. */
trait WorksheetCustomPropertyUpdateData extends js.Object {
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[String] = js.undefined
}

object WorksheetCustomPropertyUpdateData {
  @scala.inline
  def apply(value: String = null): WorksheetCustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetCustomPropertyUpdateData]
  }
}

