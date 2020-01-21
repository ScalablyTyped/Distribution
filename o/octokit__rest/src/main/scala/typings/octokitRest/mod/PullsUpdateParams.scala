package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.closed
import typings.octokitRest.octokitRestStrings.open
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
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateParams]
  }
}

