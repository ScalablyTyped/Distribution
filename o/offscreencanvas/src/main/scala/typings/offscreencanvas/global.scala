package typings.offscreencanvas

import typings.std.CanvasDirection
import typings.std.CanvasFontKerning
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.GlobalCompositeOperation
import typings.std.ImageBitmap
import typings.std.ImageBitmapSource
import typings.std.ImageSmoothingQuality
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OffscreenCanvas")
  @js.native
  open class OffscreenCanvas protected ()
    extends StObject
       with typings.offscreencanvas.OffscreenCanvas {
    def this(width: Double, height: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OffscreenCanvasRenderingContext2D")
  @js.native
  open class OffscreenCanvasRenderingContext2D ()
    extends StObject
       with typings.offscreencanvas.OffscreenCanvasRenderingContext2D {
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clearRect) */
    /* standard dom */
    /* CompleteClass */
    override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/direction) */
    /* standard dom */
    /* CompleteClass */
    var direction: CanvasDirection = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillRect) */
    /* standard dom */
    /* CompleteClass */
    override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/filter) */
    /* standard dom */
    /* CompleteClass */
    var filter: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/font) */
    /* standard dom */
    /* CompleteClass */
    var font: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontKerning) */
    /* standard dom */
    /* CompleteClass */
    var fontKerning: CanvasFontKerning = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalAlpha) */
    /* standard dom */
    /* CompleteClass */
    var globalAlpha: Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation) */
    /* standard dom */
    /* CompleteClass */
    var globalCompositeOperation: GlobalCompositeOperation = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingEnabled) */
    /* standard dom */
    /* CompleteClass */
    var imageSmoothingEnabled: Boolean = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingQuality) */
    /* standard dom */
    /* CompleteClass */
    var imageSmoothingQuality: ImageSmoothingQuality = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/restore) */
    /* standard dom */
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/save) */
    /* standard dom */
    /* CompleteClass */
    override def save(): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowBlur) */
    /* standard dom */
    /* CompleteClass */
    var shadowBlur: Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowColor) */
    /* standard dom */
    /* CompleteClass */
    var shadowColor: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX) */
    /* standard dom */
    /* CompleteClass */
    var shadowOffsetX: Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY) */
    /* standard dom */
    /* CompleteClass */
    var shadowOffsetY: Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeRect) */
    /* standard dom */
    /* CompleteClass */
    override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textAlign) */
    /* standard dom */
    /* CompleteClass */
    var textAlign: CanvasTextAlign = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textBaseline) */
    /* standard dom */
    /* CompleteClass */
    var textBaseline: CanvasTextBaseline = js.native
  }
  
  inline def createImageBitmap(image: typings.offscreencanvas.OffscreenCanvas): js.Promise[ImageBitmap] = js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(image: typings.offscreencanvas.OffscreenCanvas, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  // https://html.spec.whatwg.org/multipage/imagebitmap-and-animations.html#dom-createimagebitmap
  inline def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  
  inline def postMessage(message: Any, targetOrigin: String): Unit = (js.Dynamic.global.applyDynamic("postMessage")(message.asInstanceOf[js.Any], targetOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postMessage(
    message: Any,
    targetOrigin: String,
    transfer: js.Array[Transferable | typings.offscreencanvas.OffscreenCanvas]
  ): Unit = (js.Dynamic.global.applyDynamic("postMessage")(message.asInstanceOf[js.Any], targetOrigin.asInstanceOf[js.Any], transfer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
