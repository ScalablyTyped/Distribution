package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Excel Conditional Data Bar Type.
  *
  * [Api set: ExcelApi 1.6]
  */
trait DataBarConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatLoadOptions] = js.undefined
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatLoadOptions] = js.undefined
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[Boolean] = js.undefined
}

object DataBarConditionalFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    axisColor: js.UndefOr[Boolean] = js.undefined,
    axisFormat: js.UndefOr[Boolean] = js.undefined,
    barDirection: js.UndefOr[Boolean] = js.undefined,
    lowerBoundRule: js.UndefOr[Boolean] = js.undefined,
    negativeFormat: ConditionalDataBarNegativeFormatLoadOptions = null,
    positiveFormat: ConditionalDataBarPositiveFormatLoadOptions = null,
    showDataBarOnly: js.UndefOr[Boolean] = js.undefined,
    upperBoundRule: js.UndefOr[Boolean] = js.undefined
  ): DataBarConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisColor)) __obj.updateDynamic("axisColor")(axisColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisFormat)) __obj.updateDynamic("axisFormat")(axisFormat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barDirection)) __obj.updateDynamic("barDirection")(barDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerBoundRule)) __obj.updateDynamic("lowerBoundRule")(lowerBoundRule.get.asInstanceOf[js.Any])
    if (negativeFormat != null) __obj.updateDynamic("negativeFormat")(negativeFormat.asInstanceOf[js.Any])
    if (positiveFormat != null) __obj.updateDynamic("positiveFormat")(positiveFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataBarOnly)) __obj.updateDynamic("showDataBarOnly")(showDataBarOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upperBoundRule)) __obj.updateDynamic("upperBoundRule")(upperBoundRule.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarConditionalFormatLoadOptions]
  }
}

