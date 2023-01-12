package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CommentReply object, for use in `commentReply.set({ ... })`. */
trait CommentReplyUpdateData extends StObject {
  
  /**
    * The comment reply's content. The string is plain text.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
}
object CommentReplyUpdateData {
  
  inline def apply(): CommentReplyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentReplyUpdateData] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
