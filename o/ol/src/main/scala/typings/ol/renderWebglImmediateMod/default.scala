package typings.ol.renderWebglImmediateMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/Immediate", JSImport.Default)
@js.native
class default protected () extends WebGLImmediateRenderer {
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

