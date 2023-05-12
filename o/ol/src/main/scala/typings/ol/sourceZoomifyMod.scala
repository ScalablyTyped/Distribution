package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.extentMod.Extent
import typings.ol.olStrings.default_
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceZoomifyMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value  you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {number} [tilePixelRatio] The pixel ratio used by the tile service. For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px by 512px images (for retina/hidpi devices) then `tilePixelRatio` should be set to `2`
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {string} url URL template or base URL of the Zoomify service.
    * A base URL is the fixed part
    * of the URL, excluding the tile group, z, x, and y folder structure, e.g.
    * `http://my.zoomify.info/IMAGE.TIF/`. A URL template must include
    * `{TileGroup}`, `{x}`, `{y}`, and `{z}` placeholders, e.g.
    * `http://my.zoomify.info/IMAGE.TIF/{TileGroup}/{z}-{x}-{y}.jpg`.
    * Internet Imaging Protocol (IIP) with JTL extension can be also used with
    * `{tileIndex}` and `{z}` placeholders, e.g.
    * `http://my.zoomify.info?FIF=IMAGE.TIF&JTL={z},{tileIndex}`.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {TierSizeCalculation} [tierSizeCalculation] Tier size calculation method: `default` or `truncated`.
    * @property {import("../size.js").Size} size Size.
    * @property {import("../extent.js").Extent} [extent] Extent for the TileGrid that is created.
    * Default sets the TileGrid in the
    * fourth quadrant, meaning extent is `[0, -height, width, 0]`. To change the
    * extent to the first quadrant (the default for OpenLayers 2) set the extent
    * as `[0, 0, width, height]`.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number} [tileSize=256] Tile size. Same tile size is used for all zoom levels.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format (both Zoomify and Internet
    * Imaging Protocol are supported).
    * @api
    */
  @JSImport("ol/source/Zoomify", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.sourceTileImageMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Zoomify", "CustomTile")
  @js.native
  open class CustomTile protected ()
    extends typings.ol.imageTileMod.default {
    /**
      * @param {import("../size.js").Size} tileSize Full tile size.
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("../TileState.js").default} state State.
      * @param {string} src Image source URI.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("../Tile.js").LoadFunction} tileLoadFunction Tile load function.
      * @param {import("../Tile.js").Options} [options] Tile options.
      */
    def this(
      tileSize: Size,
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileSize: Size,
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: Null,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileSize: Size,
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction,
      options: typings.ol.tileMod.Options
    ) = this()
    def this(
      tileSize: Size,
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: Null,
      tileLoadFunction: LoadFunction,
      options: typings.ol.tileMod.Options
    ) = this()
    
    /**
      * @type {import("../size.js").Size}
      */
    var tileSize_ : Size = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement}
      */
    /* private */ var zoomifyImage_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images.  Note that
      * you must provide a `crossOrigin` value  you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Extent for the TileGrid that is created.
      * Default sets the TileGrid in the
      * fourth quadrant, meaning extent is `[0, -height, width, 0]`. To change the
      * extent to the first quadrant (the default for OpenLayers 2) set the extent
      * as `[0, 0, width, height]`.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
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
      * Size.
      */
    var size: Size
    
    /**
      * Tier size calculation method: `default` or `truncated`.
      */
    var tierSizeCalculation: js.UndefOr[TierSizeCalculation] = js.undefined
    
    /**
      * The pixel ratio used by the tile service. For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px by 512px images (for retina/hidpi devices) then `tilePixelRatio` should be set to `2`
      */
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Tile size. Same tile size is used for all zoom levels.
      */
    var tileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * URL template or base URL of the Zoomify service.
      * A base URL is the fixed part
      * of the URL, excluding the tile group, z, x, and y folder structure, e.g.
      * `http://my.zoomify.info/IMAGE.TIF/`. A URL template must include
      * `{TileGroup}`, `{x}`, `{y}`, and `{z}` placeholders, e.g.
      * `http://my.zoomify.info/IMAGE.TIF/{TileGroup}/{z}-{x}-{y}.jpg`.
      * Internet Imaging Protocol (IIP) with JTL extension can be also used with
      * `{tileIndex}` and `{z}` placeholders, e.g.
      * `http://my.zoomify.info?FIF=IMAGE.TIF&JTL={z},{tileIndex}`.
      * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
      * used instead of defining each one separately in the `urls` option.
      */
    var url: String
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(size: Size, url: String): Options = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setTierSizeCalculation(value: TierSizeCalculation): Self = StObject.set(x, "tierSizeCalculation", value.asInstanceOf[js.Any])
      
      inline def setTierSizeCalculationUndefined: Self = StObject.set(x, "tierSizeCalculation", js.undefined)
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.default_
    - typings.ol.olStrings.truncated
  */
  trait TierSizeCalculation extends StObject
  object TierSizeCalculation {
    
    inline def default: default_ = "default".asInstanceOf[default_]
    
    inline def truncated: typings.ol.olStrings.truncated = "truncated".asInstanceOf[typings.ol.olStrings.truncated]
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value  you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {number} [tilePixelRatio] The pixel ratio used by the tile service. For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px by 512px images (for retina/hidpi devices) then `tilePixelRatio` should be set to `2`
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {string} url URL template or base URL of the Zoomify service.
    * A base URL is the fixed part
    * of the URL, excluding the tile group, z, x, and y folder structure, e.g.
    * `http://my.zoomify.info/IMAGE.TIF/`. A URL template must include
    * `{TileGroup}`, `{x}`, `{y}`, and `{z}` placeholders, e.g.
    * `http://my.zoomify.info/IMAGE.TIF/{TileGroup}/{z}-{x}-{y}.jpg`.
    * Internet Imaging Protocol (IIP) with JTL extension can be also used with
    * `{tileIndex}` and `{z}` placeholders, e.g.
    * `http://my.zoomify.info?FIF=IMAGE.TIF&JTL={z},{tileIndex}`.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {TierSizeCalculation} [tierSizeCalculation] Tier size calculation method: `default` or `truncated`.
    * @property {import("../size.js").Size} size Size.
    * @property {import("../extent.js").Extent} [extent] Extent for the TileGrid that is created.
    * Default sets the TileGrid in the
    * fourth quadrant, meaning extent is `[0, -height, width, 0]`. To change the
    * extent to the first quadrant (the default for OpenLayers 2) set the extent
    * as `[0, 0, width, height]`.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number} [tileSize=256] Tile size. Same tile size is used for all zoom levels.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format (both Zoomify and Internet
    * Imaging Protocol are supported).
    * @api
    */
  type Zoomify = typings.ol.sourceTileImageMod.default
}
