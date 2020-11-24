package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/ImageBuilder", JSImport.Namespace)
@js.native
object imageBuilderMod extends js.Object {
  
  @js.native
  trait CanvasImageBuilder
    extends typings.ol.builderMod.default
  
  @js.native
  class default protected () extends CanvasImageBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
}
