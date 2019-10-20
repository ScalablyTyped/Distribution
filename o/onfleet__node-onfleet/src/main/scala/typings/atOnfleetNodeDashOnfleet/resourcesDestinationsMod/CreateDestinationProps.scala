package typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDestinationProps extends js.Object {
  var address: DestinationAddress
  var location: js.UndefOr[Location] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
}

object CreateDestinationProps {
  @scala.inline
  def apply(address: DestinationAddress, location: Location = null, notes: String = null): CreateDestinationProps = {
    val __obj = js.Dynamic.literal(address = address)
    if (location != null) __obj.updateDynamic("location")(location)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[CreateDestinationProps]
  }
}

