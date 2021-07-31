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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPoint.toJSON()`. */
trait ChartPointData extends StObject {
  
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelData] = js.undefined
  
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatData] = js.undefined
  
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representation of the marker background color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * HTML color code representation of the marker foreground color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
  
  /**
    *
    * Returns the value of a chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object ChartPointData {
  
  @scala.inline
  def apply(): ChartPointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointData]
  }
  
  @scala.inline
  implicit class ChartPointDataMutableBuilder[Self <: ChartPointData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLabel(value: ChartDataLabelData): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartPointFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHasDataLabel(value: Boolean): Self = StObject.set(x, "hasDataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDataLabelUndefined: Self = StObject.set(x, "hasDataLabel", js.undefined)
    
    @scala.inline
    def setMarkerBackgroundColor(value: String): Self = StObject.set(x, "markerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBackgroundColorUndefined: Self = StObject.set(x, "markerBackgroundColor", js.undefined)
    
    @scala.inline
    def setMarkerForegroundColor(value: String): Self = StObject.set(x, "markerForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerForegroundColorUndefined: Self = StObject.set(x, "markerForegroundColor", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    @scala.inline
    def setMarkerStyle(
      value: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
    ): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
