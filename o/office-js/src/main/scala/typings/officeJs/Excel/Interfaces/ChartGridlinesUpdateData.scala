package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartGridlines object, for use in `chartGridlines.set({ ... })`. */
@js.native
trait ChartGridlinesUpdateData extends js.Object {
  /**
    *
    * Represents the formatting of chart gridlines.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatUpdateData] = js.native
  /**
    *
    * Specifies if the axis gridlines are visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartGridlinesUpdateData {
  @scala.inline
  def apply(): ChartGridlinesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesUpdateData]
  }
  @scala.inline
  implicit class ChartGridlinesUpdateDataOps[Self <: ChartGridlinesUpdateData] (val x: Self) extends AnyVal {
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
    def setFormat(value: ChartGridlinesFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

