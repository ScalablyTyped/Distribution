package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartLegendEntryCollection.toJSON()`. */
@js.native
trait ChartLegendEntryCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.native
}
object ChartLegendEntryCollectionData {
  
  @scala.inline
  def apply(): ChartLegendEntryCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryCollectionData]
  }
  
  @scala.inline
  implicit class ChartLegendEntryCollectionDataMutableBuilder[Self <: ChartLegendEntryCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartLegendEntryData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartLegendEntryData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
