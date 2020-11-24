package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/PolygonBuilder", JSImport.Namespace)
@js.native
object polygonBuilderMod extends js.Object {
  
  @js.native
  trait CanvasPolygonBuilder
    extends typings.ol.builderMod.default
  
  @js.native
  class default protected () extends CanvasPolygonBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
}
