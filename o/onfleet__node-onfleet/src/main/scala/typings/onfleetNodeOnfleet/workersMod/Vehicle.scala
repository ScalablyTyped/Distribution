package typings.onfleetNodeOnfleet.workersMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.BICYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.CAR
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.MOTORCYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TRUCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vehicle extends js.Object {
  var color: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var licensePlate: js.UndefOr[String] = js.native
  var `type`: BICYCLE | CAR | MOTORCYCLE | TRUCK = js.native
}

object Vehicle {
  @scala.inline
  def apply(`type`: BICYCLE | CAR | MOTORCYCLE | TRUCK): Vehicle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vehicle]
  }
  @scala.inline
  implicit class VehicleOps[Self <: Vehicle] (val x: Self) extends AnyVal {
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
    def setType(value: BICYCLE | CAR | MOTORCYCLE | TRUCK): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLicensePlate(value: String): Self = this.set("licensePlate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensePlate: Self = this.set("licensePlate", js.undefined)
  }
  
}

