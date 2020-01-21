package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDropLocation extends js.Object {
  var dropLocation: js.UndefOr[ColumnDragEndLocation] = js.undefined
}

object AnonDropLocation {
  @scala.inline
  def apply(dropLocation: ColumnDragEndLocation = null): AnonDropLocation = {
    val __obj = js.Dynamic.literal()
    if (dropLocation != null) __obj.updateDynamic("dropLocation")(dropLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropLocation]
  }
}

