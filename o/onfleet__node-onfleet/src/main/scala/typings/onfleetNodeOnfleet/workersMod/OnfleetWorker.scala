package typings.onfleetNodeOnfleet.workersMod

import typings.onfleetNodeOnfleet.AnonAppVersion
import typings.onfleetNodeOnfleet.destinationsMod.Location
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
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
  var userData: AnonAppVersion
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
    userData: AnonAppVersion,
    activeTask: String = null,
    delayTime: Int | Double = null,
    imageUrl: String = null,
    vehicle: Vehicle = null
  ): OnfleetWorker = {
    val __obj = js.Dynamic.literal(accountStatus = accountStatus.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onDuty = onDuty.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timeLastSeen = timeLastSeen.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    if (activeTask != null) __obj.updateDynamic("activeTask")(activeTask.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (vehicle != null) __obj.updateDynamic("vehicle")(vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetWorker]
  }
}

