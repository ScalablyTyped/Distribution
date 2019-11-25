package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.error
import typings.atOctokitRest.atOctokitRestStrings.failure
import typings.atOctokitRest.atOctokitRestStrings.pending
import typings.atOctokitRest.atOctokitRestStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateStatusParams extends js.Object {
  /**
    * A string label to differentiate this status from the status of other systems.
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * A short description of the status.
    */
  var description: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var sha: String
  /**
    * The state of the status. Can be one of `error`, `failure`, `pending`, or `success`.
    */
  var state: error | failure | pending | success
  /**
    * The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.
    * For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:
    * `http://ci.example.com/user/repo/build/sha`
    */
  var target_url: js.UndefOr[String] = js.undefined
}

object ReposCreateStatusParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    sha: String,
    state: error | failure | pending | success,
    context: String = null,
    description: String = null,
    target_url: String = null
  ): ReposCreateStatusParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (target_url != null) __obj.updateDynamic("target_url")(target_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateStatusParams]
  }
}

