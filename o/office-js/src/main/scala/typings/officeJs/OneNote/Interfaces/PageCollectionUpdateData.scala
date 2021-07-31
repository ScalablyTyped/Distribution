package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageCollection object, for use in "pageCollection.set({ ... })". */
trait PageCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PageData]] = js.undefined
}
object PageCollectionUpdateData {
  
  @scala.inline
  def apply(): PageCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PageCollectionUpdateDataMutableBuilder[Self <: PageCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PageData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PageData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
