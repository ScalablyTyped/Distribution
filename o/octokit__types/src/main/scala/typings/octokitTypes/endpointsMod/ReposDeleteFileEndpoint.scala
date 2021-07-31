package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteFileEndpoint extends StObject {
  
  /**
    * object containing information about the author.
    */
  var author: js.UndefOr[ReposDeleteFileParamsAuthor] = js.undefined
  
  /**
    * The branch name. Default: the repository’s default branch (usually `master`)
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * object containing information about the committer.
    */
  var committer: js.UndefOr[ReposDeleteFileParamsCommitter] = js.undefined
  
  /**
    * The commit message.
    */
  var message: String
  
  var owner: String
  
  var path: String
  
  var repo: String
  
  /**
    * The blob SHA of the file being replaced.
    */
  var sha: String
}
object ReposDeleteFileEndpoint {
  
  @scala.inline
  def apply(message: String, owner: String, path: String, repo: String, sha: String): ReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteFileEndpointMutableBuilder[Self <: ReposDeleteFileEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: ReposDeleteFileParamsAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setCommitter(value: ReposDeleteFileParamsCommitter): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
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
  }
}
