package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParticipationStatsResponse extends js.Object {
  var all: js.Array[Double]
  var owner: js.Array[Double]
}

object ReposGetParticipationStatsResponse {
  @scala.inline
  def apply(all: js.Array[Double], owner: js.Array[Double]): ReposGetParticipationStatsResponse = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetParticipationStatsResponse]
  }
}

