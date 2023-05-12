package typings.ol

import typings.ol.colorMod.Color
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconImageMod {
  
  @JSImport("ol/style/IconImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/IconImage", JSImport.Default)
  @js.native
  open class default protected () extends IconImage {
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: Any,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: Null,
      imageState: Any,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: Any,
      color: Color
    ) = this()
    def this(image: HTMLCanvasElement, src: Unit, size: Size, crossOrigin: Null, imageState: Any, color: Color) = this()
    /**
      * @param {HTMLImageElement|HTMLCanvasElement} image Image.
      * @param {string|undefined} src Src.
      * @param {import("../size.js").Size} size Size.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("../ImageState.js").default} imageState Image state.
      * @param {import("../color.js").Color} color Color.
      */
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: Any,
      color: Color
    ) = this()
    def this(image: HTMLImageElement, src: String, size: Size, crossOrigin: Null, imageState: Any, color: Color) = this()
    def this(image: HTMLImageElement, src: Unit, size: Size, crossOrigin: String, imageState: Any, color: Color) = this()
    def this(image: HTMLImageElement, src: Unit, size: Size, crossOrigin: Null, imageState: Any, color: Color) = this()
  }
  
  inline def get(
    image: HTMLCanvasElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: Any,
    color: Color
  ): IconImage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any], size.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], imageState.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IconImage]
  inline def get(
    image: HTMLCanvasElement,
    src: String,
    size: Size,
    crossOrigin: Null,
    imageState: Any,
    color: Color
  ): IconImage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any], size.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], imageState.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IconImage]
  inline def get(
    image: HTMLImageElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: Any,
    color: Color
  ): IconImage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any], size.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], imageState.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IconImage]
  inline def get(image: HTMLImageElement, src: String, size: Size, crossOrigin: Null, imageState: Any, color: Color): IconImage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any], size.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], imageState.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IconImage]
  
  @js.native
  trait IconImage
    extends typings.ol.eventsTargetMod.default {
    
    /**
      * @private
      * @type {Object<number, HTMLCanvasElement>}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * @private
      * @type {import("../color.js").Color}
      */
    /* private */ var color_ : Any = js.native
    
    /**
      * @private
      * @type {string|null}
      */
    /* private */ var crossOrigin_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var dispatchChangeEvent_ : Any = js.native
    
    /**
      * @return {HTMLImageElement|HTMLCanvasElement} Image element.
      */
    def getHitDetectionImage(): HTMLImageElement | HTMLCanvasElement = js.native
    
    /**
      * @param {number} pixelRatio Pixel ratio.
      * @return {HTMLImageElement|HTMLCanvasElement} Image or Canvas element.
      */
    def getImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    
    /**
      * @return {import("../ImageState.js").default} Image state.
      */
    def getImageState(): Any = js.native
    
    /**
      * @param {number} pixelRatio Pixel ratio.
      * @return {number} Image or Canvas element.
      */
    def getPixelRatio(pixelRatio: Double): Double = js.native
    
    /**
      * Get the size of the icon (in pixels).
      * @return {import("../size.js").Size} Image size.
      */
    def getSize(): Size = js.native
    
    /**
      * @return {string|undefined} Image src.
      */
    def getSrc(): js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    /* private */ var handleImageError_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleImageLoad_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLImageElement|HTMLCanvasElement}
      */
    /* private */ var hitDetectionImage_ : Any = js.native
    
    /**
      * @private
      * @type {import("../ImageState.js").default}
      */
    /* private */ var imageState_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLImageElement|HTMLCanvasElement}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var initializeImage_ : Any = js.native
    
    /**
      * @private
      * @return {boolean} The image canvas is tainted.
      */
    /* private */ var isTainted_ : Any = js.native
    
    /**
      * Load not yet loaded URI.
      */
    def load(): Unit = js.native
    
    /**
      * @param {number} pixelRatio Pixel ratio.
      * @private
      */
    /* private */ var replaceColor_ : Any = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size}
      */
    /* private */ var size_ : Any = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var src_ : Any = js.native
    
    var tainted_ : js.UndefOr[Boolean] = js.native
    
    /**
      * Discards event handlers which listen for load completion or errors.
      *
      * @private
      */
    /* private */ var unlistenImage_ : Any = js.native
    
    /**
      * @private
      * @type {?function():void}
      */
    /* private */ var unlisten_ : Any = js.native
  }
}
