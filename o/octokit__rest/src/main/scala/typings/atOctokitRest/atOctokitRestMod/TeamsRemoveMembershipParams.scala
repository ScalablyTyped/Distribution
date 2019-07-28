package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMembershipParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsRemoveMembershipParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsRemoveMembershipParams = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsRemoveMembershipParams]
  }
}

