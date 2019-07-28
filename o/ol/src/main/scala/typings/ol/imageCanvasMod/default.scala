package typings.ol.imageCanvasMod

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageCanvas", JSImport.Default)
@js.native
class default protected () extends ImageCanvas {
  def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
  def this(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    canvas: HTMLCanvasElement,
    opt_loader: Loader
  ) = this()
}

