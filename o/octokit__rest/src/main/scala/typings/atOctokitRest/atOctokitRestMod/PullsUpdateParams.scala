package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.closed
import typings.atOctokitRest.atOctokitRestStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateParams extends js.Object {
  /**
    * The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository.
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * The contents of the pull request.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether [maintainers can modify](https://help.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
    */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  /**
    * State of this Pull Request. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  /**
    * The title of the pull request.
    */
  var title: js.UndefOr[String] = js.undefined
}

object PullsUpdateParams {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    base: String = null,
    body: String = null,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined,
    state: open | closed = null,
    title: String = null
  ): PullsUpdateParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (base != null) __obj.updateDynamic("base")(base)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PullsUpdateParams]
  }
}

