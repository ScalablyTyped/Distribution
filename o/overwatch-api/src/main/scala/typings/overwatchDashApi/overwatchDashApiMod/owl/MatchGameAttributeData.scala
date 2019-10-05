package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchGameAttributeData extends js.Object {
  var instanceID: String
  var map: String
  var mapScore: MatchGameScore
}

object MatchGameAttributeData {
  @scala.inline
  def apply(instanceID: String, map: String, mapScore: MatchGameScore): MatchGameAttributeData = {
    val __obj = js.Dynamic.literal(instanceID = instanceID, map = map, mapScore = mapScore)
  
    __obj.asInstanceOf[MatchGameAttributeData]
  }
}

