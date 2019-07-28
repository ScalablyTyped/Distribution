package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CellValueConditionalFormat object, for use in "cellValueConditionalFormat.set({ ... })". */
trait CellValueConditionalFormatUpdateData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  /**
    *
    * Represents the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalCellValueRule] = js.undefined
}

object CellValueConditionalFormatUpdateData {
  @scala.inline
  def apply(format: ConditionalRangeFormatUpdateData = null, rule: ConditionalCellValueRule = null): CellValueConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[CellValueConditionalFormatUpdateData]
  }
}

