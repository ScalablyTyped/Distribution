package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PresetCriteriaConditionalFormat object, for use in "presetCriteriaConditionalFormat.set({ ... })". */
trait PresetCriteriaConditionalFormatUpdateData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ConditionalPresetCriteriaRule] = js.undefined
}

object PresetCriteriaConditionalFormatUpdateData {
  @scala.inline
  def apply(
    format: ConditionalRangeFormatUpdateData = null,
    rule: officeDashJsDashPreviewLib.ExcelNs.ConditionalPresetCriteriaRule = null
  ): PresetCriteriaConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[PresetCriteriaConditionalFormatUpdateData]
  }
}

