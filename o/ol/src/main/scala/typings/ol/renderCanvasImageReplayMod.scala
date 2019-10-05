package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.renderCanvasImageReplayMod.CanvasImageReplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ImageReplay", JSImport.Namespace)
@js.native
object renderCanvasImageReplayMod extends js.Object {
  @js.native
  class default protected () extends CanvasImageReplay {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
  }
  
  type CanvasImageReplay = typings.ol.renderCanvasReplayMod.default
}

