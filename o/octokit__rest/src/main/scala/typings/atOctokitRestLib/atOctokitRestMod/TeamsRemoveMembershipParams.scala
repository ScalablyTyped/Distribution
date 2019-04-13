package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMembershipParams extends js.Object {
  var team_id: scala.Double
  var username: java.lang.String
}

object TeamsRemoveMembershipParams {
  @scala.inline
  def apply(team_id: scala.Double, username: java.lang.String): TeamsRemoveMembershipParams = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsRemoveMembershipParams]
  }
}

