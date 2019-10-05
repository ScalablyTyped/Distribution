package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamStandingInfo extends js.Object {
  var abbreviatedName: String
  var divisionId: Double
  var id: Double
  var league: StandingInfo
  var name: String
  var preseason: PreseasonStandingInfo
  var stages: Stages
}

object TeamStandingInfo {
  @scala.inline
  def apply(
    abbreviatedName: String,
    divisionId: Double,
    id: Double,
    league: StandingInfo,
    name: String,
    preseason: PreseasonStandingInfo,
    stages: Stages
  ): TeamStandingInfo = {
    val __obj = js.Dynamic.literal(abbreviatedName = abbreviatedName, divisionId = divisionId, id = id, league = league, name = name, preseason = preseason, stages = stages)
  
    __obj.asInstanceOf[TeamStandingInfo]
  }
}

