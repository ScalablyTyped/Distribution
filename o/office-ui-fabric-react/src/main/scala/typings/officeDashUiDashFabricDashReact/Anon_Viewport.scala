package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Viewport extends js.Object {
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object Anon_Viewport {
  @scala.inline
  def apply(viewport: IViewport = null): Anon_Viewport = {
    val __obj = js.Dynamic.literal()
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Viewport]
  }
}

