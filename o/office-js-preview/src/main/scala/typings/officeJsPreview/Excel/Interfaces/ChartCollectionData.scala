package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartCollection.toJSON()`. */
trait ChartCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartData]] = js.undefined
}
object ChartCollectionData {
  
  @scala.inline
  def apply(): ChartCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCollectionData]
  }
  
  @scala.inline
  implicit class ChartCollectionDataMutableBuilder[Self <: ChartCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
