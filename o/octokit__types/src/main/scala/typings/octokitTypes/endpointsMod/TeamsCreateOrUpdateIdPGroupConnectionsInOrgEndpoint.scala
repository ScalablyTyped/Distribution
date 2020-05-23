package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint extends js.Object {
  /**
    * The IdP groups you want to connect to a GitHub team. When updating, the new `groups` object will replace the original one. You must include any existing groups that you don't want to remove.
    */
  var groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups]
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint {
  @scala.inline
  def apply(
    groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups],
    org_ : String,
    team_slug: String
  ): TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint]
  }
}

