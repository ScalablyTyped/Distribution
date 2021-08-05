package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageBreakCollection.toJSON()`. */
trait PageBreakCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PageBreakData]] = js.undefined
}
object PageBreakCollectionData {
  
  inline def apply(): PageBreakCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakCollectionData]
  }
  
  extension [Self <: PageBreakCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[PageBreakData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PageBreakData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
