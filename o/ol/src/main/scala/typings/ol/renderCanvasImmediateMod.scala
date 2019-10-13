package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/Immediate", JSImport.Namespace)
@js.native
object renderCanvasImmediateMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.renderVectorContextMod.default {
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
  }
  
  type CanvasImmediateRenderer = typings.ol.renderVectorContextMod.default
}

