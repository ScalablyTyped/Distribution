package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableScopedCollection.toJSON()`. */
@js.native
trait TableScopedCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.native
}
object TableScopedCollectionData {
  
  @scala.inline
  def apply(): TableScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableScopedCollectionData]
  }
  
  @scala.inline
  implicit class TableScopedCollectionDataMutableBuilder[Self <: TableScopedCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
