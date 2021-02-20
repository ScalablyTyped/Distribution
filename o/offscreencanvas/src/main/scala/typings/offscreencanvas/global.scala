package typings.offscreencanvas

import typings.std.ImageBitmap
import typings.std.ImageBitmapSource
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OffscreenCanvas")
  @js.native
  class OffscreenCanvas protected ()
    extends typings.offscreencanvas.OffscreenCanvas {
    def this(width: Double, height: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OffscreenCanvasRenderingContext2D")
  @js.native
  class OffscreenCanvasRenderingContext2D ()
    extends typings.offscreencanvas.OffscreenCanvasRenderingContext2D
  
  @JSGlobal("createImageBitmap")
  @js.native
  def createImageBitmap(image: typings.offscreencanvas.OffscreenCanvas): js.Promise[ImageBitmap] = js.native
  @JSGlobal("createImageBitmap")
  @js.native
  def createImageBitmap(image: typings.offscreencanvas.OffscreenCanvas, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  // https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#dom-createimagebitmap
  @JSGlobal("createImageBitmap")
  @js.native
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  @JSGlobal("createImageBitmap")
  @js.native
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  
  @JSGlobal("postMessage")
  @js.native
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  @JSGlobal("postMessage")
  @js.native
  def postMessage(
    message: js.Any,
    targetOrigin: String,
    transfer: js.Array[Transferable | typings.offscreencanvas.OffscreenCanvas]
  ): Unit = js.native
}
