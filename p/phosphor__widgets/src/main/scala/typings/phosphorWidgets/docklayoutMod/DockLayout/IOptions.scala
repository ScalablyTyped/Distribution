package typings.phosphorWidgets.docklayoutMod.DockLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a dock layout.
  */
trait IOptions extends js.Object {
  /**
    * The renderer to use for the dock layout.
    */
  var renderer: IRenderer
  /**
    * The spacing between items in the layout.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(renderer: IRenderer, spacing: Int | Double = null): IOptions = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

