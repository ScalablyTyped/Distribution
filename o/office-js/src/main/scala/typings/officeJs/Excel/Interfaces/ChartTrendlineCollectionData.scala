package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartTrendlineCollection.toJSON()`. */
@js.native
trait ChartTrendlineCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.native
}
object ChartTrendlineCollectionData {
  
  @scala.inline
  def apply(): ChartTrendlineCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineCollectionData]
  }
  
  @scala.inline
  implicit class ChartTrendlineCollectionDataMutableBuilder[Self <: ChartTrendlineCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartTrendlineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartTrendlineData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
