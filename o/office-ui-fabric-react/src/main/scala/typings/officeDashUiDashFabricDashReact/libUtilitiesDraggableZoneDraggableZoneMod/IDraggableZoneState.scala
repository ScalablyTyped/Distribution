package typings.officeDashUiDashFabricDashReact.libUtilitiesDraggableZoneDraggableZoneMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesDraggableZoneDraggableZoneDotTypesMod.ICoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDraggableZoneState extends js.Object {
  var isDragging: Boolean
  var lastPosition: js.UndefOr[ICoordinates] = js.undefined
  var position: ICoordinates
}

object IDraggableZoneState {
  @scala.inline
  def apply(isDragging: Boolean, position: ICoordinates, lastPosition: ICoordinates = null): IDraggableZoneState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (lastPosition != null) __obj.updateDynamic("lastPosition")(lastPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggableZoneState]
  }
}

