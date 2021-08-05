package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartMapAreaLevel
import typings.officeJs.Excel.ChartMapLabelStrategy
import typings.officeJs.Excel.ChartMapProjectionType
import typings.officeJs.officeJsStrings.Albers
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.BestFit
import typings.officeJs.officeJsStrings.City
import typings.officeJs.officeJsStrings.Continent
import typings.officeJs.officeJsStrings.Country
import typings.officeJs.officeJsStrings.County
import typings.officeJs.officeJsStrings.DataOnly
import typings.officeJs.officeJsStrings.Mercator
import typings.officeJs.officeJsStrings.Miller
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Robinson
import typings.officeJs.officeJsStrings.ShowAll
import typings.officeJs.officeJsStrings.State
import typings.officeJs.officeJsStrings.World
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
trait ChartMapOptionsUpdateData extends StObject {
  
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.undefined
  
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.undefined
  
  /**
    *
    * Specifies the series projection type of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.undefined
}
object ChartMapOptionsUpdateData {
  
  inline def apply(): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
  
  extension [Self <: ChartMapOptionsUpdateData](x: Self) {
    
    inline def setLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = StObject.set(x, "labelStrategy", value.asInstanceOf[js.Any])
    
    inline def setLabelStrategyUndefined: Self = StObject.set(x, "labelStrategy", js.undefined)
    
    inline def setLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    inline def setProjectionTypeUndefined: Self = StObject.set(x, "projectionType", js.undefined)
  }
}
