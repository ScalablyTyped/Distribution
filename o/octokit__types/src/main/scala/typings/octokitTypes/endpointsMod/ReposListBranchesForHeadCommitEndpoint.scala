package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   commit_sha :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'groot'> */
@js.native
trait ReposListBranchesForHeadCommitEndpoint extends js.Object {
  
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
  implicit class ReposListBranchesForHeadCommitEndpointOps[Self <: ReposListBranchesForHeadCommitEndpoint] (val x: Self) extends AnyVal {
    
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
    def setCommit_sha(value: String): Self = this.set("commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `17`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
