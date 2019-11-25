package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveProjectParams extends js.Object {
  var project_id: Double
  var team_id: Double
}

object TeamsRemoveProjectParams {
  @scala.inline
  def apply(project_id: Double, team_id: Double): TeamsRemoveProjectParams = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsRemoveProjectParams]
  }
}

