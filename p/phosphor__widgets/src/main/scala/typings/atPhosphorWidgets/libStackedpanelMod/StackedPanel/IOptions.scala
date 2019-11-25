package typings.atPhosphorWidgets.libStackedpanelMod.StackedPanel

import typings.atPhosphorWidgets.libStackedlayoutMod.StackedLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a stacked panel.
  */
trait IOptions extends js.Object {
  /**
    * The stacked layout to use for the stacked panel.
    *
    * The default is a new `StackedLayout`.
    */
  var layout: js.UndefOr[StackedLayout] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(layout: StackedLayout = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

