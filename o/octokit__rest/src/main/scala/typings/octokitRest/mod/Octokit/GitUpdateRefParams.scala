package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRefParams extends js.Object {
  /**
    * Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or setting it to `false` will make sure you're not overwriting work.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var ref: String
  var repo: String
  /**
    * The SHA1 value to set this reference to
    */
  var sha: String
}

object GitUpdateRefParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, sha: String, force: js.UndefOr[Boolean] = js.undefined): GitUpdateRefParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUpdateRefParams]
  }
}

