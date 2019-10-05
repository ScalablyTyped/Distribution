package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var animation: js.UndefOr[js.Any] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[js.Any] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    animation: js.Any = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any = null,
    map: Map = null,
    position: js.Any = null,
    shape: js.Any = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (map != null) __obj.updateDynamic("map")(map)
    if (position != null) __obj.updateDynamic("position")(position)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

