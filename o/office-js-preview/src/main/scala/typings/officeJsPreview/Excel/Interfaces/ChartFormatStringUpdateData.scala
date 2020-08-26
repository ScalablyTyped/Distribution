package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartFormatString object, for use in `chartFormatString.set({ ... })`. */
@js.native
trait ChartFormatStringUpdateData extends js.Object {
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart characters object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.native
}

object ChartFormatStringUpdateData {
  @scala.inline
  def apply(): ChartFormatStringUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFormatStringUpdateData]
  }
  @scala.inline
  implicit class ChartFormatStringUpdateDataOps[Self <: ChartFormatStringUpdateData] (val x: Self) extends AnyVal {
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
    def setFont(value: ChartFontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
  }
  
}

