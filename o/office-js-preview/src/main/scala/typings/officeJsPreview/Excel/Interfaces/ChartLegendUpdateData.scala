package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartLegendPosition
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Corner
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartLegend object, for use in `chartLegend.set({ ... })`. */
trait ChartLegendUpdateData extends StObject {
  
  /**
    * Represents the formatting of a chart legend, which includes fill and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartLegendFormatUpdateData] = js.undefined
  
  /**
    * Specifies the height, in points, of the legend on the chart. Value is `null` if the legend is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the left value, in points, of the legend on the chart. Value is `null` if the legend is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the chart legend should overlap with the main body of the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the position of the legend on the chart. See `Excel.ChartLegendPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom] = js.undefined
  
  /**
    * Specifies if the legend has a shadow on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the top of a chart legend.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the chart legend is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width, in points, of the legend on the chart. Value is `null` if the legend is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartLegendUpdateData {
  
  inline def apply(): ChartLegendUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendUpdateData]
  }
  
  extension [Self <: ChartLegendUpdateData](x: Self) {
    
    inline def setFormat(value: ChartLegendFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPosition(value: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
