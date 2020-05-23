package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`13`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   commit_sha  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'groot'> */
trait ReposListBranchesForHeadCommitEndpoint extends js.Object {
  var commit_sha: String
  var mediaType: `13`
  var owner: String
  var repo: String
}

object ReposListBranchesForHeadCommitEndpoint {
  @scala.inline
  def apply(commit_sha: String, mediaType: `13`, owner: String, repo: String): ReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesForHeadCommitEndpoint]
  }
}

