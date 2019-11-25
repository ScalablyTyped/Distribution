package typings.atOnfleetNodeDashOnfleet.resourcesContainersMod

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.ORGANIZATION
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.TEAM
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.WORKER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetContainer extends js.Object {
  var activeTask: String | Null
  var id: String
  var organization: String
  var tasks: js.Array[String]
  var timeCreated: Double
  var timeLastModified: Double
  var `type`: ORGANIZATION | TEAM | WORKER
  var worker: String
}

object OnfleetContainer {
  @scala.inline
  def apply(
    id: String,
    organization: String,
    tasks: js.Array[String],
    timeCreated: Double,
    timeLastModified: Double,
    `type`: ORGANIZATION | TEAM | WORKER,
    worker: String,
    activeTask: String = null
  ): OnfleetContainer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activeTask != null) __obj.updateDynamic("activeTask")(activeTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetContainer]
  }
}

