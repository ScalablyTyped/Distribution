package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   commit_sha :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'groot'> */
@js.native
trait ReposListBranchesForHeadCommitEndpoint extends StObject {
  
  var commit_sha: String = js.native
  
  var mediaType: `17` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposListBranchesForHeadCommitEndpoint {
  
  @scala.inline
  def apply(commit_sha: String, mediaType: `17`, owner: String, repo: String): ReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesForHeadCommitEndpoint]
  }
  
  @scala.inline
  implicit class ReposListBranchesForHeadCommitEndpointMutableBuilder[Self <: ReposListBranchesForHeadCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `17`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
