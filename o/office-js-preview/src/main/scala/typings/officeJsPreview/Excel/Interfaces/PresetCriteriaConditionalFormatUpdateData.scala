package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalPresetCriteriaRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PresetCriteriaConditionalFormat object, for use in `presetCriteriaConditionalFormat.set({ ... })`. */
@js.native
trait PresetCriteriaConditionalFormatUpdateData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.native
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalPresetCriteriaRule] = js.native
}

object PresetCriteriaConditionalFormatUpdateData {
  @scala.inline
  def apply(): PresetCriteriaConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetCriteriaConditionalFormatUpdateData]
  }
  @scala.inline
  implicit class PresetCriteriaConditionalFormatUpdateDataOps[Self <: PresetCriteriaConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: ConditionalRangeFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setRule(value: ConditionalPresetCriteriaRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

