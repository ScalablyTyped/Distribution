package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceXyzMod {
  
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
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {number} [maxZoom=42] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom=0] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service.
    * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The tile size used by the tile service.
    * Not used if `tileGrid` is provided.
    * @property {number} [gutter=0] The size in pixels of the gutter around image tiles to ignore.
    * This allows artifacts of rendering at tile edges to be ignored.
    * Supported images should be wider and taller than the tile size by a value of `2 x gutter`.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get
    * tile URL given a tile coordinate and the projection.
    * Required if `url` or `urls` are not provided.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`,
    * and `{z}` placeholders. A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`,
    * may be used instead of defining each one separately in the `urls` option.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data with URLs in a set XYZ format that are
    * defined in a URL template. By default, this follows the widely-used
    * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
    * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
    * using the `{-y}` placeholder in the URL template, so long as the
    * source does not have a custom tile grid. In this case
    * a `tileUrlFunction` can be used, such as:
    * ```js
    *  tileUrlFunction: function(coordinate) {
    *    return 'http://mapserver.com/' + coordinate[0] + '/' +
    *      coordinate[1] + '/' + (-coordinate[2] - 1) + '.png';
    *  }
    * ```
    * @api
    */
  @JSImport("ol/source/XYZ", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] XYZ options.
    */
  open class default () extends XYZ {
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
      * The size in pixels of the gutter around image tiles to ignore.
      * This allows artifacts of rendering at tile edges to be ignored.
      * Supported images should be wider and taller than the tile size by a value of `2 x gutter`.
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
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
      * Whether the layer is opaque.
      */
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Maximum allowed reprojection error (in pixels).
      * Higher values can increase reprojection performance, but decrease precision.
      */
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
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
      * The pixel ratio used by the tile service.
      * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
      * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
      * should be set to `2`.
      */
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * The tile size used by the tile service.
      * Not used if `tileGrid` is provided.
      */
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Optional function to get
      * tile URL given a tile coordinate and the projection.
      * Required if `url` or `urls` are not provided.
      */
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * URL template. Must include `{x}`, `{y}` or `{-y}`,
      * and `{z}` placeholders. A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`,
      * may be used instead of defining each one separately in the `urls` option.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * An array of URL templates.
      */
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
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
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
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
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {number} [maxZoom=42] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom=0] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service.
    * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The tile size used by the tile service.
    * Not used if `tileGrid` is provided.
    * @property {number} [gutter=0] The size in pixels of the gutter around image tiles to ignore.
    * This allows artifacts of rendering at tile edges to be ignored.
    * Supported images should be wider and taller than the tile size by a value of `2 x gutter`.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get
    * tile URL given a tile coordinate and the projection.
    * Required if `url` or `urls` are not provided.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`,
    * and `{z}` placeholders. A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`,
    * may be used instead of defining each one separately in the `urls` option.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data with URLs in a set XYZ format that are
    * defined in a URL template. By default, this follows the widely-used
    * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
    * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
    * using the `{-y}` placeholder in the URL template, so long as the
    * source does not have a custom tile grid. In this case
    * a `tileUrlFunction` can be used, such as:
    * ```js
    *  tileUrlFunction: function(coordinate) {
    *    return 'http://mapserver.com/' + coordinate[0] + '/' +
    *      coordinate[1] + '/' + (-coordinate[2] - 1) + '.png';
    *  }
    * ```
    * @api
    */
  @js.native
  trait XYZ
    extends typings.ol.sourceTileImageMod.default {
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var gutter_ : Any = js.native
  }
}
