package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveRepo_Options extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var team_id: scala.Double
}

object TeamsRemoveRepo_Options {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, team_id: scala.Double): TeamsRemoveRepo_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, team_id = team_id)
  
    __obj.asInstanceOf[TeamsRemoveRepo_Options]
  }
}

