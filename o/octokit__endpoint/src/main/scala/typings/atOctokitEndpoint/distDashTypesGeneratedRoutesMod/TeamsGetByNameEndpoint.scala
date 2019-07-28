package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameEndpoint extends js.Object {
  var org: String
  var team_slug: String
}

object TeamsGetByNameEndpoint {
  @scala.inline
  def apply(org: String, team_slug: String): TeamsGetByNameEndpoint = {
    val __obj = js.Dynamic.literal(org = org, team_slug = team_slug)
  
    __obj.asInstanceOf[TeamsGetByNameEndpoint]
  }
}

