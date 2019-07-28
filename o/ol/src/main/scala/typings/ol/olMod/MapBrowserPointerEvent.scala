package typings.ol.olMod

import typings.ol.mapBrowserPointerEventMod.default
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent protected () extends default {
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    pointerEvent: typings.ol.pointerPointerEventMod.default
  ) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    pointerEvent: typings.ol.pointerPointerEventMod.default,
    opt_dragging: Boolean
  ) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    pointerEvent: typings.ol.pointerPointerEventMod.default,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}

