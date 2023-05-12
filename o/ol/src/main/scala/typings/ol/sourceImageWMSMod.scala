package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceWmsMod.ServerType
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageWMSMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("./wms.js").ServerType} [serverType] The type of
    * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
    * Only needed if `hidpi` is `true`.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] WMS request parameters.
    * At least a `LAYERS` param is required. `STYLES` is
    * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
    * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1.5] Ratio. `1` means image requests are the size of the map viewport, `2` means
    * twice the width and height of the map viewport, and so on. Must be `1` or
    * higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, requests will be made for these resolutions only.
    * @property {string} [url] WMS service URL.
    */
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source/ImageWMS", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] ImageWMS options.
    */
  open class default () extends ImageWMS {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("./wms.js").ServerType} [serverType] The type of
    * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
    * Only needed if `hidpi` is `true`.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] WMS request parameters.
    * At least a `LAYERS` param is required. `STYLES` is
    * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
    * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1.5] Ratio. `1` means image requests are the size of the map viewport, `2` means
    * twice the width and height of the map viewport, and so on. Must be `1` or
    * higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, requests will be made for these resolutions only.
    * @property {string} [url] WMS service URL.
    */
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @js.native
  trait ImageWMS
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
      * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
      * projection. Return `undefined` if the GetFeatureInfo URL cannot be
      * constructed.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {number} resolution Resolution.
      * @param {import("../proj.js").ProjectionLike} projection Projection.
      * @param {!Object} params GetFeatureInfo params. `INFO_FORMAT` at least should
      *     be provided. If `QUERY_LAYERS` is not provided then the layers specified
      *     in the `LAYERS` parameter will be used. `VERSION` should not be
      *     specified here.
      * @return {string|undefined} GetFeatureInfo URL.
      * @api
      */
    def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: Any): js.UndefOr[String] = js.native
    
    /**
      * Return the image load function of the source.
      * @return {import("../Image.js").LoadFunction} The image load function.
      * @api
      */
    def getImageLoadFunction(): LoadFunction = js.native
    
    /**
      * Return the GetLegendGraphic URL, optionally optimized for the passed
      * resolution and possibly including any passed specific parameters. Returns
      * `undefined` if the GetLegendGraphic URL cannot be constructed.
      *
      * @param {number} [resolution] Resolution. If set to undefined, `SCALE`
      *     will not be calculated and included in URL.
      * @param {Object} [params] GetLegendGraphic params. If `LAYER` is set, the
      *     request is generated for this wms layer, else it will try to use the
      *     configured wms layer. Default `FORMAT` is `image/png`.
      *     `VERSION` should not be specified here.
      * @return {string|undefined} GetLegendGraphic URL.
      * @api
      */
    def getLegendUrl(): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Double): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Double, params: Any): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Unit, params: Any): js.UndefOr[String] = js.native
    
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return {Object} Params.
      * @api
      */
    def getParams(): Any = js.native
    
    /**
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {import("../size.js").Size} size Size.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @param {Object} params Params.
      * @return {string} Request URL.
      * @private
      */
    /* private */ var getRequestUrl_ : Any = js.native
    
    /**
      * Return the URL used for this WMS source.
      * @return {string|undefined} URL.
      * @api
      */
    def getUrl(): js.UndefOr[String] = js.native
    
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
      * @type {import("../size.js").Size}
      */
    /* private */ var imageSize_ : Any = js.native
    
    /**
      * @private
      * @type {import("../Image.js").default}
      */
    /* private */ var image_ : Any = js.native
    
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
      * @private
      * @type {import("./wms.js").ServerType}
      */
    /* private */ var serverType_ : Any = js.native
    
    /**
      * Set the image load function of the source.
      * @param {import("../Image.js").LoadFunction} imageLoadFunction Image load function.
      * @api
      */
    def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
    
    /**
      * Set the URL to use for requests.
      * @param {string|undefined} url URL.
      * @api
      */
    def setUrl(): Unit = js.native
    def setUrl(url: String): Unit = js.native
    
    /**
      * Update the user-provided params.
      * @param {Object} params Params.
      * @api
      */
    def updateParams(params: Any): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var updateV13_ : Any = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var url_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var v13_ : Any = js.native
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
      * WMS request parameters.
      * At least a `LAYERS` param is required. `STYLES` is
      * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
      * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
      */
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Ratio. `1` means image requests are the size of the map viewport, `2` means
      * twice the width and height of the map viewport, and so on. Must be `1` or
      * higher.
      */
    var ratio: js.UndefOr[Double] = js.undefined
    
    /**
      * Resolutions.
      * If specified, requests will be made for these resolutions only.
      */
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The type of
      * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
      * Only needed if `hidpi` is `true`.
      */
    var serverType: js.UndefOr[ServerType] = js.undefined
    
    /**
      * WMS service URL.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
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
      
      inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      inline def setImageLoadFunction(value: (/* arg0 */ ImageWrapper, /* arg1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      
      inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
