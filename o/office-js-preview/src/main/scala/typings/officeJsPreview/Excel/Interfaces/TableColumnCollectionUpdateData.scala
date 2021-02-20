package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableColumnCollection object, for use in `tableColumnCollection.set({ ... })`. */
@js.native
trait TableColumnCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableColumnData]] = js.native
}
object TableColumnCollectionUpdateData {
  
  @scala.inline
  def apply(): TableColumnCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TableColumnCollectionUpdateDataMutableBuilder[Self <: TableColumnCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableColumnData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableColumnData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
