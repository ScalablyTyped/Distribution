package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeFormat object, for use in `conditionalRangeFormat.set({ ... })`. */
trait ConditionalRangeFormatUpdateData extends js.Object {
  /**
    *
    * Collection of border objects that apply to the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionUpdateData] = js.undefined
  /**
    *
    * Returns the fill object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillUpdateData] = js.undefined
  /**
    *
    * Returns the font object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontUpdateData] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[js.Any] = js.undefined
}

object ConditionalRangeFormatUpdateData {
  @scala.inline
  def apply(
    borders: ConditionalRangeBorderCollectionUpdateData = null,
    fill: ConditionalRangeFillUpdateData = null,
    font: ConditionalRangeFontUpdateData = null,
    numberFormat: js.Any = null
  ): ConditionalRangeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeFormatUpdateData]
  }
}

