package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipForUserInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var team_slug: String
  var username: String
}

object TeamsGetMembershipForUserInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, team_slug: String, username: String): TeamsGetMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMembershipForUserInOrgEndpoint]
  }
}

