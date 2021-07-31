package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CommentReply object, for use in `commentReply.set({ ... })`. */
trait CommentReplyUpdateData extends StObject {
  
  /**
    *
    * The comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
}
object CommentReplyUpdateData {
  
  @scala.inline
  def apply(): CommentReplyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyUpdateData]
  }
  
  @scala.inline
  implicit class CommentReplyUpdateDataMutableBuilder[Self <: CommentReplyUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
