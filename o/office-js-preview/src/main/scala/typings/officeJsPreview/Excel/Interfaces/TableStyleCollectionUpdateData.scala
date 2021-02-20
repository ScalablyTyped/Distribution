package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableStyleCollection object, for use in `tableStyleCollection.set({ ... })`. */
@js.native
trait TableStyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableStyleData]] = js.native
}
object TableStyleCollectionUpdateData {
  
  @scala.inline
  def apply(): TableStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TableStyleCollectionUpdateDataMutableBuilder[Self <: TableStyleCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
