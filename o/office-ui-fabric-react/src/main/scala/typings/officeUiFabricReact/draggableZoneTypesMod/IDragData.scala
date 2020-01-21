package typings.officeUiFabricReact.draggableZoneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragData extends js.Object {
  var delta: ICoordinates
  var lastPosition: js.UndefOr[ICoordinates] = js.undefined
  var position: ICoordinates
}

object IDragData {
  @scala.inline
  def apply(delta: ICoordinates, position: ICoordinates, lastPosition: ICoordinates = null): IDragData = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (lastPosition != null) __obj.updateDynamic("lastPosition")(lastPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragData]
  }
}

