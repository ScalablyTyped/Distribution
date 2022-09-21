package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorCommentcount extends StObject {
  
  var author: DateStringEmailString
  
  var comment_count: Double
  
  var committer: DateEmail | Null
  
  var message: String
  
  var tree: ShaUrl
  
  /** Format: uri */
  var url: String
  
  var verification: js.UndefOr[Signature] = js.undefined
}
object AuthorCommentcount {
  
  inline def apply(author: DateStringEmailString, comment_count: Double, message: String, tree: ShaUrl, url: String): AuthorCommentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], committer = null)
    __obj.asInstanceOf[AuthorCommentcount]
  }
  
  extension [Self <: AuthorCommentcount](x: Self) {
    
    inline def setAuthor(value: DateStringEmailString): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: DateEmail): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterNull: Self = StObject.set(x, "committer", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTree(value: ShaUrl): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Signature): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
