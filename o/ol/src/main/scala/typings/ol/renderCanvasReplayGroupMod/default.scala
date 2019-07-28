package typings.ol.renderCanvasReplayGroupMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ReplayGroup", JSImport.Default)
@js.native
class default protected () extends CanvasReplayGroup {
  def this(
    tolerance: Double,
    maxExtent: Extent,
    resolution: Double,
    pixelRatio: Double,
    overlaps: Boolean,
    declutterTree: js.Any
  ) = this()
  def this(
    tolerance: Double,
    maxExtent: Extent,
    resolution: Double,
    pixelRatio: Double,
    overlaps: Boolean,
    declutterTree: js.Any,
    opt_renderBuffer: Double
  ) = this()
}

