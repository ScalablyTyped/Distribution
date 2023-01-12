package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableRowCollection.toJSON()`. */
trait TableRowCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableRowData]] = js.undefined
}
object TableRowCollectionData {
  
  inline def apply(): TableRowCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRowCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[TableRowData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableRowData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
