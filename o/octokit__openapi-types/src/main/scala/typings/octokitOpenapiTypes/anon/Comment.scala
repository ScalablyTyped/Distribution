package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var comment: js.UndefOr[Bodyhtml] = js.undefined
  
  var issue: js.UndefOr[Assignee] = js.undefined
  
  var pages: js.UndefOr[js.Array[Pagename]] = js.undefined
}
object Comment {
  
  inline def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setComment(value: Bodyhtml): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setIssue(value: Assignee): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setPages(value: js.Array[Pagename]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: Pagename*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
