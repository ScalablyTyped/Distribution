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
@js.native
trait CreateWorkerProps extends js.Object {
  var capacity: js.UndefOr[Double] = js.native
  var displayName: js.UndefOr[String] = js.native
  var name: String = js.native
  var phone: String = js.native
  var teams: String = js.native
  var vehicle: js.UndefOr[Vehicle] = js.native
}

object CreateWorkerProps {
  @scala.inline
  def apply(name: String, phone: String, teams: String): CreateWorkerProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerProps]
  }
  @scala.inline
  implicit class CreateWorkerPropsOps[Self <: CreateWorkerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeams(value: String): Self = this.set("teams", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setVehicle(value: Vehicle): Self = this.set("vehicle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicle: Self = this.set("vehicle", js.undefined)
  }
  
}

