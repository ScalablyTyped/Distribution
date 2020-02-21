package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgProjectid extends js.Object {
  var org: AnonRequired
  var project_id: AnonRequired
  var team_slug: AnonRequired
}

object AnonOrgProjectid {
  @scala.inline
  def apply(org: AnonRequired, project_id: AnonRequired, team_slug: AnonRequired): AnonOrgProjectid = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgProjectid]
  }
}

