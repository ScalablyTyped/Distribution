package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPlotAreaFormat object, for use in `chartPlotAreaFormat.set({ ... })`. */
@js.native
trait ChartPlotAreaFormatUpdateData extends js.Object {
  /**
    *
    * Specifies the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.native
}

object ChartPlotAreaFormatUpdateData {
  @scala.inline
  def apply(): ChartPlotAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaFormatUpdateData]
  }
  @scala.inline
  implicit class ChartPlotAreaFormatUpdateDataOps[Self <: ChartPlotAreaFormatUpdateData] (val x: Self) extends AnyVal {
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
  }
  
}

