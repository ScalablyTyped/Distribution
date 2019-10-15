package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.imageCanvasMod.ImageCanvas
import typings.ol.imageCanvasMod.Loader
import typings.std.Error
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageCanvas", JSImport.Namespace)
@js.native
object imageCanvasMod extends js.Object {
  @js.native
  trait ImageCanvas
    extends typings.ol.imageBaseMod.default {
    def getError(): Error = js.native
  }
  
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
  
  type Loader = js.Function1[/* p0 */ js.Function1[/* p0 */ js.UndefOr[Error], Unit], Unit]
}

