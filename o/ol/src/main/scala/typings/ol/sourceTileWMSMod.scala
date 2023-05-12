package typings.ol

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StringDictionary
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.coordinateMod.Coordinate
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceWmsMod.ServerType
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileWMSMod {
  
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
    * @property {Object<string,*>} params WMS request parameters.
    * At least a `LAYERS` param is required. `STYLES` is
    * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
    * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
    * @property {number} [gutter=0]
    * The size in pixels of the gutter around image tiles to ignore. By setting
    * this property to a non-zero value, images will be requested that are wider
    * and taller than the tile size by a value of `2 x gutter`.
    * Using a non-zero value allows artifacts of rendering at tile edges to be
    * ignored. If you control the WMS service it is recommended to address
    * "artifacts at tile edges" issues by properly configuring the WMS service. For
    * example, MapServer has a `tile_map_edge_buffer` configuration parameter for
    * this. See https://mapserver.org/output/tile_mode.html.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {typeof import("../ImageTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid. Base this on the resolutions,
    * tilesize and extent supported by the server.
    * If this is not defined, a default grid will be used: if there is a projection
    * extent, the grid will be based on that; if not, a grid based on a global
    * extent with origin at 0,0 will be used.
    * @property {import("./wms.js").ServerType} [serverType] The type of
    * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
    * Only needed if `hidpi` is `true`.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {string} [url] WMS service URL.
    * @property {Array<string>} [urls] WMS service urls.
    * Use this instead of `url` when the WMS supports multiple urls for GetMap requests.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * When set to `false`, only one world
    * will be rendered. When `true`, tiles will be requested for one world only,
    * but they will be wrapped horizontally to render multiple worlds.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    * @api
    */
  @JSImport("ol/source/TileWMS", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Tile WMS options.
    */
  open class default () extends TileWMS {
    def this(options: Options) = this()
  }
  
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
      * The size in pixels of the gutter around image tiles to ignore. By setting
      * this property to a non-zero value, images will be requested that are wider
      * and taller than the tile size by a value of `2 x gutter`.
      * Using a non-zero value allows artifacts of rendering at tile edges to be
      * ignored. If you control the WMS service it is recommended to address
      * "artifacts at tile edges" issues by properly configuring the WMS service. For
      * example, MapServer has a `tile_map_edge_buffer` configuration parameter for
      * this. See https://mapserver.org/output/tile_mode.html.
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * Use the `ol/Map#pixelRatio` value when requesting
      * the image from the remote server.
      */
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
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
    var params: StringDictionary[Any]
    
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
      * The type of
      * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
      * Only needed if `hidpi` is `true`.
      */
    var serverType: js.UndefOr[ServerType] = js.undefined
    
    /**
      * Class used to instantiate image tiles.
      * Default is {@link module :ol/ImageTile~ImageTile}.
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
      * Tile grid. Base this on the resolutions,
      * tilesize and extent supported by the server.
      * If this is not defined, a default grid will be used: if there is a projection
      * extent, the grid will be based on that; if not, a grid based on a global
      * extent with origin at 0,0 will be used.
      */
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
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
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * WMS service URL.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * WMS service urls.
      * Use this instead of `url` when the WMS supports multiple urls for GetMap requests.
      */
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      * When set to `false`, only one world
      * will be rendered. When `true`, tiles will be requested for one world only,
      * but they will be wrapped horizontally to render multiple worlds.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(params: StringDictionary[Any]): Options = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
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
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      
      inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
      
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
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
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
    * @property {Object<string,*>} params WMS request parameters.
    * At least a `LAYERS` param is required. `STYLES` is
    * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
    * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
    * @property {number} [gutter=0]
    * The size in pixels of the gutter around image tiles to ignore. By setting
    * this property to a non-zero value, images will be requested that are wider
    * and taller than the tile size by a value of `2 x gutter`.
    * Using a non-zero value allows artifacts of rendering at tile edges to be
    * ignored. If you control the WMS service it is recommended to address
    * "artifacts at tile edges" issues by properly configuring the WMS service. For
    * example, MapServer has a `tile_map_edge_buffer` configuration parameter for
    * this. See https://mapserver.org/output/tile_mode.html.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {typeof import("../ImageTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid. Base this on the resolutions,
    * tilesize and extent supported by the server.
    * If this is not defined, a default grid will be used: if there is a projection
    * extent, the grid will be based on that; if not, a grid based on a global
    * extent with origin at 0,0 will be used.
    * @property {import("./wms.js").ServerType} [serverType] The type of
    * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
    * Only needed if `hidpi` is `true`.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {string} [url] WMS service URL.
    * @property {Array<string>} [urls] WMS service urls.
    * Use this instead of `url` when the WMS supports multiple urls for GetMap requests.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * When set to `false`, only one world
    * will be rendered. When `true`, tiles will be requested for one world only,
    * but they will be wrapped horizontally to render multiple worlds.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    * @api
    */
  @js.native
  trait TileWMS
    extends typings.ol.sourceTileImageMod.default {
    
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
      * @private
      * @return {string} The key for the current params.
      */
    /* private */ var getKeyForParams_ : Any = js.native
    
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
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("../size.js").Size} tileSize Tile size.
      * @param {import("../extent.js").Extent} tileExtent Tile extent.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @param {Object} params Params.
      * @return {string|undefined} Request URL.
      * @private
      */
    /* private */ var getRequestUrl_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var gutter_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var hidpi_ : Any = js.native
    
    /**
      * @private
      * @type {!Object}
      */
    /* private */ var params_ : Any = js.native
    
    /**
      * @private
      * @type {import("./wms.js").ServerType}
      */
    /* private */ var serverType_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var tmpExtent_ : Any = js.native
    
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
      * @type {boolean}
      */
    /* private */ var v13_ : Any = js.native
  }
}
