package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookCommentReply
  extends StObject
     with Entity {
  
  // The content of a comment reply.
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the type for the comment reply.
  var contentType: js.UndefOr[String] = js.undefined
}
object WorkbookCommentReply {
  
  @scala.inline
  def apply(): WorkbookCommentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookCommentReply]
  }
  
  @scala.inline
  implicit class WorkbookCommentReplyMutableBuilder[Self <: WorkbookCommentReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
