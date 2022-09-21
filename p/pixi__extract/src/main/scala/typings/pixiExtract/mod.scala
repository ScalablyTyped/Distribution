package typings.pixiExtract

import typings.pixiCore.mod.IRendererPlugin
import typings.pixiCore.mod.RenderTexture
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.mod.DisplayObject
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This class provides renderer-specific plugins for exporting content from a renderer.
    * For instance, these plugins can be used for saving an Image, Canvas element or for exporting the raw image data (pixels).
    *
    * Do not instantiate these plugins directly. It is available from the `renderer.plugins` property.
    * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
    * @example
    * // Create a new app (will auto-add extract plugin to renderer)
    * const app = new PIXI.Application();
    *
    * // Draw a red circle
    * const graphics = new PIXI.Graphics()
    *     .beginFill(0xFF0000)
    *     .drawCircle(0, 0, 50);
    *
    * // Render the graphics as an HTMLImageElement
    * const image = app.renderer.plugins.extract.image(graphics);
    * document.body.appendChild(image);
    * @memberof PIXI
    */
  @JSImport("@pixi/extract", "Extract")
  @js.native
  open class Extract protected ()
    extends StObject
       with Extract2 {
    /**
      * @param renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  object Extract {
    
    @JSImport("@pixi/extract", "Extract")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes premultiplied pixel data and produces regular pixel data
      * @private
      * @param pixels - array of pixel data
      * @param out - output array
      */
    /* static member */
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
    /* static member */
    @JSImport("@pixi/extract", "Extract.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  /**
    * This class provides renderer-specific plugins for exporting content from a renderer.
    * For instance, these plugins can be used for saving an Image, Canvas element or for exporting the raw image data (pixels).
    *
    * Do not instantiate these plugins directly. It is available from the `renderer.plugins` property.
    * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
    * @example
    * // Create a new app (will auto-add extract plugin to renderer)
    * const app = new PIXI.Application();
    *
    * // Draw a red circle
    * const graphics = new PIXI.Graphics()
    *     .beginFill(0xFF0000)
    *     .drawCircle(0, 0, 50);
    *
    * // Render the graphics as an HTMLImageElement
    * const image = app.renderer.plugins.extract.image(graphics);
    * document.body.appendChild(image);
    * @memberof PIXI
    */
  @js.native
  trait Extract2
    extends StObject
       with IRendererPlugin {
    
    def base64(target: RenderTexture): String = js.native
    def base64(target: RenderTexture, format: String): String = js.native
    def base64(target: RenderTexture, format: String, quality: Double): String = js.native
    def base64(target: RenderTexture, format: Unit, quality: Double): String = js.native
    /**
      * Will return a base64 encoded string of this target. It works by calling
      *  `Extract.getCanvas` and then running toDataURL on that.
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param format - Image format, e.g. "image/jpeg" or "image/webp".
      * @param quality - JPEG or Webp compression from 0 to 1. Default is 0.92.
      * @returns - A base64 encoded string of the texture.
      */
    def base64(target: DisplayObject): String = js.native
    def base64(target: DisplayObject, format: String): String = js.native
    def base64(target: DisplayObject, format: String, quality: Double): String = js.native
    def base64(target: DisplayObject, format: Unit, quality: Double): String = js.native
    
    def canvas(target: RenderTexture): HTMLCanvasElement = js.native
    def canvas(target: RenderTexture, frame: Rectangle): HTMLCanvasElement = js.native
    /**
      * Creates a Canvas element, renders this target to it and then returns it.
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param frame - The frame the extraction is restricted to.
      * @returns - A Canvas element with the texture rendered on.
      */
    def canvas(target: DisplayObject): HTMLCanvasElement = js.native
    def canvas(target: DisplayObject, frame: Rectangle): HTMLCanvasElement = js.native
    
    def image(target: RenderTexture): HTMLImageElement = js.native
    def image(target: RenderTexture, format: String): HTMLImageElement = js.native
    def image(target: RenderTexture, format: String, quality: Double): HTMLImageElement = js.native
    def image(target: RenderTexture, format: Unit, quality: Double): HTMLImageElement = js.native
    /**
      * Will return a HTML Image of the target
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param format - Image format, e.g. "image/jpeg" or "image/webp".
      * @param quality - JPEG or Webp compression from 0 to 1. Default is 0.92.
      * @returns - HTML Image of the target
      */
    def image(target: DisplayObject): HTMLImageElement = js.native
    def image(target: DisplayObject, format: String): HTMLImageElement = js.native
    def image(target: DisplayObject, format: String, quality: Double): HTMLImageElement = js.native
    def image(target: DisplayObject, format: Unit, quality: Double): HTMLImageElement = js.native
    
    /**
      * Will return a one-dimensional array containing the pixel data of the entire texture in RGBA
      * order, with integer values between 0 and 255 (included).
      * @param target - A displayObject or renderTexture
      *  to convert. If left empty will use the main renderer
      * @param frame - The frame the extraction is restricted to.
      * @returns - One-dimensional array containing the pixel data of the entire texture
      */
    def pixels(): js.typedarray.Uint8Array = js.native
    def pixels(target: Unit, frame: PixelExtractOptions): js.typedarray.Uint8Array = js.native
    def pixels(target: Unit, frame: Rectangle): js.typedarray.Uint8Array = js.native
    def pixels(target: RenderTexture): js.typedarray.Uint8Array = js.native
    def pixels(target: RenderTexture, frame: PixelExtractOptions): js.typedarray.Uint8Array = js.native
    def pixels(target: RenderTexture, frame: Rectangle): js.typedarray.Uint8Array = js.native
    def pixels(target: DisplayObject): js.typedarray.Uint8Array = js.native
    def pixels(target: DisplayObject, frame: PixelExtractOptions): js.typedarray.Uint8Array = js.native
    def pixels(target: DisplayObject, frame: Rectangle): js.typedarray.Uint8Array = js.native
    
    /* private */ var renderer: Any = js.native
  }
  
  trait PixelExtractOptions extends StObject {
    
    var height: Double
    
    var resolution: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object PixelExtractOptions {
    
    inline def apply(height: Double, resolution: Double, width: Double, x: Double, y: Double): PixelExtractOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelExtractOptions]
    }
    
    extension [Self <: PixelExtractOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
