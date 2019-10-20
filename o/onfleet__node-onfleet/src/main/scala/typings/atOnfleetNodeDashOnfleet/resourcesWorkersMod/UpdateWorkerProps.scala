package typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod

import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
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
    capacity: Int | Double = null,
    displayName: String = null,
    metadata: OnfleetMetadata = null,
    name: String = null,
    teams: String = null,
    vehicle: Vehicle = null
  ): UpdateWorkerProps = {
    val __obj = js.Dynamic.literal()
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (teams != null) __obj.updateDynamic("teams")(teams)
    if (vehicle != null) __obj.updateDynamic("vehicle")(vehicle)
    __obj.asInstanceOf[UpdateWorkerProps]
  }
}

