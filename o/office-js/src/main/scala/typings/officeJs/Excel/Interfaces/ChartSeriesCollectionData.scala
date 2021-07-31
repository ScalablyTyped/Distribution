package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartSeriesCollection.toJSON()`. */
trait ChartSeriesCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartSeriesData]] = js.undefined
}
object ChartSeriesCollectionData {
  
  @scala.inline
  def apply(): ChartSeriesCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesCollectionData]
  }
  
  @scala.inline
  implicit class ChartSeriesCollectionDataMutableBuilder[Self <: ChartSeriesCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartSeriesData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartSeriesData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
