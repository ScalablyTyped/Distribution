package typings.ol.styleMod

import typings.ol.colorMod.Color
import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.ol.styleIconImageMod.default
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style", "IconImage")
@js.native
class IconImage protected () extends default {
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
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ) = this()
}

