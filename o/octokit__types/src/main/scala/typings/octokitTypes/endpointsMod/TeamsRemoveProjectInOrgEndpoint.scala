package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveProjectInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var project_id: Double
  var team_slug: String
}

object TeamsRemoveProjectInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, project_id: Double, team_slug: String): TeamsRemoveProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveProjectInOrgEndpoint]
  }
}

