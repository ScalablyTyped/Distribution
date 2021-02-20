package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableScopedCollection object, for use in `tableScopedCollection.set({ ... })`. */
@js.native
trait TableScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.native
}
object TableScopedCollectionUpdateData {
  
  @scala.inline
  def apply(): TableScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableScopedCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TableScopedCollectionUpdateDataMutableBuilder[Self <: TableScopedCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
