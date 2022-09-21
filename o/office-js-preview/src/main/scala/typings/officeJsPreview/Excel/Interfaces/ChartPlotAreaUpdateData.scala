package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartPlotAreaPosition
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPlotArea object, for use in `chartPlotArea.set({ ... })`. */
trait ChartPlotAreaUpdateData extends StObject {
  
  /**
    * Specifies the formatting of a chart plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatUpdateData] = js.undefined
  
  /**
    * Specifies the height value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the inside height value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the inside left value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the inside top value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the inside width value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the left value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the position of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartPlotAreaPosition | Automatic | Custom] = js.undefined
  
  /**
    * Specifies the top value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartPlotAreaUpdateData {
  
  inline def apply(): ChartPlotAreaUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaUpdateData]
  }
  
  extension [Self <: ChartPlotAreaUpdateData](x: Self) {
    
    inline def setFormat(value: ChartPlotAreaFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInsideHeight(value: Double): Self = StObject.set(x, "insideHeight", value.asInstanceOf[js.Any])
    
    inline def setInsideHeightUndefined: Self = StObject.set(x, "insideHeight", js.undefined)
    
    inline def setInsideLeft(value: Double): Self = StObject.set(x, "insideLeft", value.asInstanceOf[js.Any])
    
    inline def setInsideLeftUndefined: Self = StObject.set(x, "insideLeft", js.undefined)
    
    inline def setInsideTop(value: Double): Self = StObject.set(x, "insideTop", value.asInstanceOf[js.Any])
    
    inline def setInsideTopUndefined: Self = StObject.set(x, "insideTop", js.undefined)
    
    inline def setInsideWidth(value: Double): Self = StObject.set(x, "insideWidth", value.asInstanceOf[js.Any])
    
    inline def setInsideWidthUndefined: Self = StObject.set(x, "insideWidth", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setPosition(value: ChartPlotAreaPosition | Automatic | Custom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
