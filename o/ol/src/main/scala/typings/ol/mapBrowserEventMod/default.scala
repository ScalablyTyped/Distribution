package typings.ol.mapBrowserEventMod

import typings.ol.pluggableMapMod.FrameState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEvent", JSImport.Default)
@js.native
class default protected () extends MapBrowserEvent {
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
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}

