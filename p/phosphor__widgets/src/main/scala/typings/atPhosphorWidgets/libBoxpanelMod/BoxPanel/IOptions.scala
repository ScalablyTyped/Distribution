package typings.atPhosphorWidgets.libBoxpanelMod.BoxPanel

import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a box panel.
  */
trait IOptions extends js.Object {
  /**
    * The content alignment of the panel.
    *
    * The default is `'start'`.
    */
  var alignment: js.UndefOr[Alignment] = js.undefined
  /**
    * The layout direction of the panel.
    *
    * The default is `'top-to-bottom'`.
    */
  var direction: js.UndefOr[Direction] = js.undefined
  /**
    * The box layout to use for the box panel.
    *
    * If this is provided, the other options are ignored.
    *
    * The default is a new `BoxLayout`.
    */
  var layout: js.UndefOr[BoxLayout] = js.undefined
  /**
    * The spacing between items in the panel.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    alignment: Alignment = null,
    direction: Direction = null,
    layout: BoxLayout = null,
    spacing: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

