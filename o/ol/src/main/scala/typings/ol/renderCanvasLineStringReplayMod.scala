package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.renderCanvasLineStringReplayMod.CanvasLineStringReplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/LineStringReplay", JSImport.Namespace)
@js.native
object renderCanvasLineStringReplayMod extends js.Object {
  @js.native
  trait CanvasLineStringReplay
    extends typings.ol.renderCanvasReplayMod.default {
    def applyStroke(): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasLineStringReplay {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
  }
  
}

