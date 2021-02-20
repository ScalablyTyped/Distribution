package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Verification extends StObject {
  
  var author: EmailName = js.native
  
  var comment_count: Double = js.native
  
  var committer: EmailName = js.native
  
  var message: String = js.native
  
  var tree: ShaUrl = js.native
  
  var url: String = js.native
  
  var verification: Payload = js.native
}
object Verification {
  
  @scala.inline
  def apply(
    author: EmailName,
    comment_count: Double,
    committer: EmailName,
    message: String,
    tree: ShaUrl,
    url: String,
    verification: Payload
  ): Verification = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
  
  @scala.inline
  implicit class VerificationMutableBuilder[Self <: Verification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: EmailName): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: EmailName): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: ShaUrl): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Payload): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
