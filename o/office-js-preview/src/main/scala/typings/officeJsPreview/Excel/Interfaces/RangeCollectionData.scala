package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeCollection.toJSON()`. */
trait RangeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeData]] = js.undefined
}
object RangeCollectionData {
  
  inline def apply(): RangeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[RangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
