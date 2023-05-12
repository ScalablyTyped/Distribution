package typings.ol

import org.scalablytyped.runtime.Instantiable6
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWmtsMod {
  
  @JSImport("ol/source/WMTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Request encoding. One of 'KVP', 'REST'.
    * @typedef {'KVP' | 'REST'} RequestEncoding
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../tilegrid/WMTS.js").default} tileGrid Tile grid.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {RequestEncoding} [requestEncoding='KVP'] Request encoding.
    * @property {string} layer Layer name as advertised in the WMTS capabilities.
    * @property {string} style Style name as advertised in the WMTS capabilities.
    * @property {typeof import("../ImageTile.js").default} [tileClass]  Class used to instantiate image tiles. Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service.
    * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {string} [format='image/jpeg'] Image format. Only used when `requestEncoding` is `'KVP'`.
    * @property {string} [version='1.0.0'] WMTS version.
    * @property {string} matrixSet Matrix set.
    * @property {!Object} [dimensions] Additional "dimensions" for tile requests.
    * This is an object with properties named like the advertised WMTS dimensions.
    * @property {string} [url]  A URL for the service.
    * For the RESTful request encoding, this is a URL
    * template.  For KVP encoding, it is normal URL. A `{?-?}` template pattern,
    * for example `subdomain{a-f}.domain.com`, may be used instead of defining
    * each one separately in the `urls` option.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {Array<string>} [urls] An array of URLs.
    * Requests will be distributed among the URLs in this array.
    * @property {boolean} [wrapX=false] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from WMTS servers.
    * @api
    */
  @JSImport("ol/source/WMTS", JSImport.Default)
  @js.native
  open class default protected () extends WMTS {
    /**
      * @param {Options} options WMTS options.
      */
    def this(options: Options) = this()
  }
  
  inline def optionsFromCapabilities(wmtsCap: Any, config: Any): Options | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsFromCapabilities")(wmtsCap.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Options | Null]
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Attributions are collapsible.
      */
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images.  Note that
      * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Additional "dimensions" for tile requests.
      * This is an object with properties named like the advertised WMTS dimensions.
      */
    var dimensions: js.UndefOr[Any] = js.undefined
    
    /**
      * Image format. Only used when `requestEncoding` is `'KVP'`.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Layer name as advertised in the WMTS capabilities.
      */
    var layer: String
    
    /**
      * Matrix set.
      */
    var matrixSet: String
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Maximum allowed reprojection error (in pixels).
      * Higher values can increase reprojection performance, but decrease precision.
      */
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Request encoding.
      */
    var requestEncoding: js.UndefOr[RequestEncoding] = js.undefined
    
    /**
      * Style name as advertised in the WMTS capabilities.
      */
    var style: String
    
    /**
      * Class used to instantiate image tiles. Default is {@link module :ol/ImageTile~ImageTile}.
      */
    var tileClass: js.UndefOr[
        Instantiable6[
          /* tileCoord */ TileCoord, 
          /* state */ Any, 
          /* src */ String, 
          /* crossOrigin */ String | Null, 
          /* tileLoadFunction */ LoadFunction, 
          /* options */ js.UndefOr[typings.ol.tileMod.Options], 
          typings.ol.imageTileMod.default
        ]
      ] = js.undefined
    
    /**
      * Tile grid.
      */
    var tileGrid: typings.ol.tilegridWmtsMod.default
    
    /**
      * Optional function to load a tile given a URL. The default is
      * ```js
      * function(imageTile, src) {
      * imageTile.getImage().src = src;
      * };
      * ```
      */
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * The pixel ratio used by the tile service.
      * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
      * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
      * should be set to `2`.
      */
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * A URL for the service.
      * For the RESTful request encoding, this is a URL
      * template.  For KVP encoding, it is normal URL. A `{?-?}` template pattern,
      * for example `subdomain{a-f}.domain.com`, may be used instead of defining
      * each one separately in the `urls` option.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * An array of URLs.
      * Requests will be distributed among the URLs in this array.
      */
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * WMTS version.
      */
    var version: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(layer: String, matrixSet: String, style: String, tileGrid: typings.ol.tilegridWmtsMod.default): Options = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDimensions(value: Any): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setMatrixSet(value: String): Self = StObject.set(x, "matrixSet", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setRequestEncoding(value: RequestEncoding): Self = StObject.set(x, "requestEncoding", value.asInstanceOf[js.Any])
      
      inline def setRequestEncodingUndefined: Self = StObject.set(x, "requestEncoding", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTileClass(
        value: Instantiable6[
              /* tileCoord */ TileCoord, 
              /* state */ Any, 
              /* src */ String, 
              /* crossOrigin */ String | Null, 
              /* tileLoadFunction */ LoadFunction, 
              /* options */ js.UndefOr[typings.ol.tileMod.Options], 
              typings.ol.imageTileMod.default
            ]
      ): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridWmtsMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.KVP
    - typings.ol.olStrings.REST
  */
  trait RequestEncoding extends StObject
  object RequestEncoding {
    
    inline def KVP: typings.ol.olStrings.KVP = "KVP".asInstanceOf[typings.ol.olStrings.KVP]
    
    inline def REST: typings.ol.olStrings.REST = "REST".asInstanceOf[typings.ol.olStrings.REST]
  }
  
  /**
    * Request encoding. One of 'KVP', 'REST'.
    * @typedef {'KVP' | 'REST'} RequestEncoding
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../tilegrid/WMTS.js").default} tileGrid Tile grid.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {RequestEncoding} [requestEncoding='KVP'] Request encoding.
    * @property {string} layer Layer name as advertised in the WMTS capabilities.
    * @property {string} style Style name as advertised in the WMTS capabilities.
    * @property {typeof import("../ImageTile.js").default} [tileClass]  Class used to instantiate image tiles. Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service.
    * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {string} [format='image/jpeg'] Image format. Only used when `requestEncoding` is `'KVP'`.
    * @property {string} [version='1.0.0'] WMTS version.
    * @property {string} matrixSet Matrix set.
    * @property {!Object} [dimensions] Additional "dimensions" for tile requests.
    * This is an object with properties named like the advertised WMTS dimensions.
    * @property {string} [url]  A URL for the service.
    * For the RESTful request encoding, this is a URL
    * template.  For KVP encoding, it is normal URL. A `{?-?}` template pattern,
    * for example `subdomain{a-f}.domain.com`, may be used instead of defining
    * each one separately in the `urls` option.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {Array<string>} [urls] An array of URLs.
    * Requests will be distributed among the URLs in this array.
    * @property {boolean} [wrapX=false] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from WMTS servers.
    * @api
    */
  @js.native
  trait WMTS
    extends typings.ol.sourceTileImageMod.default {
    
    /**
      * @param {string} template Template.
      * @return {import("../Tile.js").UrlFunction} Tile URL function.
      */
    def createFromWMTSTemplate(template: String): UrlFunction = js.native
    
    /**
      * @private
      * @type {!Object}
      */
    /* private */ var dimensions_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var format_ : Any = js.native
    
    /**
      * Get the dimensions, i.e. those passed to the constructor through the
      * "dimensions" option, and possibly updated using the updateDimensions
      * method.
      * @return {!Object} Dimensions.
      * @api
      */
    def getDimensions(): Any = js.native
    
    /**
      * Return the image format of the WMTS source.
      * @return {string} Format.
      * @api
      */
    def getFormat(): String = js.native
    
    /**
      * @private
      * @return {string} The key for the current dimensions.
      */
    /* private */ var getKeyForDimensions_ : Any = js.native
    
    /**
      * Return the layer of the WMTS source.
      * @return {string} Layer.
      * @api
      */
    def getLayer(): String = js.native
    
    /**
      * Return the matrix set of the WMTS source.
      * @return {string} MatrixSet.
      * @api
      */
    def getMatrixSet(): String = js.native
    
    /**
      * Return the request encoding, either "KVP" or "REST".
      * @return {RequestEncoding} Request encoding.
      * @api
      */
    def getRequestEncoding(): RequestEncoding = js.native
    
    /**
      * Return the style of the WMTS source.
      * @return {string} Style.
      * @api
      */
    def getStyle(): String = js.native
    
    /**
      * Return the version of the WMTS source.
      * @return {string} Version.
      * @api
      */
    def getVersion(): String = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var layer_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var matrixSet_ : Any = js.native
    
    /**
      * @private
      * @type {RequestEncoding}
      */
    /* private */ var requestEncoding_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var style_ : Any = js.native
    
    /**
      * Update the dimensions.
      * @param {Object} dimensions Dimensions.
      * @api
      */
    def updateDimensions(dimensions: Any): Unit = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var version_ : Any = js.native
  }
}
