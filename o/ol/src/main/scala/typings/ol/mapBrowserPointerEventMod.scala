package typings.ol

import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserPointerEvent", JSImport.Namespace)
@js.native
object mapBrowserPointerEventMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.mapBrowserEventMod.default {
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
  
  type MapBrowserPointerEvent = typings.ol.mapBrowserEventMod.default
}

