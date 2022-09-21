package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartTrendlineCollection.toJSON()`. */
trait ChartTrendlineCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
}
object ChartTrendlineCollectionData {
  
  inline def apply(): ChartTrendlineCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineCollectionData]
  }
  
  extension [Self <: ChartTrendlineCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[ChartTrendlineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ChartTrendlineData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
