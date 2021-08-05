package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartMapAreaLevel
import typings.officeJsPreview.Excel.ChartMapLabelStrategy
import typings.officeJsPreview.Excel.ChartMapProjectionType
import typings.officeJsPreview.officeJsPreviewStrings.Albers
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.BestFit
import typings.officeJsPreview.officeJsPreviewStrings.City
import typings.officeJsPreview.officeJsPreviewStrings.Continent
import typings.officeJsPreview.officeJsPreviewStrings.Country
import typings.officeJsPreview.officeJsPreviewStrings.County
import typings.officeJsPreview.officeJsPreviewStrings.DataOnly
import typings.officeJsPreview.officeJsPreviewStrings.Mercator
import typings.officeJsPreview.officeJsPreviewStrings.Miller
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Robinson
import typings.officeJsPreview.officeJsPreviewStrings.ShowAll
import typings.officeJsPreview.officeJsPreviewStrings.State
import typings.officeJsPreview.officeJsPreviewStrings.World
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
trait ChartMapOptionsData extends StObject {
  
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
object ChartMapOptionsData {
  
  inline def apply(): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsData]
  }
  
  extension [Self <: ChartMapOptionsData](x: Self) {
    
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
