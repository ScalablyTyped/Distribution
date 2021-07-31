package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableRowCollection.toJSON()`. */
trait TableRowCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableRowData]] = js.undefined
}
object TableRowCollectionData {
  
  @scala.inline
  def apply(): TableRowCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowCollectionData]
  }
  
  @scala.inline
  implicit class TableRowCollectionDataMutableBuilder[Self <: TableRowCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableRowData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableRowData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
