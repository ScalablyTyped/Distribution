package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableStyleCollection.toJSON()`. */
trait TableStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableStyleData]] = js.undefined
}
object TableStyleCollectionData {
  
  @scala.inline
  def apply(): TableStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleCollectionData]
  }
  
  @scala.inline
  implicit class TableStyleCollectionDataMutableBuilder[Self <: TableStyleCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TableStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
