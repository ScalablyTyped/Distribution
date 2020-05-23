package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.withViewportMod.IViewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object Viewport {
  @scala.inline
  def apply(viewport: IViewport = null): Viewport = {
    val __obj = js.Dynamic.literal()
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

