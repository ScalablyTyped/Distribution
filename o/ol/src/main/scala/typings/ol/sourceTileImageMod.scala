package typings.ol

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StringDictionary
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.layerWebGLTileMod.SourceType
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceSourceMod.State
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileImageMod {
  
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
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("./Source.js").State} [state] Source state.
    * @property {typeof import("../ImageTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service. For example, if the tile
    * service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get tile URL given a tile coordinate and the projection.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX] Whether to wrap the world horizontally. The default, is to
    * request out-of-bounds tiles from the server. When set to `false`, only one
    * world will be rendered. When set to `true`, tiles will be requested for one
    * world only, but they will be wrapped horizontally to render multiple worlds.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {string} [key] Optional tile key for proper cache fetching
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Base class for sources providing images divided into a tile grid.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @JSImport("ol/source/TileImage", JSImport.Default)
  @js.native
  open class default protected ()
    extends TileImage
       with SourceType {
    /**
      * @param {!Options} options Image tile options.
      */
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
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional tile key for proper cache fetching
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the layer is opaque.
      */
    var opaque: js.UndefOr[Boolean] = js.undefined
    
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
      * Source state.
      */
    var state: js.UndefOr[State] = js.undefined
    
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
      * Tile grid.
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
      * The pixel ratio used by the tile service. For example, if the tile
      * service advertizes 256px by 256px tiles but actually sends 512px
      * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
      * should be set to `2`.
      */
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional function to get tile URL given a tile coordinate and the projection.
      */
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
      * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
      * used instead of defining each one separately in the `urls` option.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * An array of URL templates.
      */
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to wrap the world horizontally. The default, is to
      * request out-of-bounds tiles from the server. When set to `false`, only one
      * world will be rendered. When set to `true`, tiles will be requested for one
      * world only, but they will be wrapped horizontally to render multiple worlds.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
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
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
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
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTileUrlFunction(
        value: (/* arg0 */ TileCoord, /* arg1 */ Double, /* arg2 */ typings.ol.projProjectionMod.default) => js.UndefOr[String]
      ): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
      
      inline def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
      
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
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("./Source.js").State} [state] Source state.
    * @property {typeof import("../ImageTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service. For example, if the tile
    * service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get tile URL given a tile coordinate and the projection.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX] Whether to wrap the world horizontally. The default, is to
    * request out-of-bounds tiles from the server. When set to `false`, only one
    * world will be rendered. When set to `true`, tiles will be requested for one
    * world only, but they will be wrapped horizontally to render multiple worlds.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {string} [key] Optional tile key for proper cache fetching
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Base class for sources providing images divided into a tile grid.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @js.native
  trait TileImage
    extends typings.ol.sourceUrlTileMod.default {
    
    /**
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @param {string} key The key set on the tile.
      * @return {!ImageTile} Tile.
      * @private
      */
    /* private */ var createTile_ : Any = js.native
    
    /**
      * @protected
      * @type {?string}
      */
    /* protected */ var crossOrigin: String | Null = js.native
    
    /**
      * @return {number} Gutter.
      */
    def getGutter(): Double = js.native
    
    /**
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @param {number} pixelRatio Pixel ratio.
      * @param {!import("../proj/Projection.js").default} projection Projection.
      * @return {!ImageTile} Tile.
      * @protected
      */
    /* protected */ def getTileInternal(
      z: Double,
      x: Double,
      y: Double,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default
    ): typings.ol.imageTileMod.default = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var renderReprojectionEdges_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var reprojectionErrorThreshold_ : Any = js.native
    
    /**
      * Sets whether to render reprojection edges or not (usually for debugging).
      * @param {boolean} render Render the edges.
      * @api
      */
    def setRenderReprojectionEdges(render: Boolean): Unit = js.native
    
    /**
      * Sets the tile grid to use when reprojecting the tiles to the given
      * projection instead of the default tile grid for the projection.
      *
      * This can be useful when the default tile grid cannot be created
      * (e.g. projection has no extent defined) or
      * for optimization reasons (custom tile size, resolutions, ...).
      *
      * @param {import("../proj.js").ProjectionLike} projection Projection.
      * @param {import("../tilegrid/TileGrid.js").default} tilegrid Tile grid to use for the projection.
      * @api
      */
    def setTileGridForProjection(projection: ProjectionLike, tilegrid: typings.ol.tilegridTileGridMod.default): Unit = js.native
    
    /**
      * @protected
      * @type {!Object<string, TileCache>}
      */
    /* protected */ var tileCacheForProjection: StringDictionary[typings.ol.tileCacheMod.default] = js.native
    
    /**
      * @protected
      * @type {typeof ImageTile}
      */
    /* protected */ var tileClass: Instantiable6[
        /* tileCoord */ TileCoord, 
        /* state */ Any, 
        /* src */ String, 
        /* crossOrigin */ String | Null, 
        /* tileLoadFunction */ LoadFunction, 
        /* options */ js.UndefOr[typings.ol.tileMod.Options], 
        typings.ol.imageTileMod.default
      ] = js.native
    
    /**
      * @protected
      * @type {!Object<string, import("../tilegrid/TileGrid.js").default>}
      */
    /* protected */ var tileGridForProjection: StringDictionary[typings.ol.tilegridTileGridMod.default] = js.native
  }
}
