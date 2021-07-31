package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Comment object, for use in `comment.set({ ... })`. */
trait CommentUpdateData extends StObject {
  
  /**
    *
    * The comment's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The comment thread status. A value of "true" means the comment thread is resolved.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
}
object CommentUpdateData {
  
  @scala.inline
  def apply(): CommentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentUpdateData]
  }
  
  @scala.inline
  implicit class CommentUpdateDataMutableBuilder[Self <: CommentUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
