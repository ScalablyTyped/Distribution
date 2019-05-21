package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateRepoEndpoint extends js.Object {
  var owner: java.lang.String
  var permission: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
  var team_id: scala.Double
}

object TeamsAddOrUpdateRepoEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    team_id: scala.Double,
    permission: java.lang.String = null
  ): TeamsAddOrUpdateRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, team_id = team_id)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[TeamsAddOrUpdateRepoEndpoint]
  }
}

