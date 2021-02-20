package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateOrUpdateFileContentsEndpoint extends StObject {
  
  /**
    * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
    */
  var author: js.UndefOr[ReposCreateOrUpdateFileContentsParamsAuthor] = js.native
  
  /**
    * The branch name. Default: the repository’s default branch (usually `master`)
    */
  var branch: js.UndefOr[String] = js.native
  
  /**
    * The person that committed the file. Default: the authenticated user.
    */
  var committer: js.UndefOr[ReposCreateOrUpdateFileContentsParamsCommitter] = js.native
  
  /**
    * The new file content, using Base64 encoding.
    */
  var content: String = js.native
  
  /**
    * The commit message.
    */
  var message: String = js.native
  
  var owner: String = js.native
  
  var path: String = js.native
  
  var repo: String = js.native
  
  /**
    * **Required if you are updating a file**. The blob SHA of the file being replaced.
    */
  var sha: js.UndefOr[String] = js.native
}
object ReposCreateOrUpdateFileContentsEndpoint {
  
  @scala.inline
  def apply(content: String, message: String, owner: String, path: String, repo: String): ReposCreateOrUpdateFileContentsEndpoint = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateOrUpdateFileContentsEndpointMutableBuilder[Self <: ReposCreateOrUpdateFileContentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: ReposCreateOrUpdateFileContentsParamsAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setCommitter(value: ReposCreateOrUpdateFileContentsParamsCommitter): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
  }
}
