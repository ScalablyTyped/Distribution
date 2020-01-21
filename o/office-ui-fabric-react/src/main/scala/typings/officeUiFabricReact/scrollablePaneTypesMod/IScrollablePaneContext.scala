package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.officeUiFabricReact.AnonAddSticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneContext extends js.Object {
  var scrollablePane: js.UndefOr[AnonAddSticky] = js.undefined
}

object IScrollablePaneContext {
  @scala.inline
  def apply(scrollablePane: AnonAddSticky = null): IScrollablePaneContext = {
    val __obj = js.Dynamic.literal()
    if (scrollablePane != null) __obj.updateDynamic("scrollablePane")(scrollablePane.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneContext]
  }
}

