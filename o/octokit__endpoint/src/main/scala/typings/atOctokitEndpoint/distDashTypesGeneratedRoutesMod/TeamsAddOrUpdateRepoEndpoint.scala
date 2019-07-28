package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateRepoEndpoint extends js.Object {
  var owner: String
  var permission: js.UndefOr[String] = js.undefined
  var repo: String
  var team_id: Double
}

object TeamsAddOrUpdateRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double, permission: String = null): TeamsAddOrUpdateRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, team_id = team_id)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[TeamsAddOrUpdateRepoEndpoint]
  }
}

