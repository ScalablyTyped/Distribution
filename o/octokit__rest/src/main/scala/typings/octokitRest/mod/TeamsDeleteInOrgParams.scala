package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteInOrgParams extends js.Object {
  var org: String
  var team_slug: String
}

object TeamsDeleteInOrgParams {
  @scala.inline
  def apply(org: String, team_slug: String): TeamsDeleteInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsDeleteInOrgParams]
  }
}

