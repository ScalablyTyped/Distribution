package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartLegendPosition
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Corner
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLegend object, for use in `chartLegend.set({ ... })`. */
@js.native
trait ChartLegendUpdateData extends js.Object {
  /**
    *
    * Represents the formatting of a chart legend, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartLegendFormatUpdateData] = js.native
  /**
    *
    * Specifies the height, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the left, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the chart legend should overlap with the main body of the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the position of the legend on the chart. See Excel.ChartLegendPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom] = js.native
  /**
    *
    * Specifies if the legend has a shadow on the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the top of a chart legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the ChartLegend is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the width, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.native
}

object ChartLegendUpdateData {
  @scala.inline
  def apply(): ChartLegendUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendUpdateData]
  }
  @scala.inline
  implicit class ChartLegendUpdateDataOps[Self <: ChartLegendUpdateData] (val x: Self) extends AnyVal {
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
    def setFormat(value: ChartLegendFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPosition(value: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowShadow(value: Boolean): Self = this.set("showShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowShadow: Self = this.set("showShadow", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

