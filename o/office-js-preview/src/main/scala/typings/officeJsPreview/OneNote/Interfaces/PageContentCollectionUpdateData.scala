package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageContentCollection object, for use in "pageContentCollection.set({ ... })". */
trait PageContentCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PageContentData]] = js.undefined
}
object PageContentCollectionUpdateData {
  
  inline def apply(): PageContentCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentCollectionUpdateData]
  }
  
  extension [Self <: PageContentCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[PageContentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PageContentData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
