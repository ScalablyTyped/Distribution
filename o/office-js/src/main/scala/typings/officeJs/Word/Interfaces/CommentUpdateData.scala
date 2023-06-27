package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Comment object, for use in `comment.set({ ... })`. */
trait CommentUpdateData extends StObject {
  
  /**
    * Specifies the comment's content as plain text.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the comment's content range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var contentRange: js.UndefOr[CommentContentRangeUpdateData] = js.undefined
  
  /**
    * Specifies the comment thread's status. Setting to true resolves the comment thread. Getting a value of true means that the comment thread is resolved.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
}
object CommentUpdateData {
  
  inline def apply(): CommentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentUpdateData] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentRange(value: CommentContentRangeUpdateData): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
