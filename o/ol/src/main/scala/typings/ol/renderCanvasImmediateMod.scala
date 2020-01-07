package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.projMod.TransformFunction
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/Immediate", JSImport.Namespace)
@js.native
object renderCanvasImmediateMod extends js.Object {
  @js.native
  trait CanvasImmediateRenderer
    extends typings.ol.renderVectorContextMod.default {
    def setTransform(transform: Transform): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasImmediateRenderer {
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double,
      opt_userTransform: TransformFunction
    ) = this()
  }
  
}

