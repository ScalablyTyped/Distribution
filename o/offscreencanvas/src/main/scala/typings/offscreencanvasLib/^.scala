package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def createImageBitmap(image: OffscreenCanvas): js.Promise[stdLib.ImageBitmap] = js.native
  def createImageBitmap(image: OffscreenCanvas, sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): js.Promise[stdLib.ImageBitmap] = js.native
  // https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#dom-createimagebitmap
  def createImageBitmap(image: stdLib.ImageBitmapSource): js.Promise[stdLib.ImageBitmap] = js.native
  def createImageBitmap(
    image: stdLib.ImageBitmapSource,
    sx: scala.Double,
    sy: scala.Double,
    sw: scala.Double,
    sh: scala.Double
  ): js.Promise[stdLib.ImageBitmap] = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  def postMessage(
    message: js.Any,
    targetOrigin: java.lang.String,
    transfer: js.Array[stdLib.Transferable | OffscreenCanvas]
  ): scala.Unit = js.native
}

