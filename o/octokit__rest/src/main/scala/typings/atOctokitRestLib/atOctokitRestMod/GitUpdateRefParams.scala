package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRefParams extends js.Object {
  /**
    * Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or setting it to `false` will make sure you're not overwriting work.
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
  /**
    * The SHA1 value to set this reference to
    */
  var sha: java.lang.String
}

object GitUpdateRefParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): GitUpdateRefParams = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[GitUpdateRefParams]
  }
}

