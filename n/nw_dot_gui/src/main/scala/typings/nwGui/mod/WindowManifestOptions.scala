package typings.nwGui.mod

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
    height: js.UndefOr[Double] = js.undefined,
    icon: String = null,
    max_height: js.UndefOr[Double] = js.undefined,
    max_width: js.UndefOr[Double] = js.undefined,
    min_height: js.UndefOr[Double] = js.undefined,
    min_width: js.UndefOr[Double] = js.undefined,
    position: String = null,
    title: String = null,
    toolbar: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): WindowManifestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(max_height)) __obj.updateDynamic("max_height")(max_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_width)) __obj.updateDynamic("max_width")(max_width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_height)) __obj.updateDynamic("min_height")(min_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_width)) __obj.updateDynamic("min_width")(min_width.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowManifestOptions]
  }
}

