package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CommentReplyCollection object, for use in `commentReplyCollection.set({ ... })`. */
trait CommentReplyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
}
object CommentReplyCollectionUpdateData {
  
  inline def apply(): CommentReplyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentReplyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[CommentReplyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CommentReplyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
