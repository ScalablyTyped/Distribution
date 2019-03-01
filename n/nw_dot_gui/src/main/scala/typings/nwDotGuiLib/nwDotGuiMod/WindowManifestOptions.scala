package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowManifestOptions extends js.Object {
  var frame: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var max_height: js.UndefOr[scala.Double] = js.undefined
  var max_width: js.UndefOr[scala.Double] = js.undefined
  var min_height: js.UndefOr[scala.Double] = js.undefined
  var min_width: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WindowManifestOptions {
  @scala.inline
  def apply(
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icon: java.lang.String = null,
    max_height: scala.Int | scala.Double = null,
    max_width: scala.Int | scala.Double = null,
    min_height: scala.Int | scala.Double = null,
    min_width: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    title: java.lang.String = null,
    toolbar: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): WindowManifestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (max_height != null) __obj.updateDynamic("max_height")(max_height.asInstanceOf[js.Any])
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (min_width != null) __obj.updateDynamic("min_width")(min_width.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowManifestOptions]
  }
}

