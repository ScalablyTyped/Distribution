package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTitleFormat object, for use in `chartTitleFormat.set({ ... })`. */
@js.native
trait ChartTitleFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border format of chart title, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.native
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for an object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.native
}

object ChartTitleFormatUpdateData {
  @scala.inline
  def apply(): ChartTitleFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleFormatUpdateData]
  }
  @scala.inline
  implicit class ChartTitleFormatUpdateDataOps[Self <: ChartTitleFormatUpdateData] (val x: Self) extends AnyVal {
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
    def setBorder(value: ChartBorderUpdateData): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFont(value: ChartFontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
  }
  
}

