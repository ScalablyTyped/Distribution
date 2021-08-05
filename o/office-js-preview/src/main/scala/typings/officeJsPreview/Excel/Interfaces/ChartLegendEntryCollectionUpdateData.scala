package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartLegendEntryCollection object, for use in `chartLegendEntryCollection.set({ ... })`. */
trait ChartLegendEntryCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.undefined
}
object ChartLegendEntryCollectionUpdateData {
  
  inline def apply(): ChartLegendEntryCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryCollectionUpdateData]
  }
  
  extension [Self <: ChartLegendEntryCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[ChartLegendEntryData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ChartLegendEntryData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
