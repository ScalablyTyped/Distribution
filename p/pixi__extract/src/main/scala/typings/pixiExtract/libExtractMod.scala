package typings.pixiExtract

import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.mod.Rectangle
import typings.pixiCore.mod.RenderTexture
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.mod.DisplayObject
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtractMod {
  
  @JSImport("@pixi/extract/lib/Extract", "Extract")
  @js.native
  open class Extract protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
    
    def base64(target: RenderTexture): js.Promise[String] = js.native
    def base64(target: RenderTexture, format: String): js.Promise[String] = js.native
    def base64(target: RenderTexture, format: String, quality: Double): js.Promise[String] = js.native
    def base64(target: RenderTexture, format: Unit, quality: Double): js.Promise[String] = js.native
    /**
      * Will return a base64 encoded string of this target. It works by calling
      *  `Extract.getCanvas` and then running toDataURL on that.
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param format - Image format, e.g. "image/jpeg" or "image/webp".
      * @param quality - JPEG or Webp compression from 0 to 1. Default is 0.92.
      * @returns - A base64 encoded string of the texture.
      */
    def base64(target: DisplayObject): js.Promise[String] = js.native
    def base64(target: DisplayObject, format: String): js.Promise[String] = js.native
    def base64(target: DisplayObject, format: String, quality: Double): js.Promise[String] = js.native
    def base64(target: DisplayObject, format: Unit, quality: Double): js.Promise[String] = js.native
    
    def canvas(target: RenderTexture): ICanvas = js.native
    def canvas(target: RenderTexture, frame: Rectangle): ICanvas = js.native
    /**
      * Creates a Canvas element, renders this target to it and then returns it.
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param frame - The frame the extraction is restricted to.
      * @returns - A Canvas element with the texture rendered on.
      */
    def canvas(target: DisplayObject): ICanvas = js.native
    def canvas(target: DisplayObject, frame: Rectangle): ICanvas = js.native
    
    /** Destroys the extract. */
    @JSName("destroy")
    def destroy_MExtract(): Unit = js.native
    
    def image(target: RenderTexture): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture, format: String): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture, format: String, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture, format: Unit, quality: Double): js.Promise[HTMLImageElement] = js.native
    /**
      * Will return a HTML Image of the target
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param format - Image format, e.g. "image/jpeg" or "image/webp".
      * @param quality - JPEG or Webp compression from 0 to 1. Default is 0.92.
      * @returns - HTML Image of the target
      */
    def image(target: DisplayObject): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject, format: String): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject, format: String, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject, format: Unit, quality: Double): js.Promise[HTMLImageElement] = js.native
    
    /**
      * Will return a one-dimensional array containing the pixel data of the entire texture in RGBA
      * order, with integer values between 0 and 255 (included).
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param frame - The frame the extraction is restricted to.
      * @returns - One-dimensional array containing the pixel data of the entire texture
      */
    def pixels(): js.typedarray.Uint8Array = js.native
    def pixels(target: Unit, frame: Rectangle): js.typedarray.Uint8Array = js.native
    def pixels(target: RenderTexture): js.typedarray.Uint8Array = js.native
    def pixels(target: RenderTexture, frame: Rectangle): js.typedarray.Uint8Array = js.native
    def pixels(target: DisplayObject): js.typedarray.Uint8Array = js.native
    def pixels(target: DisplayObject, frame: Rectangle): js.typedarray.Uint8Array = js.native
    
    /* private */ var renderer: Any = js.native
  }
  /* static members */
  object Extract {
    
    @JSImport("@pixi/extract/lib/Extract", "Extract")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes premultiplied pixel data and produces regular pixel data
      * @private
      * @param pixels - array of pixel data
      * @param out - output array
      */
    inline def arrayPostDivide(pixels: js.Array[Double], out: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.Array[Double], out: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.Array[Double], out: js.typedarray.Uint8ClampedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.typedarray.Uint8Array, out: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.typedarray.Uint8Array, out: js.typedarray.Uint8ClampedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.typedarray.Uint8ClampedArray, out: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.typedarray.Uint8ClampedArray, out: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayPostDivide(pixels: js.typedarray.Uint8ClampedArray, out: js.typedarray.Uint8ClampedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** @ignore */
    @JSImport("@pixi/extract/lib/Extract", "Extract.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
