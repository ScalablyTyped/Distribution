package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsReviewProjectParams extends js.Object {
  var project_id: scala.Double
  var team_id: scala.Double
}

object TeamsReviewProjectParams {
  @scala.inline
  def apply(project_id: scala.Double, team_id: scala.Double): TeamsReviewProjectParams = {
    val __obj = js.Dynamic.literal(project_id = project_id, team_id = team_id)
  
    __obj.asInstanceOf[TeamsReviewProjectParams]
  }
}

