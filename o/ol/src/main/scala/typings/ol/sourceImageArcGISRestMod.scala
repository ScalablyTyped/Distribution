package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageArcGISRestMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting the image from
    * the remote server.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given
    * a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] ArcGIS Rest parameters. This field is optional. Service
    * defaults will be used for any fields not specified. `FORMAT` is `PNG32` by default. `F` is
    * `IMAGE` by default. `TRANSPARENT` is `true` by default.  `BBOX`, `SIZE`, `BBOXSR`, and `IMAGESR`
    * will be set dynamically. Set `LAYERS` to override the default service layer visibility. See
    * https://developers.arcgis.com/rest/services-reference/export-map.htm
    * for further reference.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * The projection code must contain a numeric end portion separated by :
    * or the entire code must form a valid ArcGIS SpatialReference definition.
    * @property {number} [ratio=1.5] Ratio. `1` means image requests are the size of the map viewport,
    * `2` means twice the size of the map viewport, and so on.
    * @property {Array<number>} [resolutions] Resolutions. If specified, requests will be made for
    * these resolutions only.
    * @property {string} [url] ArcGIS Rest service URL for a Map Service or Image Service. The url
    * should include /MapServer or /ImageServer.
    */
  /**
    * @classdesc
    * Source for data from ArcGIS Rest services providing single, untiled images.
    * Useful when underlying map service has labels.
    *
    * If underlying map service is not using labels,
    * take advantage of ol image caching and use
    * {@link module:ol/source/TileArcGISRest~TileArcGISRest} data source.
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source/ImageArcGISRest", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Image ArcGIS Rest Options.
    */
  open class default () extends ImageArcGISRest {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting the image from
    * the remote server.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given
    * a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] ArcGIS Rest parameters. This field is optional. Service
    * defaults will be used for any fields not specified. `FORMAT` is `PNG32` by default. `F` is
    * `IMAGE` by default. `TRANSPARENT` is `true` by default.  `BBOX`, `SIZE`, `BBOXSR`, and `IMAGESR`
    * will be set dynamically. Set `LAYERS` to override the default service layer visibility. See
    * https://developers.arcgis.com/rest/services-reference/export-map.htm
    * for further reference.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * The projection code must contain a numeric end portion separated by :
    * or the entire code must form a valid ArcGIS SpatialReference definition.
    * @property {number} [ratio=1.5] Ratio. `1` means image requests are the size of the map viewport,
    * `2` means twice the size of the map viewport, and so on.
    * @property {Array<number>} [resolutions] Resolutions. If specified, requests will be made for
    * these resolutions only.
    * @property {string} [url] ArcGIS Rest service URL for a Map Service or Image Service. The url
    * should include /MapServer or /ImageServer.
    */
  /**
    * @classdesc
    * Source for data from ArcGIS Rest services providing single, untiled images.
    * Useful when underlying map service has labels.
    *
    * If underlying map service is not using labels,
    * take advantage of ol image caching and use
    * {@link module:ol/source/TileArcGISRest~TileArcGISRest} data source.
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @js.native
  trait ImageArcGISRest
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
      * Return the URL used for this ArcGIS source.
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
      * @type {string|undefined}
      */
    /* private */ var url_ : Any = js.native
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
      * Use the `ol/Map#pixelRatio` value when requesting the image from
      * the remote server.
      */
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional function to load an image given
      * a URL.
      */
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ArcGIS Rest parameters. This field is optional. Service
      * defaults will be used for any fields not specified. `FORMAT` is `PNG32` by default. `F` is
      * `IMAGE` by default. `TRANSPARENT` is `true` by default.  `BBOX`, `SIZE`, `BBOXSR`, and `IMAGESR`
      * will be set dynamically. Set `LAYERS` to override the default service layer visibility. See
      * https://developers.arcgis.com/rest/services-reference/export-map.htm
      * for further reference.
      */
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      * The projection code must contain a numeric end portion separated by :
      * or the entire code must form a valid ArcGIS SpatialReference definition.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Ratio. `1` means image requests are the size of the map viewport,
      * `2` means twice the size of the map viewport, and so on.
      */
    var ratio: js.UndefOr[Double] = js.undefined
    
    /**
      * Resolutions. If specified, requests will be made for
      * these resolutions only.
      */
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * ArcGIS Rest service URL for a Map Service or Image Service. The url
      * should include /MapServer or /ImageServer.
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
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
