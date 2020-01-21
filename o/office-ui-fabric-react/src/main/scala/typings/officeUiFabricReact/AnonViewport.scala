package typings.officeUiFabricReact

import typings.officeUiFabricReact.withViewportMod.IViewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonViewport extends js.Object {
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object AnonViewport {
  @scala.inline
  def apply(viewport: IViewport = null): AnonViewport = {
    val __obj = js.Dynamic.literal()
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewport]
  }
}

