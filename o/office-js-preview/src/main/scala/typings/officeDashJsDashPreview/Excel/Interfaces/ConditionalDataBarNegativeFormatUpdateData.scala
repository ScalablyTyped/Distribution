package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalDataBarNegativeFormat object, for use in `conditionalDataBarNegativeFormat.set({ ... })`. */
trait ConditionalDataBarNegativeFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Boolean representation of whether or not the negative DataBar has the same border color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveBorderColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean representation of whether or not the negative DataBar has the same fill color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveFillColor: js.UndefOr[Boolean] = js.undefined
}

object ConditionalDataBarNegativeFormatUpdateData {
  @scala.inline
  def apply(
    borderColor: String = null,
    fillColor: String = null,
    matchPositiveBorderColor: js.UndefOr[Boolean] = js.undefined,
    matchPositiveFillColor: js.UndefOr[Boolean] = js.undefined
  ): ConditionalDataBarNegativeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(matchPositiveBorderColor)) __obj.updateDynamic("matchPositiveBorderColor")(matchPositiveBorderColor)
    if (!js.isUndefined(matchPositiveFillColor)) __obj.updateDynamic("matchPositiveFillColor")(matchPositiveFillColor)
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatUpdateData]
  }
}

