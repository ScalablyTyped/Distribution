package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentcountCommitter extends StObject {
  
  var author: DateDate
  
  var comment_count: Double
  
  var committer: DateDate
  
  var message: String
  
  var tree: ShaUrl
  
  /** Format: uri */
  var url: String
  
  var verification: ReasonSignature
}
object CommentcountCommitter {
  
  inline def apply(
    author: DateDate,
    comment_count: Double,
    committer: DateDate,
    message: String,
    tree: ShaUrl,
    url: String,
    verification: ReasonSignature
  ): CommentcountCommitter = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentcountCommitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentcountCommitter] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: DateDate): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: DateDate): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTree(value: ShaUrl): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: ReasonSignature): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
