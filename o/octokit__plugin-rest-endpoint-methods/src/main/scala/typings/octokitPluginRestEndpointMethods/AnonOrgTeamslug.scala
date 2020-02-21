package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgTeamslug extends js.Object {
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonOrgTeamslug {
  @scala.inline
  def apply(org: AnonRequired, team_slug: AnonRequired): AnonOrgTeamslug = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgTeamslug]
  }
}

