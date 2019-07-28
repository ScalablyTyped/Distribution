package typings.ol.renderCanvasImmediateMod

import typings.ol.extentMod.Extent
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/Immediate", JSImport.Default)
@js.native
class default protected () extends CanvasImmediateRenderer {
  def this(
    context: CanvasRenderingContext2D,
    pixelRatio: Double,
    extent: Extent,
    transform: Transform,
    viewRotation: Double
  ) = this()
}

