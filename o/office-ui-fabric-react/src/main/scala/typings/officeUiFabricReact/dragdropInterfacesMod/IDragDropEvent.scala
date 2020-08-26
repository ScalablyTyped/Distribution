package typings.officeUiFabricReact.dragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropEvent extends js.Object {
  /**
    * Whether or not the drag & drop event was handled.
    */
  var isHandled: js.UndefOr[Boolean] = js.native
}

object IDragDropEvent {
  @scala.inline
  def apply(): IDragDropEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDropEvent]
  }
  @scala.inline
  implicit class IDragDropEventOps[Self <: IDragDropEvent] (val x: Self) extends AnyVal {
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
    def setIsHandled(value: Boolean): Self = this.set("isHandled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHandled: Self = this.set("isHandled", js.undefined)
  }
  
}

