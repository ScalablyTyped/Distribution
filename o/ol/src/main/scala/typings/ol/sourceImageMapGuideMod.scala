package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageMapGuideMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [url] The mapagent url.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {number} [displayDpi=96] The display resolution.
    * @property {number} [metersPerUnit=1] The meters-per-unit value.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {boolean} [useOverlay] If `true`, will use `GETDYNAMICMAPOVERLAYIMAGE`.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1] Ratio. `1` means image requests are the size of the map viewport, `2` means
    * twice the width and height of the map viewport, and so on. Must be `1` or higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, requests will be made for these resolutions only.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object} [params] Additional parameters.
    */
  /**
    * @classdesc
    * Source for images from Mapguide servers
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source/ImageMapGuide", JSImport.Default)
  @js.native
  open class default protected () extends ImageMapGuide {
    /**
      * @param {Options} options ImageMapGuide options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [url] The mapagent url.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {number} [displayDpi=96] The display resolution.
    * @property {number} [metersPerUnit=1] The meters-per-unit value.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {boolean} [useOverlay] If `true`, will use `GETDYNAMICMAPOVERLAYIMAGE`.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1] Ratio. `1` means image requests are the size of the map viewport, `2` means
    * twice the width and height of the map viewport, and so on. Must be `1` or higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, requests will be made for these resolutions only.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object} [params] Additional parameters.
    */
  /**
    * @classdesc
    * Source for images from Mapguide servers
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @js.native
  trait ImageMapGuide
    extends typings.ol.sourceImageMod.default {
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var context_ : Any = js.native
    
    /**
      * @private
      * @type {?string}
      */
    /* private */ var crossOrigin_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var displayDpi_ : Any = js.native
    
    /**
      * Return the image load function of the source.
      * @return {import("../Image.js").LoadFunction} The image load function.
      * @api
      */
    def getImageLoadFunction(): LoadFunction = js.native
    
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return {Object} Params.
      * @api
      */
    def getParams(): Any = js.native
    
    /**
      * @param {string} baseUrl The mapagent url.
      * @param {Object<string, string|number>} params Request parameters.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {import("../size.js").Size} size Size.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {string} The mapagent map image request URL.
      */
    def getUrl(
      baseUrl: String,
      params: StringDictionary[String | Double],
      extent: Extent,
      size: Size,
      projection: typings.ol.projProjectionMod.default
    ): String = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var hidpi_ : Any = js.native
    
    /**
      * @private
      * @type {import("../Image.js").LoadFunction}
      */
    /* private */ var imageLoadFunction_ : Any = js.native
    
    /**
      * @private
      * @type {import("../Image.js").default}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var metersPerUnit_ : Any = js.native
    
    /**
      * @private
      * @type {!Object}
      */
    /* private */ var params_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var ratio_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedRevision_ : Any = js.native
    
    /**
      * Set the image load function of the MapGuide source.
      * @param {import("../Image.js").LoadFunction} imageLoadFunction Image load function.
      * @api
      */
    def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
    
    /**
      * Update the user-provided params.
      * @param {Object} params Params.
      * @api
      */
    def updateParams(params: Any): Unit = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var url_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var useOverlay_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The `crossOrigin` attribute for loaded images.  Note that
      * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The display resolution.
      */
    var displayDpi: js.UndefOr[Double] = js.undefined
    
    /**
      * Use the `ol/Map#pixelRatio` value when requesting
      * the image from the remote server.
      */
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional function to load an image given a URL.
      */
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The meters-per-unit value.
      */
    var metersPerUnit: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional parameters.
      */
    var params: js.UndefOr[Any] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Ratio. `1` means image requests are the size of the map viewport, `2` means
      * twice the width and height of the map viewport, and so on. Must be `1` or higher.
      */
    var ratio: js.UndefOr[Double] = js.undefined
    
    /**
      * Resolutions.
      * If specified, requests will be made for these resolutions only.
      */
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The mapagent url.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, will use `GETDYNAMICMAPOVERLAYIMAGE`.
      */
    var useOverlay: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDisplayDpi(value: Double): Self = StObject.set(x, "displayDpi", value.asInstanceOf[js.Any])
      
      inline def setDisplayDpiUndefined: Self = StObject.set(x, "displayDpi", js.undefined)
      
      inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      inline def setImageLoadFunction(value: (/* arg0 */ ImageWrapper, /* arg1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
      
      inline def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseOverlay(value: Boolean): Self = StObject.set(x, "useOverlay", value.asInstanceOf[js.Any])
      
      inline def setUseOverlayUndefined: Self = StObject.set(x, "useOverlay", js.undefined)
    }
  }
}
