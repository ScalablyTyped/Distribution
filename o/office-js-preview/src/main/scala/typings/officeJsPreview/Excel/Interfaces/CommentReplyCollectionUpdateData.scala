package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CommentReplyCollection object, for use in `commentReplyCollection.set({ ... })`. */
trait CommentReplyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
}
object CommentReplyCollectionUpdateData {
  
  @scala.inline
  def apply(): CommentReplyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionUpdateData]
  }
  
  @scala.inline
  implicit class CommentReplyCollectionUpdateDataMutableBuilder[Self <: CommentReplyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CommentReplyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CommentReplyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
