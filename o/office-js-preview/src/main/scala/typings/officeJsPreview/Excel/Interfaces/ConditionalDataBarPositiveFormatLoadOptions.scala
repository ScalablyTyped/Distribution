package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a conditional format DataBar Format for the positive side of the data bar.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalDataBarPositiveFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the DataBar has a gradient.
    *
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.undefined
}

object ConditionalDataBarPositiveFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    borderColor: js.UndefOr[Boolean] = js.undefined,
    fillColor: js.UndefOr[Boolean] = js.undefined,
    gradientFill: js.UndefOr[Boolean] = js.undefined
  ): ConditionalDataBarPositiveFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderColor)) __obj.updateDynamic("borderColor")(borderColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientFill)) __obj.updateDynamic("gradientFill")(gradientFill.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatLoadOptions]
  }
}

