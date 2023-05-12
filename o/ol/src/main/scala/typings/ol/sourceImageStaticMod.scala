package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageStaticMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {import("../extent.js").Extent} [imageExtent] Extent of the image in map coordinates.
    * This is the [left, bottom, right, top] map coordinates of your image.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {import("../size.js").Size} [imageSize] Size of the image in pixels. Usually the image size is auto-detected, so this
    * only needs to be set if auto-detection fails for some reason.
    * @property {string} url Image URL.
    */
  /**
    * @classdesc
    * A layer source for displaying a single, static image.
    * @api
    */
  @JSImport("ol/source/ImageStatic", JSImport.Default)
  @js.native
  open class default protected () extends Static {
    /**
      * @param {Options} options ImageStatic options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images.  Note that
      * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Extent of the image in map coordinates.
      * This is the [left, bottom, right, top] map coordinates of your image.
      */
    var imageExtent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Optional function to load an image given a URL.
      */
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * Size of the image in pixels. Usually the image size is auto-detected, so this
      * only needs to be set if auto-detection fails for some reason.
      */
    var imageSize: js.UndefOr[Size] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Image URL.
      */
    var url: String
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setImageExtent(value: Extent): Self = StObject.set(x, "imageExtent", value.asInstanceOf[js.Any])
      
      inline def setImageExtentUndefined: Self = StObject.set(x, "imageExtent", js.undefined)
      
      inline def setImageExtentVarargs(value: Double*): Self = StObject.set(x, "imageExtent", js.Array(value*))
      
      inline def setImageLoadFunction(value: (/* arg0 */ ImageWrapper, /* arg1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setImageSizeVarargs(value: Double*): Self = StObject.set(x, "imageSize", js.Array(value*))
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {import("../extent.js").Extent} [imageExtent] Extent of the image in map coordinates.
    * This is the [left, bottom, right, top] map coordinates of your image.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {import("../size.js").Size} [imageSize] Size of the image in pixels. Usually the image size is auto-detected, so this
    * only needs to be set if auto-detection fails for some reason.
    * @property {string} url Image URL.
    */
  /**
    * @classdesc
    * A layer source for displaying a single, static image.
    * @api
    */
  @js.native
  trait Static
    extends typings.ol.sourceImageMod.default {
    
    /**
      * Returns the image extent
      * @return {import("../extent.js").Extent} image extent.
      * @api
      */
    def getImageExtent(): Extent = js.native
    
    /**
      * Return the URL used for this image source.
      * @return {string} URL.
      * @api
      */
    def getUrl(): String = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var imageExtent_ : Any = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size|null}
      */
    /* private */ var imageSize_ : Any = js.native
    
    /**
      * @private
      * @type {import("../Image.js").default}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var url_ : Any = js.native
  }
}
