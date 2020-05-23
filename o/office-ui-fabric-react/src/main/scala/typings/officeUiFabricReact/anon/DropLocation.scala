package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropLocation extends js.Object {
  var dropLocation: js.UndefOr[ColumnDragEndLocation] = js.undefined
}

object DropLocation {
  @scala.inline
  def apply(dropLocation: ColumnDragEndLocation = null): DropLocation = {
    val __obj = js.Dynamic.literal()
    if (dropLocation != null) __obj.updateDynamic("dropLocation")(dropLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLocation]
  }
}

