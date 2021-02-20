package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartPlotAreaPosition
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPlotArea object, for use in `chartPlotArea.set({ ... })`. */
@js.native
trait ChartPlotAreaUpdateData extends StObject {
  
  /**
    *
    * Specifies the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatUpdateData] = js.native
  
  /**
    *
    * Specifies the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartPlotAreaPosition | Automatic | Custom] = js.native
  
  /**
    *
    * Specifies the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.native
}
object ChartPlotAreaUpdateData {
  
  @scala.inline
  def apply(): ChartPlotAreaUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaUpdateData]
  }
  
  @scala.inline
  implicit class ChartPlotAreaUpdateDataMutableBuilder[Self <: ChartPlotAreaUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ChartPlotAreaFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInsideHeight(value: Double): Self = StObject.set(x, "insideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideHeightUndefined: Self = StObject.set(x, "insideHeight", js.undefined)
    
    @scala.inline
    def setInsideLeft(value: Double): Self = StObject.set(x, "insideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideLeftUndefined: Self = StObject.set(x, "insideLeft", js.undefined)
    
    @scala.inline
    def setInsideTop(value: Double): Self = StObject.set(x, "insideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideTopUndefined: Self = StObject.set(x, "insideTop", js.undefined)
    
    @scala.inline
    def setInsideWidth(value: Double): Self = StObject.set(x, "insideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideWidthUndefined: Self = StObject.set(x, "insideWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setPosition(value: ChartPlotAreaPosition | Automatic | Custom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
