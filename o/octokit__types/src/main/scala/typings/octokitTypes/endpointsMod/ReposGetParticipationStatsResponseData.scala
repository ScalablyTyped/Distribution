package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParticipationStatsResponseData extends js.Object {
  var all: js.Array[Double]
  var owner: js.Array[Double]
}

object ReposGetParticipationStatsResponseData {
  @scala.inline
  def apply(all: js.Array[Double], owner: js.Array[Double]): ReposGetParticipationStatsResponseData = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetParticipationStatsResponseData]
  }
}

