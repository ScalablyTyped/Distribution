package typings.ol

import typings.ol.extentMod.Extent
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("ol/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function that takes an {@link module:ol/Image~ImageWrapper} for the image and a
    * `{string}` for the src as arguments. It is supposed to make it so the
    * underlying image {@link module:ol/Image~ImageWrapper#getImage} is assigned the
    * content specified by the src. If not specified, the default is
    *
    *     function(image, src) {
    *       image.getImage().src = src;
    *     }
    *
    * Providing a custom `imageLoadFunction` can be useful to load images with
    * post requests or - in general - through XHR requests, where the src of the
    * image element would be set to a data URI when the content is loaded.
    *
    * @typedef {function(ImageWrapper, string): void} LoadFunction
    * @api
    */
  @JSImport("ol/Image", JSImport.Default)
  @js.native
  open class default protected () extends ImageWrapper {
    /**
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {number|undefined} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {string} src Image source URI.
      * @param {?string} crossOrigin Cross origin.
      * @param {LoadFunction} imageLoadFunction Image load function.
      * @param {CanvasRenderingContext2D} [context] Canvas context. When provided, the image will be
      *    drawn into the context's canvas, and `getImage()` will return the canvas once the image
      *    has finished loading.
      */
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
  }
  
  inline def listenImage(image: HTMLCanvasElement, loadHandler: js.Function0[Any], errorHandler: js.Function0[Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenImage")(image.asInstanceOf[js.Any], loadHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenImage(image: HTMLImageElement, loadHandler: js.Function0[Any], errorHandler: js.Function0[Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenImage")(image.asInstanceOf[js.Any], loadHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenImage(image: HTMLVideoElement, loadHandler: js.Function0[Any], errorHandler: js.Function0[Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenImage")(image.asInstanceOf[js.Any], loadHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /**
    * A function that takes an {@link module:ol/Image~ImageWrapper} for the image and a
    * `{string}` for the src as arguments. It is supposed to make it so the
    * underlying image {@link module:ol/Image~ImageWrapper#getImage} is assigned the
    * content specified by the src. If not specified, the default is
    *
    *     function(image, src) {
    *       image.getImage().src = src;
    *     }
    *
    * Providing a custom `imageLoadFunction` can be useful to load images with
    * post requests or - in general - through XHR requests, where the src of the
    * image element would be set to a data URI when the content is loaded.
    *
    * @typedef {function(ImageWrapper, string): void} LoadFunction
    * @api
    */
  @js.native
  trait ImageWrapper
    extends typings.ol.imageBaseMod.default {
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var context_ : Any = js.native
    
    /**
      * Tracks loading or read errors.
      *
      * @private
      */
    /* private */ var handleImageError_ : Any = js.native
    
    /**
      * Tracks successful image load.
      *
      * @private
      */
    /* private */ var handleImageLoad_ : Any = js.native
    
    /**
      * @private
      * @type {LoadFunction}
      */
    /* private */ var imageLoadFunction_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @param {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement} image Image.
      */
    def setImage(image: HTMLCanvasElement): Unit = js.native
    def setImage(image: HTMLImageElement): Unit = js.native
    def setImage(image: HTMLVideoElement): Unit = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var src_ : Any = js.native
    
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
  
  type LoadFunction = js.Function2[/* arg0 */ ImageWrapper, /* arg1 */ String, Unit]
}
