package typings.officeDashJs.ExcelNs.InterfacesNs

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
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean representation of whether or not the DataBar has a gradient.
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
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(borderColor)) __obj.updateDynamic("borderColor")(borderColor)
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(gradientFill)) __obj.updateDynamic("gradientFill")(gradientFill)
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatLoadOptions]
  }
}

