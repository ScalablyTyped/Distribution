package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ContentControlCollection object, for use in `contentControlCollection.set({ ... })`. */
trait ContentControlCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ContentControlData]] = js.undefined
}
object ContentControlCollectionUpdateData {
  
  inline def apply(): ContentControlCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ContentControlData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ContentControlData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
