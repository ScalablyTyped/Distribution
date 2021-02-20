package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NamedItemCollection object, for use in `namedItemCollection.set({ ... })`. */
@js.native
trait NamedItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[NamedItemData]] = js.native
}
object NamedItemCollectionUpdateData {
  
  @scala.inline
  def apply(): NamedItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionUpdateData]
  }
  
  @scala.inline
  implicit class NamedItemCollectionUpdateDataMutableBuilder[Self <: NamedItemCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[NamedItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: NamedItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
