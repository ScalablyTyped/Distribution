package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitGetCommitEndpoint extends StObject {
  
  var commit_sha: String
  
  var owner: String
  
  var repo: String
}
object GitGetCommitEndpoint {
  
  @scala.inline
  def apply(commit_sha: String, owner: String, repo: String): GitGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetCommitEndpoint]
  }
  
  @scala.inline
  implicit class GitGetCommitEndpointMutableBuilder[Self <: GitGetCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
