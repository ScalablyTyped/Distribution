package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/LineStringBuilder", JSImport.Namespace)
@js.native
object lineStringBuilderMod extends js.Object {
  
  @js.native
  trait CanvasLineStringBuilder
    extends typings.ol.builderMod.default
  
  @js.native
  class default protected () extends CanvasLineStringBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
}
