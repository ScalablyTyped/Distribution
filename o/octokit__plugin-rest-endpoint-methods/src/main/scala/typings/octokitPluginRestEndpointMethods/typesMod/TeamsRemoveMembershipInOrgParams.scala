package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMembershipInOrgParams extends js.Object {
  var org: String
  var team_slug: String
  var username: String
}

object TeamsRemoveMembershipInOrgParams {
  @scala.inline
  def apply(org: String, team_slug: String, username: String): TeamsRemoveMembershipInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveMembershipInOrgParams]
  }
}

