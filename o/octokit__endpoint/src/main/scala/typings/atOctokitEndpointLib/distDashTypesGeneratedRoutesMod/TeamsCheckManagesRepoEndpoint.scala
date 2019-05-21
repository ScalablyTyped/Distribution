package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckManagesRepoEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var team_id: scala.Double
}

object TeamsCheckManagesRepoEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, team_id: scala.Double): TeamsCheckManagesRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, team_id = team_id)
  
    __obj.asInstanceOf[TeamsCheckManagesRepoEndpoint]
  }
}

