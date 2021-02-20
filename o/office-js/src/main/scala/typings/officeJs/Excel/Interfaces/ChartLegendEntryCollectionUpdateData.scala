package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartLegendEntryCollection object, for use in `chartLegendEntryCollection.set({ ... })`. */
@js.native
trait ChartLegendEntryCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.native
}
object ChartLegendEntryCollectionUpdateData {
  
  @scala.inline
  def apply(): ChartLegendEntryCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ChartLegendEntryCollectionUpdateDataMutableBuilder[Self <: ChartLegendEntryCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartLegendEntryData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartLegendEntryData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
