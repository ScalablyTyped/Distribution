package typings.officeUiFabricReact.draggableZoneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragData extends js.Object {
  var delta: ICoordinates = js.native
  var lastPosition: js.UndefOr[ICoordinates] = js.native
  var position: ICoordinates = js.native
}

object IDragData {
  @scala.inline
  def apply(delta: ICoordinates, position: ICoordinates): IDragData = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragData]
  }
  @scala.inline
  implicit class IDragDataOps[Self <: IDragData] (val x: Self) extends AnyVal {
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
    def setDelta(value: ICoordinates): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: ICoordinates): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPosition(value: ICoordinates): Self = this.set("lastPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPosition: Self = this.set("lastPosition", js.undefined)
  }
  
}

