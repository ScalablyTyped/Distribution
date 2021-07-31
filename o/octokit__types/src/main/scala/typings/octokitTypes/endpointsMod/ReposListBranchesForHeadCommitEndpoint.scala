package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.groot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListBranchesForHeadCommitEndpoint
  extends StObject
     with RequiredPreview[groot] {
  
  var commit_sha: String
  
  var owner: String
  
  var repo: String
}
object ReposListBranchesForHeadCommitEndpoint {
  
  @scala.inline
  def apply(commit_sha: String, mediaType: `0`[groot], owner: String, repo: String): ReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesForHeadCommitEndpoint]
  }
  
  @scala.inline
  implicit class ReposListBranchesForHeadCommitEndpointMutableBuilder[Self <: ReposListBranchesForHeadCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
