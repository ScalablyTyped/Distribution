package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Comment object, for use in `comment.set({ ... })`. */
trait CommentUpdateData extends StObject {
  
  /**
    * The comment's content. The string is plain text.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The comment thread status. A value of `true` means that the comment thread is resolved.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
}
object CommentUpdateData {
  
  inline def apply(): CommentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentUpdateData]
  }
  
  extension [Self <: CommentUpdateData](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
