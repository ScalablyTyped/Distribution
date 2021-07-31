package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartSeriesCollection object, for use in `chartSeriesCollection.set({ ... })`. */
trait ChartSeriesCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartSeriesData]] = js.undefined
}
object ChartSeriesCollectionUpdateData {
  
  @scala.inline
  def apply(): ChartSeriesCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ChartSeriesCollectionUpdateDataMutableBuilder[Self <: ChartSeriesCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartSeriesData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartSeriesData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
