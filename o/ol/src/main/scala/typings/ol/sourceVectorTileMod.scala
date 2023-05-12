package typings.ol

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable6
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
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

object sourceVectorTileMod {
  
  @JSImport("ol/source/VectorTile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
    * @property {import("../extent.js").Extent} [extent] Extent.
    * @property {import("../format/Feature.js").default} [format] Feature format for tiles. Used and required by the default.
    * @property {boolean} [overlaps=true] This source may have overlapping geometries. Setting this
    * to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection of the tile grid.
    * @property {import("./Source.js").State} [state] Source state.
    * @property {typeof import("../VectorTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/VectorTile~VectorTile}.
    * @property {number} [maxZoom=22] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number|import("../size.js").Size} [tileSize=512] Optional tile size. Not used if `tileGrid` is provided.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction]
    * Optional function to load a tile given a URL. Could look like this for pbf tiles:
    * ```js
    * function(tile, url) {
    *   tile.setLoader(function(extent, resolution, projection) {
    *     fetch(url).then(function(response) {
    *       response.arrayBuffer().then(function(data) {
    *         const format = tile.getFormat() // ol/format/MVT configured as source format
    *         const features = format.readFeatures(data, {
    *           extent: extent,
    *           featureProjection: projection
    *         });
    *         tile.setFeatures(features);
    *       });
    *     });
    *   });
    * }
    * ```
    * If you do not need extent, resolution and projection to get the features for a tile (e.g.
    * for GeoJSON tiles), your `tileLoadFunction` does not need a `setLoader()` call. Only make sure
    * to call `setFeatures()` on the tile:
    * ```js
    * const format = new GeoJSON({featureProjection: map.getView().getProjection()});
    * async function tileLoadFunction(tile, url) {
    *   const response = await fetch(url);
    *   const data = await response.json();
    *   tile.setFeatures(format.readFeatures(data));
    * }
    * ```
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get tile URL given a tile coordinate and the projection.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {number} [transition] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * When set to `false`, only one world
    * will be rendered. When set to `true`, tiles will be wrapped horizontally to
    * render multiple worlds.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=1]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Class for layer sources providing vector data divided into a tile grid, to be
    * used with {@link module:ol/layer/VectorTile~VectorTileLayer}. Although this source receives tiles
    * with vector features from the server, it is not meant for feature editing.
    * Features are optimized for rendering, their geometries are clipped at or near
    * tile boundaries and simplified for a view resolution. See
    * {@link module:ol/source/Vector~VectorSource} for vector sources that are suitable for feature
    * editing.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @JSImport("ol/source/VectorTile", JSImport.Default)
  @js.native
  open class default protected () extends VectorTile {
    /**
      * @param {!Options} options Vector tile options.
      */
    def this(options: Options) = this()
  }
  
  inline def defaultLoadFunction(tile: typings.ol.vectorTileMod.default, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadFunction")(tile.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
      * Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Feature format for tiles. Used and required by the default.
      */
    var format: js.UndefOr[typings.ol.renderFeatureMod.default] = js.undefined
    
    /**
      * Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
      */
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional max zoom level. Not used if `tileGrid` is provided.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional min zoom level. Not used if `tileGrid` is provided.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * This source may have overlapping geometries. Setting this
      * to `false` (e.g. for sources with polygons that represent administrative
      * boundaries or TopoJSON sources) allows the renderer to optimise fill and
      * stroke operations.
      */
    var overlaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection of the tile grid.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Source state.
      */
    var state: js.UndefOr[State] = js.undefined
    
    /**
      * Class used to instantiate image tiles.
      * Default is {@link module :ol/VectorTile~VectorTile}.
      */
    var tileClass: js.UndefOr[
        Instantiable6[
          /* tileCoord */ TileCoord, 
          /* state */ Any, 
          /* src */ String, 
          /* format */ typings.ol.renderFeatureMod.default, 
          /* tileLoadFunction */ LoadFunction, 
          /* options */ js.UndefOr[typings.ol.tileMod.Options], 
          typings.ol.vectorTileMod.default
        ]
      ] = js.undefined
    
    /**
      * Tile grid.
      */
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    /**
      * Optional function to load a tile given a URL. Could look like this for pbf tiles:
      * ```js
      * function(tile, url) {
      * tile.setLoader(function(extent, resolution, projection) {
      * fetch(url).then(function(response) {
      * response.arrayBuffer().then(function(data) {
      * const format = tile.getFormat() // ol/format/MVT configured as source format
      * const features = format.readFeatures(data, {
      * extent: extent,
      * featureProjection: projection
      * });
      * tile.setFeatures(features);
      * });
      * });
      * });
      * }
      * ```
      * If you do not need extent, resolution and projection to get the features for a tile (e.g.
      * for GeoJSON tiles), your `tileLoadFunction` does not need a `setLoader()` call. Only make sure
      * to call `setFeatures()` on the tile:
      * ```js
      * const format = new GeoJSON({featureProjection: map.getView().getProjection()});
      * async function tileLoadFunction(tile, url) {
      * const response = await fetch(url);
      * const data = await response.json();
      * tile.setFeatures(format.readFeatures(data));
      * }
      * ```
      */
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * Optional tile size. Not used if `tileGrid` is provided.
      */
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Optional function to get tile URL given a tile coordinate and the projection.
      */
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
    
    /**
      * A duration for tile opacity
      * transitions in milliseconds. A duration of 0 disables the opacity transition.
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
      * Whether to wrap the world horizontally.
      * When set to `false`, only one world
      * will be rendered. When set to `true`, tiles will be wrapped horizontally to
      * render multiple worlds.
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
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setFormat(value: typings.ol.renderFeatureMod.default): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
      
      inline def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTileClass(
        value: Instantiable6[
              /* tileCoord */ TileCoord, 
              /* state */ Any, 
              /* src */ String, 
              /* format */ typings.ol.renderFeatureMod.default, 
              /* tileLoadFunction */ LoadFunction, 
              /* options */ js.UndefOr[typings.ol.tileMod.Options], 
              typings.ol.vectorTileMod.default
            ]
      ): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizeVarargs(value: Double*): Self = StObject.set(x, "tileSize", js.Array(value*))
      
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
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
    * @property {import("../extent.js").Extent} [extent] Extent.
    * @property {import("../format/Feature.js").default} [format] Feature format for tiles. Used and required by the default.
    * @property {boolean} [overlaps=true] This source may have overlapping geometries. Setting this
    * to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection of the tile grid.
    * @property {import("./Source.js").State} [state] Source state.
    * @property {typeof import("../VectorTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/VectorTile~VectorTile}.
    * @property {number} [maxZoom=22] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number|import("../size.js").Size} [tileSize=512] Optional tile size. Not used if `tileGrid` is provided.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction]
    * Optional function to load a tile given a URL. Could look like this for pbf tiles:
    * ```js
    * function(tile, url) {
    *   tile.setLoader(function(extent, resolution, projection) {
    *     fetch(url).then(function(response) {
    *       response.arrayBuffer().then(function(data) {
    *         const format = tile.getFormat() // ol/format/MVT configured as source format
    *         const features = format.readFeatures(data, {
    *           extent: extent,
    *           featureProjection: projection
    *         });
    *         tile.setFeatures(features);
    *       });
    *     });
    *   });
    * }
    * ```
    * If you do not need extent, resolution and projection to get the features for a tile (e.g.
    * for GeoJSON tiles), your `tileLoadFunction` does not need a `setLoader()` call. Only make sure
    * to call `setFeatures()` on the tile:
    * ```js
    * const format = new GeoJSON({featureProjection: map.getView().getProjection()});
    * async function tileLoadFunction(tile, url) {
    *   const response = await fetch(url);
    *   const data = await response.json();
    *   tile.setFeatures(format.readFeatures(data));
    * }
    * ```
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get tile URL given a tile coordinate and the projection.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {number} [transition] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * When set to `false`, only one world
    * will be rendered. When set to `true`, tiles will be wrapped horizontally to
    * render multiple worlds.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=1]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Class for layer sources providing vector data divided into a tile grid, to be
    * used with {@link module:ol/layer/VectorTile~VectorTileLayer}. Although this source receives tiles
    * with vector features from the server, it is not meant for feature editing.
    * Features are optimized for rendering, their geometries are clipped at or near
    * tile boundaries and simplified for a view resolution. See
    * {@link module:ol/source/Vector~VectorSource} for vector sources that are suitable for feature
    * editing.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @js.native
  trait VectorTile
    extends typings.ol.sourceUrlTileMod.default {
    
    /**
      * @private
      * @type {import("../format/Feature.js").default|null}
      */
    /* private */ var format_ : Any = js.native
    
    /**
      * Get features whose bounding box intersects the provided extent. Only features for cached
      * tiles for the last rendered zoom level are available in the source. So this method is only
      * suitable for requesting tiles for extents that are currently rendered.
      *
      * Features are returned in random tile order and as they are included in the tiles. This means
      * they can be clipped, duplicated across tiles, and simplified to the render resolution.
      *
      * @param {import("../extent.js").Extent} extent Extent.
      * @return {Array<import("../Feature.js").FeatureLike>} Features.
      * @api
      */
    def getFeaturesInExtent(extent: Extent): js.Array[FeatureLike] = js.native
    
    /**
      * @return {boolean} The source can have overlapping geometries.
      */
    def getOverlaps(): Boolean = js.native
    
    /**
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection").default} projection Projection.
      * @param {VectorRenderTile} tile Vector image tile.
      * @return {Array<import("../VectorTile").default>} Tile keys.
      */
    def getSourceTiles(
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      tile: typings.ol.vectorRenderTileMod.default
    ): js.Array[typings.ol.vectorTileMod.default] = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var overlaps_ : Any = js.native
    
    /**
      * @private
      * @type {TileCache}
      */
    /* private */ var sourceTileCache: Any = js.native
    
    /**
      * @protected
      * @type {typeof import("../VectorTile.js").default}
      */
    /* protected */ var tileClass: (Instantiable6[
        /* tileCoord */ TileCoord, 
        /* state */ Any, 
        /* src */ String, 
        /* format */ typings.ol.renderFeatureMod.default, 
        /* tileLoadFunction */ LoadFunction, 
        /* options */ js.UndefOr[typings.ol.tileMod.Options], 
        typings.ol.vectorTileMod.default
      ]) & (Instantiable1[/* options */ Options, default]) & (Instantiable1[
        /* options */ js.UndefOr[typings.ol.layerVectorTileMod.Options], 
        typings.ol.layerVectorTileMod.default
      ]) = js.native
    
    /**
      * @private
      * @type {Object<string, import("../tilegrid/TileGrid.js").default>}
      */
    /* private */ var tileGrids_ : Any = js.native
  }
}
