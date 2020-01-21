package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalTextComparisonRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TextConditionalFormat object, for use in `textConditionalFormat.set({ ... })`. */
trait TextConditionalFormatUpdateData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalTextComparisonRule] = js.undefined
}

object TextConditionalFormatUpdateData {
  @scala.inline
  def apply(format: ConditionalRangeFormatUpdateData = null, rule: ConditionalTextComparisonRule = null): TextConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConditionalFormatUpdateData]
  }
}

