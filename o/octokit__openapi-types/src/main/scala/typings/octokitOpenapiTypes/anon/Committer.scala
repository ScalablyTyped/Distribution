package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Committer extends StObject {
  
  /** @description The author of the file. Default: The `committer` or the authenticated user if you omit `committer`. */
  var author: js.UndefOr[Date] = js.undefined
  
  /** @description The branch name. Default: the repository’s default branch (usually `master`) */
  var branch: js.UndefOr[String] = js.undefined
  
  /** @description The person that committed the file. Default: the authenticated user. */
  var committer: js.UndefOr[Date] = js.undefined
  
  /** @description The new file content, using Base64 encoding. */
  var content: String
  
  /** @description The commit message. */
  var message: String
  
  /** @description **Required if you are updating a file**. The blob SHA of the file being replaced. */
  var sha: js.UndefOr[String] = js.undefined
}
object Committer {
  
  inline def apply(content: String, message: String): Committer = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Committer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Committer] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Date): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommitter(value: Date): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
  }
}
