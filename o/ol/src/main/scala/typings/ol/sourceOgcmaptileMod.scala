package typings.ol

import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceOgcmaptileMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} url URL to the OGC Map Tileset endpoint.
    * @property {Object} [context] A lookup of values to use in the tile URL template.  The `{tileMatrix}`
    * (zoom level), `{tileRow}`, and `{tileCol}` variables in the URL will always be provided by the source.
    * @property {string} [mediaType] The content type for the tiles (e.g. "image/png").  If not provided,
    * the source will try to find a link with rel="item" that uses a supported image type.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. By default, the projection
    * will be derived from the `crs` of the `tileMatrixSet`.  You can override this by supplying
    * a projection to the constructor.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Tile cache size. The default depends on the screen size. Will be ignored if too small.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(tile, src) {
    *   tile.getImage().src = src;
    * };
    * ```
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    */
  /**
    * @classdesc
    * Layer source for map tiles from an [OGC API - Tiles](https://ogcapi.ogc.org/tiles/) service that provides "map" type tiles.
    * The service must conform to at least the core (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/core)
    * and tileset (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/tileset) conformance classes.
    * @api
    */
  @JSImport("ol/source/OGCMapTile", JSImport.Default)
  @js.native
  open class default protected () extends OGCMapTile {
    /**
      * @param {Options} options OGC map tile options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} url URL to the OGC Map Tileset endpoint.
    * @property {Object} [context] A lookup of values to use in the tile URL template.  The `{tileMatrix}`
    * (zoom level), `{tileRow}`, and `{tileCol}` variables in the URL will always be provided by the source.
    * @property {string} [mediaType] The content type for the tiles (e.g. "image/png").  If not provided,
    * the source will try to find a link with rel="item" that uses a supported image type.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. By default, the projection
    * will be derived from the `crs` of the `tileMatrixSet`.  You can override this by supplying
    * a projection to the constructor.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Tile cache size. The default depends on the screen size. Will be ignored if too small.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(tile, src) {
    *   tile.getImage().src = src;
    * };
    * ```
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    */
  /**
    * @classdesc
    * Layer source for map tiles from an [OGC API - Tiles](https://ogcapi.ogc.org/tiles/) service that provides "map" type tiles.
    * The service must conform to at least the core (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/core)
    * and tileset (http://www.opengis.net/spec/ogcapi-tiles-1/1.0/conf/tileset) conformance classes.
    * @api
    */
  @js.native
  trait OGCMapTile
    extends typings.ol.sourceTileImageMod.default {
    
    /**
      * @private
      * @param {Error} error The error.
      */
    /* private */ var handleError_ : Any = js.native
    
    /**
      * @param {import("./ogcTileUtil.js").TileSetInfo} tileSetInfo Tile set info.
      * @private
      */
    /* private */ var handleTileSetInfo_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Tile cache size. The default depends on the screen size. Will be ignored if too small.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * A lookup of values to use in the tile URL template.  The `{tileMatrix}`
      * (zoom level), `{tileRow}`, and `{tileCol}` variables in the URL will always be provided by the source.
      */
    var context: js.UndefOr[Any] = js.undefined
    
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
      * The content type for the tiles (e.g. "image/png").  If not provided,
      * the source will try to find a link with rel="item" that uses a supported image type.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
    /**
      * Projection. By default, the projection
      * will be derived from the `crs` of the `tileMatrixSet`.  You can override this by supplying
      * a projection to the constructor.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Maximum allowed reprojection error (in pixels).
      * Higher values can increase reprojection performance, but decrease precision.
      */
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional function to load a tile given a URL. The default is
      * ```js
      * function(tile, src) {
      * tile.getImage().src = src;
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
      * URL to the OGC Map Tileset endpoint.
      */
    var url: String
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
