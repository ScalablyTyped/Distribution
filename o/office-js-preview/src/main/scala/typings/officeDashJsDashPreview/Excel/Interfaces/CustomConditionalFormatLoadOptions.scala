package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
trait CustomConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalFormatRuleLoadOptions] = js.undefined
}

object CustomConditionalFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    format: ConditionalRangeFormatLoadOptions = null,
    rule: ConditionalFormatRuleLoadOptions = null
  ): CustomConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (format != null) __obj.updateDynamic("format")(format)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[CustomConditionalFormatLoadOptions]
  }
}

