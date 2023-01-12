package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentReplyCollection.toJSON()`. */
trait CommentReplyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
}
object CommentReplyCollectionData {
  
  inline def apply(): CommentReplyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentReplyCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[CommentReplyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CommentReplyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
