package typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod

import typings.officeDashUiDashFabricDashReact.Anon_AddSticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneContext extends js.Object {
  var scrollablePane: js.UndefOr[Anon_AddSticky] = js.undefined
}

object IScrollablePaneContext {
  @scala.inline
  def apply(scrollablePane: Anon_AddSticky = null): IScrollablePaneContext = {
    val __obj = js.Dynamic.literal()
    if (scrollablePane != null) __obj.updateDynamic("scrollablePane")(scrollablePane)
    __obj.asInstanceOf[IScrollablePaneContext]
  }
}

