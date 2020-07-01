package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckPermissionsForRepoLegacyEndpoint extends js.Object {
  var owner: String
  var repo: String
  var team_id: Double
}

object TeamsCheckPermissionsForRepoLegacyEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double): TeamsCheckPermissionsForRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoLegacyEndpoint]
  }
}

