package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ColorScaleConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
    *
    * [Api set: ExcelApi 1.6]
    */
  var threeColorScale: js.UndefOr[Boolean] = js.undefined
}

object ColorScaleConditionalFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    criteria: js.UndefOr[Boolean] = js.undefined,
    threeColorScale: js.UndefOr[Boolean] = js.undefined
  ): ColorScaleConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(criteria)) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(threeColorScale)) __obj.updateDynamic("threeColorScale")(threeColorScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScaleConditionalFormatLoadOptions]
  }
}

