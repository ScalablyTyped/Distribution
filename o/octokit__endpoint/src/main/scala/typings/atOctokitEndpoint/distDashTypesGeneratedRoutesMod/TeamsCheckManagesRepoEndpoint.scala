package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckManagesRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
  var team_id: Double
}

object TeamsCheckManagesRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double): TeamsCheckManagesRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, team_id = team_id)
  
    __obj.asInstanceOf[TeamsCheckManagesRepoEndpoint]
  }
}

