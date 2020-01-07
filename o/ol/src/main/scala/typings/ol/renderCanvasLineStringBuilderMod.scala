package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/LineStringBuilder", JSImport.Namespace)
@js.native
object renderCanvasLineStringBuilderMod extends js.Object {
  @js.native
  trait CanvasLineStringBuilder
    extends typings.ol.renderCanvasBuilderMod.default {
    def applyStroke(): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasLineStringBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
}

