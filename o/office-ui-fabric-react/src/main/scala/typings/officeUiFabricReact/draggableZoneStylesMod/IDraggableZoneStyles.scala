package typings.officeUiFabricReact.draggableZoneStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDraggableZoneStyles extends js.Object {
  var root: String = js.native
}

object IDraggableZoneStyles {
  @scala.inline
  def apply(root: String): IDraggableZoneStyles = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggableZoneStyles]
  }
  @scala.inline
  implicit class IDraggableZoneStylesOps[Self <: IDraggableZoneStyles] (val x: Self) extends AnyVal {
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

