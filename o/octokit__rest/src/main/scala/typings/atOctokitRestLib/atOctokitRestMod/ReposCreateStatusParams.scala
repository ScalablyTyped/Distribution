package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateStatusParams extends js.Object {
  /**
    * A string label to differentiate this status from the status of other systems.
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A short description of the status.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
  /**
    * The state of the status. Can be one of `error`, `failure`, `pending`, or `success`.
    */
  var state: atOctokitRestLib.atOctokitRestLibStrings.error | atOctokitRestLib.atOctokitRestLibStrings.failure | atOctokitRestLib.atOctokitRestLibStrings.pending | atOctokitRestLib.atOctokitRestLibStrings.success
  /**
    * The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.
    * For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:
    * `http://ci.example.com/user/repo/build/sha`
    */
  var target_url: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateStatusParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    state: atOctokitRestLib.atOctokitRestLibStrings.error | atOctokitRestLib.atOctokitRestLibStrings.failure | atOctokitRestLib.atOctokitRestLibStrings.pending | atOctokitRestLib.atOctokitRestLibStrings.success,
    context: java.lang.String = null,
    description: java.lang.String = null,
    target_url: java.lang.String = null
  ): ReposCreateStatusParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, sha = sha, state = state.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (description != null) __obj.updateDynamic("description")(description)
    if (target_url != null) __obj.updateDynamic("target_url")(target_url)
    __obj.asInstanceOf[ReposCreateStatusParams]
  }
}

