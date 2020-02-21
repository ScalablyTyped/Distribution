package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipInOrgParams extends js.Object {
  var org: String
  var team_slug: String
  var username: String
}

object TeamsGetMembershipInOrgParams {
  @scala.inline
  def apply(org: String, team_slug: String, username: String): TeamsGetMembershipInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetMembershipInOrgParams]
  }
}

