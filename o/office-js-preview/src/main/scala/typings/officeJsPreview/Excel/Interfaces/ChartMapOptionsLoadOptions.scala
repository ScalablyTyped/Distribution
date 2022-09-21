package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the properties for a region map chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ChartMapOptionsLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the series map labels strategy of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the series mapping level of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the series projection type of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[Boolean] = js.undefined
}
object ChartMapOptionsLoadOptions {
  
  inline def apply(): ChartMapOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsLoadOptions]
  }
  
  extension [Self <: ChartMapOptionsLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setLabelStrategy(value: Boolean): Self = StObject.set(x, "labelStrategy", value.asInstanceOf[js.Any])
    
    inline def setLabelStrategyUndefined: Self = StObject.set(x, "labelStrategy", js.undefined)
    
    inline def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setProjectionType(value: Boolean): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    inline def setProjectionTypeUndefined: Self = StObject.set(x, "projectionType", js.undefined)
  }
}
