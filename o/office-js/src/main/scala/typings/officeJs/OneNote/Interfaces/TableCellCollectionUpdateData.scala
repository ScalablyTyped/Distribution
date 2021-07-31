package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCellCollection object, for use in "tableCellCollection.set({ ... })". */
trait TableCellCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableCellData]] = js.undefined
}
object TableCellCollectionUpdateData {
  
  @scala.inline
  def apply(): TableCellCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TableCellCollectionUpdateDataMutableBuilder[Self <: TableCellCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableCellData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableCellData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
