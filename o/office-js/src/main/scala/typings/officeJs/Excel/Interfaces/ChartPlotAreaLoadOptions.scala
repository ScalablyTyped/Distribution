package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the attributes for a chart plot area.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait ChartPlotAreaLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the formatting of a chart plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatLoadOptions] = js.undefined
  
  /**
    * Specifies the height value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the inside height value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the inside left value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the inside top value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the inside width value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the left value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the position of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the top value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width value of a plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartPlotAreaLoadOptions {
  
  inline def apply(): ChartPlotAreaLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartPlotAreaLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFormat(value: ChartPlotAreaFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInsideHeight(value: Boolean): Self = StObject.set(x, "insideHeight", value.asInstanceOf[js.Any])
    
    inline def setInsideHeightUndefined: Self = StObject.set(x, "insideHeight", js.undefined)
    
    inline def setInsideLeft(value: Boolean): Self = StObject.set(x, "insideLeft", value.asInstanceOf[js.Any])
    
    inline def setInsideLeftUndefined: Self = StObject.set(x, "insideLeft", js.undefined)
    
    inline def setInsideTop(value: Boolean): Self = StObject.set(x, "insideTop", value.asInstanceOf[js.Any])
    
    inline def setInsideTopUndefined: Self = StObject.set(x, "insideTop", js.undefined)
    
    inline def setInsideWidth(value: Boolean): Self = StObject.set(x, "insideWidth", value.asInstanceOf[js.Any])
    
    inline def setInsideWidthUndefined: Self = StObject.set(x, "insideWidth", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
