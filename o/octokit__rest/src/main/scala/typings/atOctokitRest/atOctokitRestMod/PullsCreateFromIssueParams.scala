package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueParams extends js.Object {
  /**
    * The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository.
    */
  var base: String
  /**
    * Indicates whether the pull request is a draft. See "[Draft Pull Requests](https://help.github.com/en/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help documentation to learn more.
    */
  var draft: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`.
    */
  var head: String
  /**
    * The issue number in this repository to turn into a Pull Request.
    */
  var issue: Double
  /**
    * Indicates whether [maintainers can modify](https://help.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
    */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
}

object PullsCreateFromIssueParams {
  @scala.inline
  def apply(
    base: String,
    head: String,
    issue: Double,
    owner: String,
    repo: String,
    draft: js.UndefOr[Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  ): PullsCreateFromIssueParams = {
    val __obj = js.Dynamic.literal(base = base, head = head, issue = issue, owner = owner, repo = repo)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    __obj.asInstanceOf[PullsCreateFromIssueParams]
  }
}

