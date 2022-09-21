package typings.mergeImages

import typings.mergeImages.anon.Opacity
import typings.mergeImages.mergeImagesStrings._empty
import typings.mergeImages.mergeImagesStrings.`use-credentials`
import typings.mergeImages.mergeImagesStrings.anonymous
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @returns A Promise which resolves to a base64 data URI.
    *
    * @example
    * import mergeImages = require('merge-images');
    *
    * mergeImages(['/body.png', '/eyes.png', '/mouth.png'])
    *   .then(b64 => document.querySelector('img').src = b64);
    *   // data:image/png;base64,iVBORw0KGgoAA...
    */
  inline def apply(sources: js.Array[ImageSource]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(sources.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(sources: js.Array[ImageSource], options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("merge-images", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Image = String | Buffer
  
  type ImageSource = Image | Opacity
  
  trait Options extends StObject {
    
    /**
      * `Canvas` implementation to be used to allow usage outside of the browser. e.g Node.js with [node-canvas](https://github.com/Automattic/node-canvas).
      *
      * @default undefined
      *
      * @example
      * import mergeImages = require('merge-images');
      * import { Canvas, Image } from 'canvas';
      *
      * mergeImages(['./body.png', './eyes.png', './mouth.png'], {
      *   Canvas: Canvas,
      *   Image: Image
      * })
      *   .then(b64 => ...);
      *   // data:image/png;base64,iVBORw0KGgoAA...
      */
    var Canvas: js.UndefOr[Any] = js.undefined
    
    /**
      * `Image` implementation to be used to allow usage outside of the browser. e.g Node.js with node-canvas.
      * This should be a valid image source for the node-canvas `Image` rather than a DOM `Image`.
      * Check the [node-canvas](https://github.com/Automattic/node-canvas) docs for more information on valid Image sources.
      *
      * @default undefined
      *
      * @example
      * import mergeImages = require('merge-images');
      * import { Canvas, Image } from 'canvas';
      *
      * mergeImages(['./body.png', './eyes.png', './mouth.png'], {
      *   Canvas: Canvas,
      *   Image: Image
      * })
      *   .then(b64 => ...);
      *   // data:image/png;base64,iVBORw0KGgoAA...
      */
    var Image: js.UndefOr[Any] = js.undefined
    
    /**
      * The `crossOrigin` attribute that `Image` instances should use. e.g `anonymous` to [support CORS-enabled images](https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image).
      *
      * @default undefined
      */
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
    
    /**
      * A DOMString indicating the image format.
      *
      * @default 'image/png'
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * The height in pixels the rendered image should be. Defaults to the height of the tallest source image.
      *
      * @default undefined
      *
      * @example
      * mergeImages(['/body.png', '/eyes.png', '/mouth.png'], {
      *   height: 128,
      * })
      *   .then(b64 => ...);
      *   // data:image/png;base64,iVBORw0KGgoAA...
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * A number between `0` and `1` indicating image quality if the requested format is `'image/jpeg'` or `'image/webp'`.
      *
      * @default 0.92
      */
    var quality: js.UndefOr[Double] = js.undefined
    
    /**
      * The width in pixels the rendered image should be. Defaults to the width of the widest source image.
      *
      * @default undefined
      *
      * @example
      * mergeImages(['/body.png', '/eyes.png', '/mouth.png'], {
      *   width: 128,
      * })
      *   .then(b64 => ...);
      *   // data:image/png;base64,iVBORw0KGgoAA...
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCanvas(value: Any): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "Canvas", js.undefined)
      
      inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImage(value: Any): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
