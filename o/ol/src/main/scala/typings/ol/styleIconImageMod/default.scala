package typings.ol.styleIconImageMod

import typings.ol.colorMod.Color
import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconImage", JSImport.Default)
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

