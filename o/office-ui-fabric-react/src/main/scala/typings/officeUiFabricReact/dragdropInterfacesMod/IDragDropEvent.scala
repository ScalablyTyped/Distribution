package typings.officeUiFabricReact.dragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropEvent extends js.Object {
  /**
    * Whether or not the drag & drop event was handled.
    */
  var isHandled: js.UndefOr[Boolean] = js.undefined
}

object IDragDropEvent {
  @scala.inline
  def apply(isHandled: js.UndefOr[Boolean] = js.undefined): IDragDropEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isHandled)) __obj.updateDynamic("isHandled")(isHandled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropEvent]
  }
}

