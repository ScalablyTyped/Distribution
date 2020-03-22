package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Configurable template for a manual filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait PivotManualFilter extends js.Object {
  /**
    *
    * A list of selected items to manually filter. These must be existing and valid items from the chosen field.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var selectedItems: js.UndefOr[js.Array[String | PivotItem]] = js.undefined
}

object PivotManualFilter {
  @scala.inline
  def apply(selectedItems: js.Array[String | PivotItem] = null): PivotManualFilter = {
    val __obj = js.Dynamic.literal()
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotManualFilter]
  }
}

