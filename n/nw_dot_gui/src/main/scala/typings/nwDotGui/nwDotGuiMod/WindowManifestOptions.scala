package typings.nwDotGui.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowManifestOptions extends js.Object {
  var frame: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var max_height: js.UndefOr[Double] = js.undefined
  var max_width: js.UndefOr[Double] = js.undefined
  var min_height: js.UndefOr[Double] = js.undefined
  var min_width: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toolbar: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object WindowManifestOptions {
  @scala.inline
  def apply(
    frame: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    icon: String = null,
    max_height: Int | Double = null,
    max_width: Int | Double = null,
    min_height: Int | Double = null,
    min_width: Int | Double = null,
    position: String = null,
    title: String = null,
    toolbar: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): WindowManifestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (max_height != null) __obj.updateDynamic("max_height")(max_height.asInstanceOf[js.Any])
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (min_width != null) __obj.updateDynamic("min_width")(min_width.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowManifestOptions]
  }
}

