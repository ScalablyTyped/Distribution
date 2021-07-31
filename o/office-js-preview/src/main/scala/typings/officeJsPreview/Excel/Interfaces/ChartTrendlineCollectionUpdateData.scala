package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartTrendlineCollection object, for use in `chartTrendlineCollection.set({ ... })`. */
trait ChartTrendlineCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
}
object ChartTrendlineCollectionUpdateData {
  
  @scala.inline
  def apply(): ChartTrendlineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ChartTrendlineCollectionUpdateDataMutableBuilder[Self <: ChartTrendlineCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartTrendlineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartTrendlineData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
