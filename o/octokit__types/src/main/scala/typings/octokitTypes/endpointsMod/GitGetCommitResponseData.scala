package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Date
import typings.octokitTypes.anon.Payload
import typings.octokitTypes.anon.Sha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitGetCommitResponseData extends StObject {
  
  var author: Date = js.native
  
  var committer: Date = js.native
  
  var message: String = js.native
  
  var node_id: String = js.native
  
  var parents: js.Array[Sha] = js.native
  
  var sha: String = js.native
  
  var tree: Sha = js.native
  
  var url: String = js.native
  
  var verification: Payload = js.native
}
object GitGetCommitResponseData {
  
  @scala.inline
  def apply(
    author: Date,
    committer: Date,
    message: String,
    node_id: String,
    parents: js.Array[Sha],
    sha: String,
    tree: Sha,
    url: String,
    verification: Payload
  ): GitGetCommitResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetCommitResponseData]
  }
  
  @scala.inline
  implicit class GitGetCommitResponseDataMutableBuilder[Self <: GitGetCommitResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Date): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Date): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[Sha]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: Sha*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
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
