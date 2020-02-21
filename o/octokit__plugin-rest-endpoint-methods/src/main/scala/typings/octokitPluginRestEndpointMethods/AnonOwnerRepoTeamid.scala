package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoTeamid extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var team_id: AnonRequired
}

object AnonOwnerRepoTeamid {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, team_id: AnonRequired): AnonOwnerRepoTeamid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepoTeamid]
  }
}

