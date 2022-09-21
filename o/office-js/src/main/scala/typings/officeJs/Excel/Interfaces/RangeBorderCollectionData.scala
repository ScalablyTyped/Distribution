package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeBorderCollection.toJSON()`. */
trait RangeBorderCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
}
object RangeBorderCollectionData {
  
  inline def apply(): RangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderCollectionData]
  }
  
  extension [Self <: RangeBorderCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[RangeBorderData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeBorderData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
