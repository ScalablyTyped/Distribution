package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a conditional format DataBar Format for the negative side of the data bar.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalDataBarNegativeFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "Empty String" if no border is present or set.
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

object ConditionalDataBarNegativeFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    borderColor: js.UndefOr[Boolean] = js.undefined,
    fillColor: js.UndefOr[Boolean] = js.undefined,
    matchPositiveBorderColor: js.UndefOr[Boolean] = js.undefined,
    matchPositiveFillColor: js.UndefOr[Boolean] = js.undefined
  ): ConditionalDataBarNegativeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(borderColor)) __obj.updateDynamic("borderColor")(borderColor)
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(matchPositiveBorderColor)) __obj.updateDynamic("matchPositiveBorderColor")(matchPositiveBorderColor)
    if (!js.isUndefined(matchPositiveFillColor)) __obj.updateDynamic("matchPositiveFillColor")(matchPositiveFillColor)
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatLoadOptions]
  }
}

