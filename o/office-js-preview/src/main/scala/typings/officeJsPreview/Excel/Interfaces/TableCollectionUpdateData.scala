package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCollection object, for use in `tableCollection.set({ ... })`. */
@js.native
trait TableCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.native
}
object TableCollectionUpdateData {
  
  @scala.inline
  def apply(): TableCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TableCollectionUpdateDataMutableBuilder[Self <: TableCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
