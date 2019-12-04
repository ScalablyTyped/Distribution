package typings.ol

import typings.ol.colorMod.Color
import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.ol.styleIconImageMod.IconImage
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconImage", JSImport.Namespace)
@js.native
object styleIconImageMod extends js.Object {
  @js.native
  trait IconImage
    extends typings.ol.eventsTargetMod.default {
    def getHitDetectionImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    def getImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    def getImageState(): ImageState = js.native
    def getSize(): Size = js.native
    def getSrc(): js.UndefOr[String] = js.native
    def load(): Unit = js.native
  }
  
  @js.native
  class default protected () extends IconImage {
    def this(
      image: HTMLCanvasElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  def get(
    image: HTMLCanvasElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = js.native
  def get(
    image: HTMLImageElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = js.native
}

