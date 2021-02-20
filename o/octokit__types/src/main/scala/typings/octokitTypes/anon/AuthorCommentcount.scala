package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorCommentcount extends StObject {
  
  var author: Date = js.native
  
  var comment_count: Double = js.native
  
  var committer: Date = js.native
  
  var message: String = js.native
  
  var tree: Sha = js.native
  
  var url: String = js.native
}
object AuthorCommentcount {
  
  @scala.inline
  def apply(author: Date, comment_count: Double, committer: Date, message: String, tree: Sha, url: String): AuthorCommentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorCommentcount]
  }
  
  @scala.inline
  implicit class AuthorCommentcountMutableBuilder[Self <: AuthorCommentcount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Date): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Date): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: Sha): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
