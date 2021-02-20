package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPointsCollection object, for use in `chartPointsCollection.set({ ... })`. */
@js.native
trait ChartPointsCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartPointData]] = js.native
}
object ChartPointsCollectionUpdateData {
  
  @scala.inline
  def apply(): ChartPointsCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointsCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ChartPointsCollectionUpdateDataMutableBuilder[Self <: ChartPointsCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartPointData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartPointData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
