package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/Immediate", JSImport.Namespace)
@js.native
object renderWebglImmediateMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.renderVectorContextMod.default {
    def this(
      context: typings.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      extent: Extent,
      pixelRatio: Double
    ) = this()
  }
  
  type WebGLImmediateRenderer = typings.ol.renderVectorContextMod.default
}

