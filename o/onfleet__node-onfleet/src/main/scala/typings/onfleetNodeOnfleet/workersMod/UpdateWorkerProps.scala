package typings.onfleetNodeOnfleet.workersMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkerProps extends js.Object {
  var capacity: js.UndefOr[Double] = js.native
  var displayName: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[OnfleetMetadata] = js.native
  var name: js.UndefOr[String] = js.native
  var teams: js.UndefOr[String] = js.native
  var vehicle: js.UndefOr[Vehicle] = js.native
}

object UpdateWorkerProps {
  @scala.inline
  def apply(): UpdateWorkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkerProps]
  }
  @scala.inline
  implicit class UpdateWorkerPropsOps[Self <: UpdateWorkerProps] (val x: Self) extends AnyVal {
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
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setMetadata(value: OnfleetMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTeams(value: String): Self = this.set("teams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeams: Self = this.set("teams", js.undefined)
    @scala.inline
    def setVehicle(value: Vehicle): Self = this.set("vehicle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicle: Self = this.set("vehicle", js.undefined)
  }
  
}

