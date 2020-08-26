package typings.officeUiFabricReact.draggableZoneDraggableZoneMod

import typings.officeUiFabricReact.draggableZoneTypesMod.ICoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDraggableZoneState extends js.Object {
  var isDragging: Boolean = js.native
  var lastPosition: js.UndefOr[ICoordinates] = js.native
  var position: ICoordinates = js.native
}

object IDraggableZoneState {
  @scala.inline
  def apply(isDragging: Boolean, position: ICoordinates): IDraggableZoneState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggableZoneState]
  }
  @scala.inline
  implicit class IDraggableZoneStateOps[Self <: IDraggableZoneState] (val x: Self) extends AnyVal {
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
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: ICoordinates): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPosition(value: ICoordinates): Self = this.set("lastPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPosition: Self = this.set("lastPosition", js.undefined)
  }
  
}

