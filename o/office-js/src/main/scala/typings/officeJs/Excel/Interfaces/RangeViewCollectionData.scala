package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeViewCollection.toJSON()`. */
trait RangeViewCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeViewData]] = js.undefined
}
object RangeViewCollectionData {
  
  inline def apply(): RangeViewCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewCollectionData]
  }
  
  extension [Self <: RangeViewCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[RangeViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeViewData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
