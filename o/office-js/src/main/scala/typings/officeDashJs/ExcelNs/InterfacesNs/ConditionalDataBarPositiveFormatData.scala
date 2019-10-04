package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalDataBarPositiveFormat.toJSON()`. */
trait ConditionalDataBarPositiveFormatData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no border is present or set.
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
    * Boolean representation of whether or not the DataBar has a gradient.
    *
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.undefined
}

object ConditionalDataBarPositiveFormatData {
  @scala.inline
  def apply(
    borderColor: String = null,
    fillColor: String = null,
    gradientFill: js.UndefOr[Boolean] = js.undefined
  ): ConditionalDataBarPositiveFormatData = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(gradientFill)) __obj.updateDynamic("gradientFill")(gradientFill)
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatData]
  }
}

