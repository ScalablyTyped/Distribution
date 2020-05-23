package typings.onfleetNodeOnfleet.workersMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkerProps extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[OnfleetMetadata] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var teams: js.UndefOr[String] = js.undefined
  var vehicle: js.UndefOr[Vehicle] = js.undefined
}

object UpdateWorkerProps {
  @scala.inline
  def apply(
    capacity: js.UndefOr[Double] = js.undefined,
    displayName: String = null,
    metadata: OnfleetMetadata = null,
    name: String = null,
    teams: String = null,
    vehicle: Vehicle = null
  ): UpdateWorkerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capacity)) __obj.updateDynamic("capacity")(capacity.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (teams != null) __obj.updateDynamic("teams")(teams.asInstanceOf[js.Any])
    if (vehicle != null) __obj.updateDynamic("vehicle")(vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkerProps]
  }
}

