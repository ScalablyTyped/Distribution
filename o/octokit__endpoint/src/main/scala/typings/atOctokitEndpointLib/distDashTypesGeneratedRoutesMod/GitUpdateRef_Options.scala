package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRef_Options extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
}

object GitUpdateRef_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): GitUpdateRef_Options = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[GitUpdateRef_Options]
  }
}

