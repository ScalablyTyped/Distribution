package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartMarkerStyle
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Circle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.Diamond
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Picture
import typings.officeJs.officeJsStrings.Plus
import typings.officeJs.officeJsStrings.Square
import typings.officeJs.officeJsStrings.Star
import typings.officeJs.officeJsStrings.Triangle
import typings.officeJs.officeJsStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPoint.toJSON()`. */
@js.native
trait ChartPointData extends js.Object {
  
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelData] = js.native
  
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatData] = js.native
  
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
  
  /**
    *
    * Returns the value of a chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.native
}
object ChartPointData {
  
  @scala.inline
  def apply(): ChartPointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointData]
  }
  
  @scala.inline
  implicit class ChartPointDataOps[Self <: ChartPointData] (val x: Self) extends AnyVal {
    
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
    def setDataLabel(value: ChartDataLabelData): Self = this.set("dataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabel: Self = this.set("dataLabel", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartPointFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
