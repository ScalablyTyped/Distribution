package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveProjectInOrgParams extends js.Object {
  var org: String
  var project_id: Double
  var team_slug: String
}

object TeamsRemoveProjectInOrgParams {
  @scala.inline
  def apply(org: String, project_id: Double, team_slug: String): TeamsRemoveProjectInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsRemoveProjectInOrgParams]
  }
}

