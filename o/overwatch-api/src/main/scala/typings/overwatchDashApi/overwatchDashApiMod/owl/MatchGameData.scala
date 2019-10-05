package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchGameData extends js.Object {
  var attributes: MatchGameAttributeData
  var attributesVersion: String
  var handle: String
  var id: Double
  var points: ScoreTuple
  var state: String
  var stats: Null
  var status: String
  var statusReason: String
}

object MatchGameData {
  @scala.inline
  def apply(
    attributes: MatchGameAttributeData,
    attributesVersion: String,
    handle: String,
    id: Double,
    points: ScoreTuple,
    state: String,
    stats: Null,
    status: String,
    statusReason: String
  ): MatchGameData = {
    val __obj = js.Dynamic.literal(attributes = attributes, attributesVersion = attributesVersion, handle = handle, id = id, points = points, state = state, stats = stats, status = status, statusReason = statusReason)
  
    __obj.asInstanceOf[MatchGameData]
  }
}

