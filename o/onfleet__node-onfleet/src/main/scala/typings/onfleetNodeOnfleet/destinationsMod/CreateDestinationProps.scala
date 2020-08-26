package typings.onfleetNodeOnfleet.destinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDestinationProps extends js.Object {
  var address: DestinationAddress = js.native
  var location: js.UndefOr[Location] = js.native
  var notes: js.UndefOr[String] = js.native
}

object CreateDestinationProps {
  @scala.inline
  def apply(address: DestinationAddress): CreateDestinationProps = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDestinationProps]
  }
  @scala.inline
  implicit class CreateDestinationPropsOps[Self <: CreateDestinationProps] (val x: Self) extends AnyVal {
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
    def setAddress(value: DestinationAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
  
}

