package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPointsCollection.toJSON()`. */
trait ChartPointsCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartPointData]] = js.undefined
}
object ChartPointsCollectionData {
  
  inline def apply(): ChartPointsCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointsCollectionData]
  }
  
  extension [Self <: ChartPointsCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[ChartPointData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ChartPointData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
