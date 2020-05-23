package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalDataBarPositiveFormat object, for use in `conditionalDataBarPositiveFormat.set({ ... })`. */
trait ConditionalDataBarPositiveFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies if the DataBar has a gradient.
    *
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.undefined
}

object ConditionalDataBarPositiveFormatUpdateData {
  @scala.inline
  def apply(
    borderColor: String = null,
    fillColor: String = null,
    gradientFill: js.UndefOr[Boolean] = js.undefined
  ): ConditionalDataBarPositiveFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientFill)) __obj.updateDynamic("gradientFill")(gradientFill.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatUpdateData]
  }
}

