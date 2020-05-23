package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`13`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   commit_sha  :string,   per_page ? :number,   page ? :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'groot'> */
trait ReposListPullRequestsAssociatedWithCommitEndpoint extends js.Object {
  var commit_sha: String
  var mediaType: `13`
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListPullRequestsAssociatedWithCommitEndpoint {
  @scala.inline
  def apply(
    commit_sha: String,
    mediaType: `13`,
    owner: String,
    repo: String,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitEndpoint]
  }
}

