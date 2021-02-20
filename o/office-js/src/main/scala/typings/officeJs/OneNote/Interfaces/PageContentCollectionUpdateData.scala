package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageContentCollection object, for use in "pageContentCollection.set({ ... })". */
@js.native
trait PageContentCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PageContentData]] = js.native
}
object PageContentCollectionUpdateData {
  
  @scala.inline
  def apply(): PageContentCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PageContentCollectionUpdateDataMutableBuilder[Self <: PageContentCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PageContentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PageContentData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
