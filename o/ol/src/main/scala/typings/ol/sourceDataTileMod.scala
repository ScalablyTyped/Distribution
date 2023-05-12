package typings.ol

import typings.ol.dataTileMod.Data
import typings.ol.layerWebGLTileMod.SourceType
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceSourceMod.State
import typings.ol.viewMod.ViewStateAndExtent
import typings.ol.webglTileTextureMod.TileType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataTileMod {
  
  /**
    * Data tile loading function.  The function is called with z, x, and y tile coordinates and
    * returns {@link import("../DataTile.js").Data data} for a tile or a promise for the same.
    * @typedef {function(number, number, number) : (import("../DataTile.js").Data|Promise<import("../DataTile.js").Data>)} Loader
    */
  /**
    * @typedef {Object} Options
    * @property {Loader} [loader] Data loader.  Called with z, x, and y tile coordinates.
    * Returns {@link import("../DataTile.js").Data data} for a tile or a promise for the same.
    * For loaders that generate images, the promise should not resolve until the image is loaded.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [maxZoom=42] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom=0] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The pixel width and height of the source tiles.
    * This may be different than the rendered pixel size if a `tileGrid` is provided.
    * @property {number} [gutter=0] The size in pixels of the gutter around data tiles to ignore.
    * This allows artifacts of rendering at tile edges to be ignored.
    * Supported data should be wider and taller than the tile size by a value of `2 x gutter`.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Tile projection.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("./Source.js").State} [state] The source state.
    * @property {boolean} [wrapX=false] Render tiles beyond the antimeridian.
    * @property {number} [transition] Transition time when fading in new tiles (in miliseconds).
    * @property {number} [bandCount=4] Number of bands represented in the data.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * A source for typed array data tiles.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @JSImport("ol/source/DataTile", JSImport.Default)
  @js.native
  open class default protected ()
    extends DataTileSource
       with SourceType
       with TileType {
    /**
      * @param {Options} options DataTile source options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * Data tile loading function.  The function is called with z, x, and y tile coordinates and
    * returns {@link import("../DataTile.js").Data data} for a tile or a promise for the same.
    * @typedef {function(number, number, number) : (import("../DataTile.js").Data|Promise<import("../DataTile.js").Data>)} Loader
    */
  /**
    * @typedef {Object} Options
    * @property {Loader} [loader] Data loader.  Called with z, x, and y tile coordinates.
    * Returns {@link import("../DataTile.js").Data data} for a tile or a promise for the same.
    * For loaders that generate images, the promise should not resolve until the image is loaded.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [maxZoom=42] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom=0] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The pixel width and height of the source tiles.
    * This may be different than the rendered pixel size if a `tileGrid` is provided.
    * @property {number} [gutter=0] The size in pixels of the gutter around data tiles to ignore.
    * This allows artifacts of rendering at tile edges to be ignored.
    * Supported data should be wider and taller than the tile size by a value of `2 x gutter`.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Tile projection.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("./Source.js").State} [state] The source state.
    * @property {boolean} [wrapX=false] Render tiles beyond the antimeridian.
    * @property {number} [transition] Transition time when fading in new tiles (in miliseconds).
    * @property {number} [bandCount=4] Number of bands represented in the data.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * A source for typed array data tiles.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @js.native
  trait DataTileSource
    extends typings.ol.sourceTileMod.default {
    
    /**
      * @type {number}
      */
    var bandCount: Double = js.native
    
    /**
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @param {import("../proj/Projection.js").default} targetProj The output projection.
      * @param {import("../proj/Projection.js").default} sourceProj The input projection.
      * @return {!DataTile} Tile.
      */
    def getReprojTile_(
      z: Double,
      x: Double,
      y: Double,
      targetProj: typings.ol.projProjectionMod.default,
      sourceProj: typings.ol.projProjectionMod.default
    ): typings.ol.dataTileMod.default = js.native
    
    /**
      * Get the source tile size at the given zoom level.  This may be different than the rendered tile
      * size.
      * @protected
      * @param {number} z Tile zoom level.
      * @return {import('../size.js').Size} The source tile size.
      */
    /* protected */ def getTileSize(z: Double): Size = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var gutter_ : Any = js.native
    
    /**
      * Handle tile change events.
      * @param {import("../events/Event.js").default} event Event.
      */
    def handleTileChange_(event: typings.ol.eventsEventMod.default): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var loader_ : Any = js.native
    
    /**
      * @param {Loader} loader The data loader.
      * @protected
      */
    /* protected */ def setLoader(loader: Loader): Unit = js.native
    
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
      * Set the source tile sizes.  The length of the array is expected to match the number of
      * levels in the tile grid.
      * @protected
      * @param {Array<import('../size.js').Size>} tileSizes An array of tile sizes.
      */
    /* protected */ def setTileSizes(tileSizes: js.Array[Size]): Unit = js.native
    
    /**
      * @private
      * @type {!Object<string, import("../TileCache.js").default>}
      */
    /* private */ var tileCacheForProjection_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string, import("../tilegrid/TileGrid.js").default>}
      */
    /* private */ var tileGridForProjection_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string, boolean>}
      */
    /* private */ var tileLoadingKeys_ : Any = js.native
    
    /**
      * @private
      * @type {import('../size.js').Size|null}
      */
    /* private */ var tileSize_ : Any = js.native
    
    /**
      * @private
      * @type {Array<import('../size.js').Size>|null}
      */
    /* private */ var tileSizes_ : Any = js.native
  }
  
  type Loader = js.Function3[/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double, Data | js.Promise[Data]]
  
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
      * Number of bands represented in the data.
      */
    var bandCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The size in pixels of the gutter around data tiles to ignore.
      * This allows artifacts of rendering at tile edges to be ignored.
      * Supported data should be wider and taller than the tile size by a value of `2 x gutter`.
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * the nearest neighbor is used when resampling.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Data loader.  Called with z, x, and y tile coordinates.
      * Returns {@link import ("../DataTile.js").Data data} for a tile or a promise for the same.
      * For loaders that generate images, the promise should not resolve until the image is loaded.
      */
    var loader: js.UndefOr[Loader] = js.undefined
    
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
      * Tile projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * The source state.
      */
    var state: js.UndefOr[State] = js.undefined
    
    /**
      * Tile grid.
      */
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    /**
      * The pixel width and height of the source tiles.
      * This may be different than the rendered pixel size if a `tileGrid` is provided.
      */
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Transition time when fading in new tiles (in miliseconds).
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * Render tiles beyond the antimeridian.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setBandCount(value: Double): Self = StObject.set(x, "bandCount", value.asInstanceOf[js.Any])
      
      inline def setBandCountUndefined: Self = StObject.set(x, "bandCount", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLoader(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Data | js.Promise[Data]): Self = StObject.set(x, "loader", js.Any.fromFunction3(value))
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
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
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizeVarargs(value: Double*): Self = StObject.set(x, "tileSize", js.Array(value*))
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
