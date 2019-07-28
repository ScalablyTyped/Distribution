package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateParams extends js.Object {
  /**
    * The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository.
    */
  var base: String
  /**
    * The contents of the pull request.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the pull request is a draft. See "[Draft Pull Requests](https://help.github.com/en/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help documentation to learn more.
    */
  var draft: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`.
    */
  var head: String
  /**
    * Indicates whether [maintainers can modify](https://help.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
    */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
  /**
    * The title of the pull request.
    */
  var title: String
}

object PullsCreateParams {
  @scala.inline
  def apply(
    base: String,
    head: String,
    owner: String,
    repo: String,
    title: String,
    body: String = null,
    draft: js.UndefOr[Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  ): PullsCreateParams = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo, title = title)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    __obj.asInstanceOf[PullsCreateParams]
  }
}

