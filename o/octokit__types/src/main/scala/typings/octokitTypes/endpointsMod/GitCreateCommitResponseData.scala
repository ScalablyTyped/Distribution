package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Date
import typings.octokitTypes.anon.Payload
import typings.octokitTypes.anon.Sha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateCommitResponseData extends js.Object {
  
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
object GitCreateCommitResponseData {
  
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
  ): GitCreateCommitResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateCommitResponseData]
  }
  
  @scala.inline
  implicit class GitCreateCommitResponseDataOps[Self <: GitCreateCommitResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor(value: Date): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Date): Self = this.set("committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: Sha*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[Sha]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: Sha): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Payload): Self = this.set("verification", value.asInstanceOf[js.Any])
  }
}
