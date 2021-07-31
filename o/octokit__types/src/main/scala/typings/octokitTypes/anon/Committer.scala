package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Committer extends StObject {
  
  var author: Date
  
  var committer: Date
  
  var html_url: String
  
  var message: String
  
  var node_id: String
  
  var parents: js.Array[HtmlurlSha]
  
  var sha: String
  
  var tree: Sha
  
  var url: String
  
  var verification: Payload
}
object Committer {
  
  @scala.inline
  def apply(
    author: Date,
    committer: Date,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[HtmlurlSha],
    sha: String,
    tree: Sha,
    url: String,
    verification: Payload
  ): Committer = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Committer]
  }
  
  @scala.inline
  implicit class CommitterMutableBuilder[Self <: Committer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Date): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Date): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[HtmlurlSha]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: HtmlurlSha*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: Sha): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Payload): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
