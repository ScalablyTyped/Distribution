package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCellCollection object, for use in `tableCellCollection.set({ ... })`. */
trait TableCellCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableCellData]] = js.undefined
}
object TableCellCollectionUpdateData {
  
  inline def apply(): TableCellCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellCollectionUpdateData]
  }
  
  extension [Self <: TableCellCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[TableCellData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableCellData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
