package typings.offscreencanvas

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.ImageBitmap
import typings.std.ImageBitmapSource
import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class OffscreenCanvas protected ()
    extends typings.offscreencanvas.OffscreenCanvas {
    def this(width: Double, height: Double) = this()
  }
  
  @js.native
  class OffscreenCanvasRenderingContext2D ()
    extends typings.offscreencanvas.OffscreenCanvasRenderingContext2D
  
  def createImageBitmap(image: typings.offscreencanvas.OffscreenCanvas): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: typings.offscreencanvas.OffscreenCanvas, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  // https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#dom-createimagebitmap
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  def postMessage(
    message: js.Any,
    targetOrigin: String,
    transfer: js.Array[Transferable | typings.offscreencanvas.OffscreenCanvas]
  ): Unit = js.native
  @js.native
  object OffscreenCanvas
    extends Instantiable2[/* width */ Double, /* height */ Double, typings.offscreencanvas.OffscreenCanvas]
  
  @js.native
  object OffscreenCanvasRenderingContext2D
    extends Instantiable0[typings.offscreencanvas.OffscreenCanvasRenderingContext2D]
  
}

