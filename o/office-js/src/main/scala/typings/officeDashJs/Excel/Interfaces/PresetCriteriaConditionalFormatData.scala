package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ConditionalPresetCriteriaRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `presetCriteriaConditionalFormat.toJSON()`. */
trait PresetCriteriaConditionalFormatData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalPresetCriteriaRule] = js.undefined
}

object PresetCriteriaConditionalFormatData {
  @scala.inline
  def apply(format: ConditionalRangeFormatData = null, rule: ConditionalPresetCriteriaRule = null): PresetCriteriaConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[PresetCriteriaConditionalFormatData]
  }
}

