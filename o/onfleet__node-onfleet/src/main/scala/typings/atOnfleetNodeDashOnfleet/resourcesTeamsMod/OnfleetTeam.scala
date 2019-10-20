package typings.atOnfleetNodeDashOnfleet.resourcesTeamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetTeam extends js.Object {
  var hub: String
  var id: String
  var managers: js.Array[String]
  var name: String
  var timeCreated: Double
  var timeLastModified: Double
  var workers: js.Array[String]
}

object OnfleetTeam {
  @scala.inline
  def apply(
    hub: String,
    id: String,
    managers: js.Array[String],
    name: String,
    timeCreated: Double,
    timeLastModified: Double,
    workers: js.Array[String]
  ): OnfleetTeam = {
    val __obj = js.Dynamic.literal(hub = hub, id = id, managers = managers, name = name, timeCreated = timeCreated, timeLastModified = timeLastModified, workers = workers)
  
    __obj.asInstanceOf[OnfleetTeam]
  }
}

