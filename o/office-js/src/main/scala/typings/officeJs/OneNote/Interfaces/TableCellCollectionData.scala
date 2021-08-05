package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "tableCellCollection.toJSON()". */
trait TableCellCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableCellData]] = js.undefined
}
object TableCellCollectionData {
  
  inline def apply(): TableCellCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellCollectionData]
  }
  
  extension [Self <: TableCellCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[TableCellData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableCellData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
