package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateOrUpdateFileContentsEndpoint extends StObject {
  
  /**
    * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
    */
  var author: js.UndefOr[ReposCreateOrUpdateFileContentsParamsAuthor] = js.undefined
  
  /**
    * The branch name. Default: the repository’s default branch (usually `master`)
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * The person that committed the file. Default: the authenticated user.
    */
  var committer: js.UndefOr[ReposCreateOrUpdateFileContentsParamsCommitter] = js.undefined
  
  /**
    * The new file content, using Base64 encoding.
    */
  var content: String
  
  /**
    * The commit message.
    */
  var message: String
  
  var owner: String
  
  var path: String
  
  var repo: String
  
  /**
    * **Required if you are updating a file**. The blob SHA of the file being replaced.
    */
  var sha: js.UndefOr[String] = js.undefined
}
object ReposCreateOrUpdateFileContentsEndpoint {
  
  inline def apply(content: String, message: String, owner: String, path: String, repo: String): ReposCreateOrUpdateFileContentsEndpoint = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsEndpoint]
  }
  
  extension [Self <: ReposCreateOrUpdateFileContentsEndpoint](x: Self) {
    
    inline def setAuthor(value: ReposCreateOrUpdateFileContentsParamsAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommitter(value: ReposCreateOrUpdateFileContentsParamsCommitter): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
  }
}
