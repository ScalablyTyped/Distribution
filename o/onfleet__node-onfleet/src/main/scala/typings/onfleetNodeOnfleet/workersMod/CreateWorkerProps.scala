package typings.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop name - The worker’s complete name.
  * @prop phone - A valid phone number as per the worker’s organization’s country.
  * @prop teams - One or more team IDs of which the worker is a member.
  * @prop vehicle - Optional. The worker’s vehicle; providing no vehicle details is equivalent to the worker being on foot.
  * @prop capacity - Optional. The maximum number of units this worker can carry, for route optimization purposes.
  * @prop displayName - Optional. This value is used in place of the worker's actual name within sms notifications,
  * delivery tracking pages, and across organization boundaries (connections).
  */
trait CreateWorkerProps extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var name: String
  var phone: String
  var teams: String
  var vehicle: js.UndefOr[Vehicle] = js.undefined
}

object CreateWorkerProps {
  @scala.inline
  def apply(
    name: String,
    phone: String,
    teams: String,
    capacity: Int | Double = null,
    displayName: String = null,
    vehicle: Vehicle = null
  ): CreateWorkerProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (vehicle != null) __obj.updateDynamic("vehicle")(vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerProps]
  }
}

