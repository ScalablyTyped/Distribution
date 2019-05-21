package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameEndpoint extends js.Object {
  var org: java.lang.String
  var team_slug: java.lang.String
}

object TeamsGetByNameEndpoint {
  @scala.inline
  def apply(org: java.lang.String, team_slug: java.lang.String): TeamsGetByNameEndpoint = {
    val __obj = js.Dynamic.literal(org = org, team_slug = team_slug)
  
    __obj.asInstanceOf[TeamsGetByNameEndpoint]
  }
}

