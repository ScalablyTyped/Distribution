package typings.offscreencanvas

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.CanvasDirection
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.ImageBitmap
import typings.std.ImageBitmapSource
import typings.std.ImageSmoothingQuality
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
    extends typings.offscreencanvas.OffscreenCanvasRenderingContext2D {
    /* CompleteClass */
    override var direction: CanvasDirection = js.native
    /* CompleteClass */
    override var filter: String = js.native
    /* CompleteClass */
    override var font: String = js.native
    /* CompleteClass */
    override var globalAlpha: Double = js.native
    /* CompleteClass */
    override var globalCompositeOperation: String = js.native
    /* CompleteClass */
    override var imageSmoothingEnabled: Boolean = js.native
    /* CompleteClass */
    override var imageSmoothingQuality: ImageSmoothingQuality = js.native
    /* CompleteClass */
    override var shadowBlur: Double = js.native
    /* CompleteClass */
    override var shadowColor: String = js.native
    /* CompleteClass */
    override var shadowOffsetX: Double = js.native
    /* CompleteClass */
    override var shadowOffsetY: Double = js.native
    /* CompleteClass */
    override var textAlign: CanvasTextAlign = js.native
    /* CompleteClass */
    override var textBaseline: CanvasTextBaseline = js.native
    /* CompleteClass */
    override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    /* CompleteClass */
    override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    /* CompleteClass */
    override def restore(): Unit = js.native
    /* CompleteClass */
    override def save(): Unit = js.native
    /* CompleteClass */
    override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  }
  
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

