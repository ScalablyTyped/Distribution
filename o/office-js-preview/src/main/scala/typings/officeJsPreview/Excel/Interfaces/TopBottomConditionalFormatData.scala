package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalTopBottomRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `topBottomConditionalFormat.toJSON()`. */
trait TopBottomConditionalFormatData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  /**
    *
    * The criteria of the Top/Bottom conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalTopBottomRule] = js.undefined
}

object TopBottomConditionalFormatData {
  @scala.inline
  def apply(format: ConditionalRangeFormatData = null, rule: ConditionalTopBottomRule = null): TopBottomConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopBottomConditionalFormatData]
  }
}

