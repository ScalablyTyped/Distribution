package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalCellValueRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `cellValueConditionalFormat.toJSON()`. */
trait CellValueConditionalFormatData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  /**
    *
    * Specifies the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalCellValueRule] = js.undefined
}

object CellValueConditionalFormatData {
  @scala.inline
  def apply(format: ConditionalRangeFormatData = null, rule: ConditionalCellValueRule = null): CellValueConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellValueConditionalFormatData]
  }
}

