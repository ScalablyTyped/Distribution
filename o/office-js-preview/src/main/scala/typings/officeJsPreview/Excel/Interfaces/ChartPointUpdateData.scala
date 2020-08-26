package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartMarkerStyle
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Circle
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.Diamond
import typings.officeJsPreview.officeJsPreviewStrings.Dot
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Picture
import typings.officeJsPreview.officeJsPreviewStrings.Plus
import typings.officeJsPreview.officeJsPreviewStrings.Square
import typings.officeJsPreview.officeJsPreviewStrings.Star
import typings.officeJsPreview.officeJsPreviewStrings.Triangle
import typings.officeJsPreview.officeJsPreviewStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPoint object, for use in `chartPoint.set({ ... })`. */
@js.native
trait ChartPointUpdateData extends js.Object {
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelUpdateData] = js.native
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatUpdateData] = js.native
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.native
  /**
    *
    * HTML color code representation of the marker background color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.native
  /**
    *
    * HTML color code representation of the marker foreground color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.native
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.native
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.native
}

object ChartPointUpdateData {
  @scala.inline
  def apply(): ChartPointUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointUpdateData]
  }
  @scala.inline
  implicit class ChartPointUpdateDataOps[Self <: ChartPointUpdateData] (val x: Self) extends AnyVal {
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
    def setDataLabel(value: ChartDataLabelUpdateData): Self = this.set("dataLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabel: Self = this.set("dataLabel", js.undefined)
    @scala.inline
    def setFormat(value: ChartPointFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHasDataLabel(value: Boolean): Self = this.set("hasDataLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDataLabel: Self = this.set("hasDataLabel", js.undefined)
    @scala.inline
    def setMarkerBackgroundColor(value: String): Self = this.set("markerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerBackgroundColor: Self = this.set("markerBackgroundColor", js.undefined)
    @scala.inline
    def setMarkerForegroundColor(value: String): Self = this.set("markerForegroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerForegroundColor: Self = this.set("markerForegroundColor", js.undefined)
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    @scala.inline
    def setMarkerStyle(
      value: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
    ): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStyle: Self = this.set("markerStyle", js.undefined)
  }
  
}

