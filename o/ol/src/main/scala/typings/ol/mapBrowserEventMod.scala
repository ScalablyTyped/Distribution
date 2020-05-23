package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEvent", JSImport.Namespace)
@js.native
object mapBrowserEventMod extends js.Object {
  @js.native
  trait MapBrowserEvent
    extends typings.ol.mapEventMod.default {
    var coordinate: Coordinate = js.native
    var dragging: Boolean = js.native
    var originalEvent: Event = js.native
    var pixel: Pixel = js.native
  }
  
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
  
}

