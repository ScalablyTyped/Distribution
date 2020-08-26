package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalTopBottomRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TopBottomConditionalFormat object, for use in `topBottomConditionalFormat.set({ ... })`. */
@js.native
trait TopBottomConditionalFormatUpdateData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.native
  /**
    *
    * The criteria of the Top/Bottom conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalTopBottomRule] = js.native
}

object TopBottomConditionalFormatUpdateData {
  @scala.inline
  def apply(): TopBottomConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBottomConditionalFormatUpdateData]
  }
  @scala.inline
  implicit class TopBottomConditionalFormatUpdateDataOps[Self <: TopBottomConditionalFormatUpdateData] (val x: Self) extends AnyVal {
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
    def setRule(value: ConditionalTopBottomRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

