package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMembershipParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMembershipParams = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsGetMembershipParams]
  }
}

