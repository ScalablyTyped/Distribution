package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentcount extends StObject {
  
  var author: DateEmail
  
  var comment_count: Double
  
  var committer: DateEmail
  
  var message: String
  
  var tree: Sha
  
  var url: String
  
  var verification: Payload
}
object Commentcount {
  
  @scala.inline
  def apply(
    author: DateEmail,
    comment_count: Double,
    committer: DateEmail,
    message: String,
    tree: Sha,
    url: String,
    verification: Payload
  ): Commentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentcount]
  }
  
  @scala.inline
  implicit class CommentcountMutableBuilder[Self <: Commentcount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: DateEmail): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: DateEmail): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: Sha): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Payload): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
