package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data table object of a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
trait ChartDataTableLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the format of a chart data table, which includes fill, font, and border format.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var format: js.UndefOr[ChartDataTableFormatLoadOptions] = js.undefined
  
  /**
    * Specifies whether to display the horizontal border of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showHorizontalBorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the legend key of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the outline border of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showOutlineBorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the vertical border of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showVerticalBorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the data table of the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartDataTableLoadOptions {
  
  inline def apply(): ChartDataTableLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataTableLoadOptions]
  }
  
  extension [Self <: ChartDataTableLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFormat(value: ChartDataTableFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setShowHorizontalBorder(value: Boolean): Self = StObject.set(x, "showHorizontalBorder", value.asInstanceOf[js.Any])
    
    inline def setShowHorizontalBorderUndefined: Self = StObject.set(x, "showHorizontalBorder", js.undefined)
    
    inline def setShowLegendKey(value: Boolean): Self = StObject.set(x, "showLegendKey", value.asInstanceOf[js.Any])
    
    inline def setShowLegendKeyUndefined: Self = StObject.set(x, "showLegendKey", js.undefined)
    
    inline def setShowOutlineBorder(value: Boolean): Self = StObject.set(x, "showOutlineBorder", value.asInstanceOf[js.Any])
    
    inline def setShowOutlineBorderUndefined: Self = StObject.set(x, "showOutlineBorder", js.undefined)
    
    inline def setShowVerticalBorder(value: Boolean): Self = StObject.set(x, "showVerticalBorder", value.asInstanceOf[js.Any])
    
    inline def setShowVerticalBorderUndefined: Self = StObject.set(x, "showVerticalBorder", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
