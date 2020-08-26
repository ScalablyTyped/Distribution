package typings.ol.mod

import typings.ol.mapBrowserEventMod.default
import typings.ol.pluggableMapMod.FrameState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserEvent")
@js.native
class MapBrowserEvent protected () extends default {
  def this(`type`: String, map: typings.ol.pluggableMapMod.default, browserEvent: Event) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    browserEvent: Event,
    opt_dragging: Boolean
  ) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    browserEvent: Event,
    opt_dragging: js.UndefOr[scala.Nothing],
    opt_frameState: FrameState
  ) = this()
  def this(
    `type`: String,
    map: typings.ol.pluggableMapMod.default,
    browserEvent: Event,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}

