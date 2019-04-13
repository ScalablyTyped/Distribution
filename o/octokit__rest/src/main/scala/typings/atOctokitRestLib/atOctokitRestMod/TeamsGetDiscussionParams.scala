package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionParams extends js.Object {
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object TeamsGetDiscussionParams {
  @scala.inline
  def apply(discussion_number: scala.Double, team_id: scala.Double): TeamsGetDiscussionParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsGetDiscussionParams]
  }
}

