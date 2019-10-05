package typings.offscreencanvas

import typings.std.ImageBitmap
import typings.std.ImageBitmapSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createImageBitmap")
@js.native
object createImageBitmap extends js.Object {
  def apply(image: OffscreenCanvas): js.Promise[ImageBitmap] = js.native
  def apply(image: OffscreenCanvas, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  // https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#dom-createimagebitmap
  def apply(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def apply(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
}

