package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the border formatting of a chart element.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait ChartBorderLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML color code representing the color of borders in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the line style of the border. See `Excel.ChartLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents weight of the border, in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}
object ChartBorderLoadOptions {
  
  inline def apply(): ChartBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBorderLoadOptions]
  }
  
  extension [Self <: ChartBorderLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineStyle(value: Boolean): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
