package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsReviewProjectInOrgParams extends js.Object {
  var org: String
  var project_id: Double
  var team_slug: String
}

object TeamsReviewProjectInOrgParams {
  @scala.inline
  def apply(org: String, project_id: Double, team_slug: String): TeamsReviewProjectInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsReviewProjectInOrgParams]
  }
}

