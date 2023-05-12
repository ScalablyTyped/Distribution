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
       with ISystem[Null, Null]
       with IExtract {
    /**
      * @param renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
    
    /* private */ var _rawPixels: Any = js.native
    
    /** Destroys the extract. */
    @JSName("destroy")
    def destroy_MExtract(): Unit = js.native
    
    /* private */ var renderer: Any = js.native
  }
  /* static members */
  object Extract {
    
    @JSImport("@pixi/extract/lib/Extract", "Extract")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/extract/lib/Extract", "Extract._flipY")
    @js.native
    def _flipY: Any = js.native
    inline def _flipY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_flipY")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/extract/lib/Extract", "Extract._unpremultiplyAlpha")
    @js.native
    def _unpremultiplyAlpha: Any = js.native
    inline def _unpremultiplyAlpha_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_unpremultiplyAlpha")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/extract/lib/Extract", "Extract.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @js.native
  trait IExtract extends StObject {
    
    def base64(): js.Promise[String] = js.native
    def base64(target: Unit, format: String): js.Promise[String] = js.native
    def base64(target: Unit, format: String, quality: Double): js.Promise[String] = js.native
    def base64(target: Unit, format: Unit, quality: Double): js.Promise[String] = js.native
    def base64(target: RenderTexture): js.Promise[String] = js.native
    def base64(target: RenderTexture, format: String): js.Promise[String] = js.native
    def base64(target: RenderTexture, format: String, quality: Double): js.Promise[String] = js.native
    def base64(target: RenderTexture, format: Unit, quality: Double): js.Promise[String] = js.native
    def base64(target: DisplayObject): js.Promise[String] = js.native
    def base64(target: DisplayObject, format: String): js.Promise[String] = js.native
    def base64(target: DisplayObject, format: String, quality: Double): js.Promise[String] = js.native
    def base64(target: DisplayObject, format: Unit, quality: Double): js.Promise[String] = js.native
    
    def canvas(): ICanvas = js.native
    def canvas(target: Unit, frame: Rectangle): ICanvas = js.native
    def canvas(target: RenderTexture): ICanvas = js.native
    def canvas(target: RenderTexture, frame: Rectangle): ICanvas = js.native
    def canvas(target: DisplayObject): ICanvas = js.native
    def canvas(target: DisplayObject, frame: Rectangle): ICanvas = js.native
    
    def image(): js.Promise[HTMLImageElement] = js.native
    def image(target: Unit, format: String): js.Promise[HTMLImageElement] = js.native
    def image(target: Unit, format: String, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: Unit, format: Unit, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture, format: String): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture, format: String, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: RenderTexture, format: Unit, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject, format: String): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject, format: String, quality: Double): js.Promise[HTMLImageElement] = js.native
    def image(target: DisplayObject, format: Unit, quality: Double): js.Promise[HTMLImageElement] = js.native
    
    def pixels(): js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray = js.native
    def pixels(target: Unit, frame: Rectangle): js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray = js.native
    def pixels(target: RenderTexture): js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray = js.native
    def pixels(target: RenderTexture, frame: Rectangle): js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray = js.native
    def pixels(target: DisplayObject): js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray = js.native
    def pixels(target: DisplayObject, frame: Rectangle): js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray = js.native
  }
}
