package typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a split layout.
  */
trait IOptions extends js.Object {
  /**
    * The content alignment of the layout.
    *
    * The default is `'start'`.
    */
  var alignment: js.UndefOr[Alignment] = js.undefined
  /**
    * The orientation of the layout.
    *
    * The default is `'horizontal'`.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * The renderer to use for the split layout.
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
  def apply(
    renderer: IRenderer,
    alignment: Alignment = null,
    orientation: Orientation = null,
    spacing: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(renderer = renderer)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

