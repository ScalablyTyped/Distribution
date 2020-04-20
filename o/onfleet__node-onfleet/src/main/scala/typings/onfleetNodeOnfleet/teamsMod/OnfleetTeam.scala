package typings.onfleetNodeOnfleet.teamsMod

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
    val __obj = js.Dynamic.literal(hub = hub.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetTeam]
  }
}

