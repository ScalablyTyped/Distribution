package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the attributes for a chart plotArea object.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartPlotAreaLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatLoadOptions] = js.undefined
  
  /**
    *
    * Specifies the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartPlotAreaLoadOptions {
  
  @scala.inline
  def apply(): ChartPlotAreaLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaLoadOptions]
  }
  
  @scala.inline
  implicit class ChartPlotAreaLoadOptionsMutableBuilder[Self <: ChartPlotAreaLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartPlotAreaFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInsideHeight(value: Boolean): Self = StObject.set(x, "insideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideHeightUndefined: Self = StObject.set(x, "insideHeight", js.undefined)
    
    @scala.inline
    def setInsideLeft(value: Boolean): Self = StObject.set(x, "insideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideLeftUndefined: Self = StObject.set(x, "insideLeft", js.undefined)
    
    @scala.inline
    def setInsideTop(value: Boolean): Self = StObject.set(x, "insideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideTopUndefined: Self = StObject.set(x, "insideTop", js.undefined)
    
    @scala.inline
    def setInsideWidth(value: Boolean): Self = StObject.set(x, "insideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideWidthUndefined: Self = StObject.set(x, "insideWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
