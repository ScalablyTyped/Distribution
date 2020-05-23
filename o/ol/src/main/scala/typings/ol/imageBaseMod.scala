package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.imageStateMod.ImageState
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageBase", JSImport.Namespace)
@js.native
object imageBaseMod extends js.Object {
  @js.native
  trait ImageBase
    extends typings.ol.targetMod.default {
    var extent: Extent = js.native
    var resolution: Double = js.native
    var state: ImageState = js.native
    /* protected */ def changed(): Unit = js.native
    def getExtent(): Extent = js.native
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    def getPixelRatio(): Double = js.native
    def getResolution(): Double = js.native
    def getState(): ImageState = js.native
    def load(): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends ImageBase {
    def this(extent: Extent, resolution: js.UndefOr[Double], pixelRatio: Double, state: ImageState) = this()
  }
  
}

