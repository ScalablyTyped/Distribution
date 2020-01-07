package typings.ol.olMod

import typings.ol.mapBrowserPointerEventMod.default
import typings.ol.pluggableMapMod.FrameState
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent protected () extends default {
  def this(`type`: String, map: typings.ol.pluggableMapMod.default, pointerEvent: PointerEvent) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    pointerEvent: PointerEvent,
    opt_dragging: Boolean
  ) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    pointerEvent: PointerEvent,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}

