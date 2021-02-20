package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableColumnCollection.toJSON()`. */
@js.native
trait TableColumnCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableColumnData]] = js.native
}
object TableColumnCollectionData {
  
  @scala.inline
  def apply(): TableColumnCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnCollectionData]
  }
  
  @scala.inline
  implicit class TableColumnCollectionDataMutableBuilder[Self <: TableColumnCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableColumnData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableColumnData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
