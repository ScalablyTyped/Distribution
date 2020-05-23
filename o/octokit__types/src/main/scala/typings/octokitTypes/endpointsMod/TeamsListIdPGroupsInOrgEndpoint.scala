package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListIdPGroupsInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsListIdPGroupsInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, team_slug: String): TeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsInOrgEndpoint]
  }
}

