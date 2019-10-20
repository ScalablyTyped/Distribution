package typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod

import typings.atOnfleetNodeDashOnfleet.Anon_AppVersion
import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
import typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetWorker extends js.Object {
  var accountStatus: String
  var activeTask: String | Null
  var capacity: Double
  var delayTime: Double | Null
  var displayName: String
  var id: String
  var imageUrl: String | Null
  var location: Location
  var metadata: js.Array[OnfleetMetadata]
  var name: String
  var onDuty: Boolean
  var organization: String
  var phone: String
  var tasks: js.Array[String]
  var teams: js.Array[String]
  var timeCreated: Double
  var timeLastModified: Double
  var timeLastSeen: Double
  var userData: Anon_AppVersion
  var vehicle: Vehicle | Null
}

object OnfleetWorker {
  @scala.inline
  def apply(
    accountStatus: String,
    capacity: Double,
    displayName: String,
    id: String,
    location: Location,
    metadata: js.Array[OnfleetMetadata],
    name: String,
    onDuty: Boolean,
    organization: String,
    phone: String,
    tasks: js.Array[String],
    teams: js.Array[String],
    timeCreated: Double,
    timeLastModified: Double,
    timeLastSeen: Double,
    userData: Anon_AppVersion,
    activeTask: String = null,
    delayTime: Int | Double = null,
    imageUrl: String = null,
    vehicle: Vehicle = null
  ): OnfleetWorker = {
    val __obj = js.Dynamic.literal(accountStatus = accountStatus, capacity = capacity, displayName = displayName, id = id, location = location, metadata = metadata, name = name, onDuty = onDuty, organization = organization, phone = phone, tasks = tasks, teams = teams, timeCreated = timeCreated, timeLastModified = timeLastModified, timeLastSeen = timeLastSeen, userData = userData)
    if (activeTask != null) __obj.updateDynamic("activeTask")(activeTask)
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (vehicle != null) __obj.updateDynamic("vehicle")(vehicle)
    __obj.asInstanceOf[OnfleetWorker]
  }
}

