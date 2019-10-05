package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.renderCanvasPolygonReplayMod.CanvasPolygonReplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/PolygonReplay", JSImport.Namespace)
@js.native
object renderCanvasPolygonReplayMod extends js.Object {
  @js.native
  class default protected () extends CanvasPolygonReplay {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
  }
  
  type CanvasPolygonReplay = typings.ol.renderCanvasReplayMod.default
}

