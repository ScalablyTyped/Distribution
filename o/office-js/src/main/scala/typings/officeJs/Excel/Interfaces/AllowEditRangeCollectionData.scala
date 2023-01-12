package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `allowEditRangeCollection.toJSON()`. */
trait AllowEditRangeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[AllowEditRangeData]] = js.undefined
}
object AllowEditRangeCollectionData {
  
  inline def apply(): AllowEditRangeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditRangeCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowEditRangeCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[AllowEditRangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AllowEditRangeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
