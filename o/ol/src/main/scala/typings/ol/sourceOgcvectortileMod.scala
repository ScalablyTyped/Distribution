package typings.ol

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable6
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceOgcvectortileMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} url URL to the OGC Vector Tileset endpoint.
    * @property {Object} [context] A lookup of values to use in the tile URL template.  The `{tileMatrix}`
    * (zoom level), `{tileRow}`, and `{tileCol}` variables in the URL will always be provided by the source.
    * @property {import("../format/Feature.js").default} format Feature parser for tiles.
    * @property {string} [mediaType] The content type for the tiles (e.g. "application/vnd.mapbox-vector-tile").  If not provided,
    * the source will try to find a link with rel="item" that uses a vector type supported by the configured format.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
    * @property {boolean} [overlaps=true] This source may have overlapping geometries. Setting this
    * to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection of the tile grid.
    * @property {typeof import("../VectorTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/VectorTile~VectorTile}.
    * @property {number} [transition] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
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
    * Layer source for map tiles from an [OGC API - Tiles](https://ogcapi.ogc.org/tiles/) service that provides "vector" type tiles.
    * The service must conform to at least the core (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/core)
    * and tileset (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/tileset) conformance classes.
    *
    * Vector tile sets may come in a variety of formats (e.g. GeoJSON, MVT).  The `format` option is used to determine
    * which of the advertised media types is used.  If you need to force the use of a particular media type, you can
    * provide the `mediaType` option.
    * @api
    */
  @JSImport("ol/source/OGCVectorTile", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OGCVectorTile {
    /**
      * @param {Options} options OGC vector tile options.
      */
    def this(options: Options) = this()
    
    /**
      * @private
      * @param {Error} error The error.
      */
    /* private */ /* CompleteClass */
    var handleError_ : Any = js.native
    
    /**
      * @param {import("./ogcTileUtil.js").TileSetInfo} tileSetInfo Tile set info.
      * @private
      */
    /* private */ /* CompleteClass */
    var handleTileSetInfo_ : Any = js.native
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} url URL to the OGC Vector Tileset endpoint.
    * @property {Object} [context] A lookup of values to use in the tile URL template.  The `{tileMatrix}`
    * (zoom level), `{tileRow}`, and `{tileCol}` variables in the URL will always be provided by the source.
    * @property {import("../format/Feature.js").default} format Feature parser for tiles.
    * @property {string} [mediaType] The content type for the tiles (e.g. "application/vnd.mapbox-vector-tile").  If not provided,
    * the source will try to find a link with rel="item" that uses a vector type supported by the configured format.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
    * @property {boolean} [overlaps=true] This source may have overlapping geometries. Setting this
    * to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection of the tile grid.
    * @property {typeof import("../VectorTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/VectorTile~VectorTile}.
    * @property {number} [transition] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
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
    * Layer source for map tiles from an [OGC API - Tiles](https://ogcapi.ogc.org/tiles/) service that provides "vector" type tiles.
    * The service must conform to at least the core (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/core)
    * and tileset (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/tileset) conformance classes.
    *
    * Vector tile sets may come in a variety of formats (e.g. GeoJSON, MVT).  The `format` option is used to determine
    * which of the advertised media types is used.  If you need to force the use of a particular media type, you can
    * provide the `mediaType` option.
    * @api
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VectorTile * / any */ trait OGCVectorTile extends StObject {
    
    /**
      * @private
      * @param {Error} error The error.
      */
    /* private */ var handleError_ : Any
    
    /**
      * @param {import("./ogcTileUtil.js").TileSetInfo} tileSetInfo Tile set info.
      * @private
      */
    /* private */ var handleTileSetInfo_ : Any
  }
  object OGCVectorTile {
    
    inline def apply(handleError_ : Any, handleTileSetInfo_ : Any): OGCVectorTile = {
      val __obj = js.Dynamic.literal(handleError_ = handleError_.asInstanceOf[js.Any], handleTileSetInfo_ = handleTileSetInfo_.asInstanceOf[js.Any])
      __obj.asInstanceOf[OGCVectorTile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OGCVectorTile] (val x: Self) extends AnyVal {
      
      inline def setHandleError_(value: Any): Self = StObject.set(x, "handleError_", value.asInstanceOf[js.Any])
      
      inline def setHandleTileSetInfo_(value: Any): Self = StObject.set(x, "handleTileSetInfo_", value.asInstanceOf[js.Any])
    }
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
      * Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * A lookup of values to use in the tile URL template.  The `{tileMatrix}`
      * (zoom level), `{tileRow}`, and `{tileCol}` variables in the URL will always be provided by the source.
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /**
      * Feature parser for tiles.
      */
    var format: typings.ol.renderFeatureMod.default
    
    /**
      * The content type for the tiles (e.g. "application/vnd.mapbox-vector-tile").  If not provided,
      * the source will try to find a link with rel="item" that uses a vector type supported by the configured format.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
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
      * Class used to instantiate image tiles.
      * Default is {@link module :ol/VectorTile~VectorTile}.
      */
    var tileClass: js.UndefOr[
        (Instantiable6[
          /* tileCoord */ TileCoord, 
          /* state */ Any, 
          /* src */ String, 
          /* format */ typings.ol.renderFeatureMod.default, 
          /* tileLoadFunction */ LoadFunction, 
          /* options */ js.UndefOr[typings.ol.tileMod.Options], 
          typings.ol.vectorTileMod.default
        ]) & (Instantiable1[
          /* options */ typings.ol.sourceVectorTileMod.Options, 
          typings.ol.sourceVectorTileMod.default
        ]) & (Instantiable1[
          /* options */ js.UndefOr[typings.ol.layerVectorTileMod.Options], 
          typings.ol.layerVectorTileMod.default
        ])
      ] = js.undefined
    
    /**
      * A duration for tile opacity
      * transitions in milliseconds. A duration of 0 disables the opacity transition.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * URL to the OGC Vector Tileset endpoint.
      */
    var url: String
    
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
    
    inline def apply(format: typings.ol.renderFeatureMod.default, url: String): Options = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFormat(value: typings.ol.renderFeatureMod.default): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
      
      inline def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTileClass(
        value: (Instantiable6[
              /* tileCoord */ TileCoord, 
              /* state */ Any, 
              /* src */ String, 
              /* format */ typings.ol.renderFeatureMod.default, 
              /* tileLoadFunction */ LoadFunction, 
              /* options */ js.UndefOr[typings.ol.tileMod.Options], 
              typings.ol.vectorTileMod.default
            ]) & (Instantiable1[
              /* options */ typings.ol.sourceVectorTileMod.Options, 
              typings.ol.sourceVectorTileMod.default
            ]) & (Instantiable1[
              /* options */ js.UndefOr[typings.ol.layerVectorTileMod.Options], 
              typings.ol.layerVectorTileMod.default
            ])
      ): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
}
