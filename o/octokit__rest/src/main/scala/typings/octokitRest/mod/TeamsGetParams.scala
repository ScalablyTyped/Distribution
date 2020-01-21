package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetParams extends js.Object {
  var team_id: Double
}

object TeamsGetParams {
  @scala.inline
  def apply(team_id: Double): TeamsGetParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetParams]
  }
}

