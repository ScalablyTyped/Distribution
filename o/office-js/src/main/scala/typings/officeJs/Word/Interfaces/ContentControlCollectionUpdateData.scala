package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ContentControlCollection object, for use in `contentControlCollection.set({ ... })`. */
trait ContentControlCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ContentControlData]] = js.undefined
}
object ContentControlCollectionUpdateData {
  
  @scala.inline
  def apply(): ContentControlCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ContentControlCollectionUpdateDataMutableBuilder[Self <: ContentControlCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ContentControlData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ContentControlData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
