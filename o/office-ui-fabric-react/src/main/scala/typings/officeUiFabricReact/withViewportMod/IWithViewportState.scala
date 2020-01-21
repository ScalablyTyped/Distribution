package typings.officeUiFabricReact.withViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWithViewportState extends js.Object {
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object IWithViewportState {
  @scala.inline
  def apply(viewport: IViewport = null): IWithViewportState = {
    val __obj = js.Dynamic.literal()
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWithViewportState]
  }
}

