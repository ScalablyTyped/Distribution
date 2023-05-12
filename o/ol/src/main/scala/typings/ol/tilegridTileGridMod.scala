package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegridTileGridMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../extent.js").Extent} [extent] Extent for the tile grid. No tiles outside this
    * extent will be requested by {@link module:ol/source/Tile~TileSource} sources. When no `origin` or
    * `origins` are configured, the `origin` will be set to the top-left corner of the extent.
    * @property {number} [minZoom=0] Minimum zoom.
    * @property {import("../coordinate.js").Coordinate} [origin] The tile grid origin, i.e. where the `x`
    * and `y` axes meet (`[z, 0, 0]`). Tile coordinates increase left to right and downwards. If not
    * specified, `extent` or `origins` must be provided.
    * @property {Array<import("../coordinate.js").Coordinate>} [origins] Tile grid origins, i.e. where
    * the `x` and `y` axes meet (`[z, 0, 0]`), for each zoom level. If given, the array length
    * should match the length of the `resolutions` array, i.e. each resolution can have a different
    * origin. Tile coordinates increase left to right and downwards. If not specified, `extent` or
    * `origin` must be provided.
    * @property {!Array<number>} resolutions Resolutions. The array index of each resolution needs
    * to match the zoom level. This means that even if a `minZoom` is configured, the resolutions
    * array will have a length of `maxZoom + 1`.
    * @property {Array<import("../size.js").Size>} [sizes] Number of tile rows and columns
    * of the grid for each zoom level. If specified the values
    * define each zoom level's extent together with the `origin` or `origins`.
    * A grid `extent` can be configured in addition, and will further limit the extent
    * for which tile requests are made by sources. If the bottom-left corner of
    * an extent is used as `origin` or `origins`, then the `y` value must be
    * negative because OpenLayers tile coordinates use the top left as the origin.
    * @property {number|import("../size.js").Size} [tileSize] Tile size.
    * Default is `[256, 256]`.
    * @property {Array<number|import("../size.js").Size>} [tileSizes] Tile sizes. If given, the array length
    * should match the length of the `resolutions` array, i.e. each resolution can have a different
    * tile size.
    */
  /**
    * @classdesc
    * Base class for setting the grid pattern for sources accessing tiled-image
    * servers.
    * @api
    */
  @JSImport("ol/tilegrid/TileGrid", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TileGrid {
    /**
      * @param {Options} options Tile grid options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Extent for the tile grid. No tiles outside this
      * extent will be requested by {@link module :ol/source/Tile~TileSource} sources. When no `origin` or
      * `origins` are configured, the `origin` will be set to the top-left corner of the extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Minimum zoom.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The tile grid origin, i.e. where the `x`
      * and `y` axes meet (`[z, 0, 0]`). Tile coordinates increase left to right and downwards. If not
      * specified, `extent` or `origins` must be provided.
      */
    var origin: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * Tile grid origins, i.e. where
      * the `x` and `y` axes meet (`[z, 0, 0]`), for each zoom level. If given, the array length
      * should match the length of the `resolutions` array, i.e. each resolution can have a different
      * origin. Tile coordinates increase left to right and downwards. If not specified, `extent` or
      * `origin` must be provided.
      */
    var origins: js.UndefOr[js.Array[Coordinate]] = js.undefined
    
    /**
      * Resolutions. The array index of each resolution needs
      * to match the zoom level. This means that even if a `minZoom` is configured, the resolutions
      * array will have a length of `maxZoom + 1`.
      */
    var resolutions: js.Array[Double]
    
    /**
      * Number of tile rows and columns
      * of the grid for each zoom level. If specified the values
      * define each zoom level's extent together with the `origin` or `origins`.
      * A grid `extent` can be configured in addition, and will further limit the extent
      * for which tile requests are made by sources. If the bottom-left corner of
      * an extent is used as `origin` or `origins`, then the `y` value must be
      * negative because OpenLayers tile coordinates use the top left as the origin.
      */
    var sizes: js.UndefOr[js.Array[Size]] = js.undefined
    
    /**
      * Tile size.
      * Default is `[256, 256]`.
      */
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Tile sizes. If given, the array length
      * should match the length of the `resolutions` array, i.e. each resolution can have a different
      * tile size.
      */
    var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.undefined
  }
  object Options {
    
    inline def apply(resolutions: js.Array[Double]): Options = {
      val __obj = js.Dynamic.literal(resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOrigin(value: Coordinate): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
      
      inline def setOrigins(value: js.Array[Coordinate]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: Coordinate*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizeVarargs(value: Double*): Self = StObject.set(x, "tileSize", js.Array(value*))
      
      inline def setTileSizes(value: js.Array[Double | Size]): Self = StObject.set(x, "tileSizes", value.asInstanceOf[js.Any])
      
      inline def setTileSizesUndefined: Self = StObject.set(x, "tileSizes", js.undefined)
      
      inline def setTileSizesVarargs(value: (Double | Size)*): Self = StObject.set(x, "tileSizes", js.Array(value*))
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../extent.js").Extent} [extent] Extent for the tile grid. No tiles outside this
    * extent will be requested by {@link module:ol/source/Tile~TileSource} sources. When no `origin` or
    * `origins` are configured, the `origin` will be set to the top-left corner of the extent.
    * @property {number} [minZoom=0] Minimum zoom.
    * @property {import("../coordinate.js").Coordinate} [origin] The tile grid origin, i.e. where the `x`
    * and `y` axes meet (`[z, 0, 0]`). Tile coordinates increase left to right and downwards. If not
    * specified, `extent` or `origins` must be provided.
    * @property {Array<import("../coordinate.js").Coordinate>} [origins] Tile grid origins, i.e. where
    * the `x` and `y` axes meet (`[z, 0, 0]`), for each zoom level. If given, the array length
    * should match the length of the `resolutions` array, i.e. each resolution can have a different
    * origin. Tile coordinates increase left to right and downwards. If not specified, `extent` or
    * `origin` must be provided.
    * @property {!Array<number>} resolutions Resolutions. The array index of each resolution needs
    * to match the zoom level. This means that even if a `minZoom` is configured, the resolutions
    * array will have a length of `maxZoom + 1`.
    * @property {Array<import("../size.js").Size>} [sizes] Number of tile rows and columns
    * of the grid for each zoom level. If specified the values
    * define each zoom level's extent together with the `origin` or `origins`.
    * A grid `extent` can be configured in addition, and will further limit the extent
    * for which tile requests are made by sources. If the bottom-left corner of
    * an extent is used as `origin` or `origins`, then the `y` value must be
    * negative because OpenLayers tile coordinates use the top left as the origin.
    * @property {number|import("../size.js").Size} [tileSize] Tile size.
    * Default is `[256, 256]`.
    * @property {Array<number|import("../size.js").Size>} [tileSizes] Tile sizes. If given, the array length
    * should match the length of the `resolutions` array, i.e. each resolution can have a different
    * tile size.
    */
  /**
    * @classdesc
    * Base class for setting the grid pattern for sources accessing tiled-image
    * servers.
    * @api
    */
  @js.native
  trait TileGrid extends StObject {
    
    /**
      * @param {!import("../extent.js").Extent} extent Extent for this tile grid.
      * @private
      */
    /* private */ var calculateTileRanges_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var extent_ : Any = js.native
    
    /**
      * Call a function with each tile coordinate for a given extent and zoom level.
      *
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} zoom Integer zoom level.
      * @param {function(import("../tilecoord.js").TileCoord): void} callback Function called with each tile coordinate.
      * @api
      */
    def forEachTileCoord(extent: Extent, zoom: Double, callback: js.Function1[/* arg0 */ TileCoord, Unit]): Unit = js.native
    
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {function(number, import("../TileRange.js").default): boolean} callback Callback.
      * @param {import("../TileRange.js").default} [tempTileRange] Temporary import("../TileRange.js").default object.
      * @param {import("../extent.js").Extent} [tempExtent] Temporary import("../extent.js").Extent object.
      * @return {boolean} Callback succeeded.
      */
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* arg0 */ Double, /* arg1 */ typings.ol.tileRangeMod.default, Boolean]
    ): Boolean = js.native
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* arg0 */ Double, /* arg1 */ typings.ol.tileRangeMod.default, Boolean],
      tempTileRange: Unit,
      tempExtent: Extent
    ): Boolean = js.native
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* arg0 */ Double, /* arg1 */ typings.ol.tileRangeMod.default, Boolean],
      tempTileRange: typings.ol.tileRangeMod.default
    ): Boolean = js.native
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* arg0 */ Double, /* arg1 */ typings.ol.tileRangeMod.default, Boolean],
      tempTileRange: typings.ol.tileRangeMod.default,
      tempExtent: Extent
    ): Boolean = js.native
    
    /**
      * @private
      * @type {Array<import("../TileRange.js").default>}
      */
    /* private */ var fullTileRanges_ : Any = js.native
    
    /**
      * Get the extent for this tile grid, if it was configured.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    def getExtent(): Extent = js.native
    
    /**
      * @param {number} z Zoom level.
      * @return {import("../TileRange.js").default} Extent tile range for the specified zoom level.
      */
    def getFullTileRange(z: Double): typings.ol.tileRangeMod.default = js.native
    
    /**
      * Get the maximum zoom level for the grid.
      * @return {number} Max zoom.
      * @api
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Get the minimum zoom level for the grid.
      * @return {number} Min zoom.
      * @api
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Get the origin for the grid at the given zoom level.
      * @param {number} z Integer zoom level.
      * @return {import("../coordinate.js").Coordinate} Origin.
      * @api
      */
    def getOrigin(z: Double): Coordinate = js.native
    
    /**
      * Get the resolution for the given zoom level.
      * @param {number} z Integer zoom level.
      * @return {number} Resolution.
      * @api
      */
    def getResolution(z: Double): Double = js.native
    
    /**
      * Get the list of resolutions for the tile grid.
      * @return {Array<number>} Resolutions.
      * @api
      */
    def getResolutions(): js.Array[Double] = js.native
    
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @return {import("../coordinate.js").Coordinate} Tile center.
      */
    def getTileCoordCenter(tileCoord: TileCoord): Coordinate = js.native
    
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("../TileRange.js").default} [tempTileRange] Temporary import("../TileRange.js").default object.
      * @param {import("../extent.js").Extent} [tempExtent] Temporary import("../extent.js").Extent object.
      * @return {import("../TileRange.js").default|null} Tile range.
      */
    def getTileCoordChildTileRange(tileCoord: TileCoord): typings.ol.tileRangeMod.default | Null = js.native
    def getTileCoordChildTileRange(tileCoord: TileCoord, tempTileRange: Unit, tempExtent: Extent): typings.ol.tileRangeMod.default | Null = js.native
    def getTileCoordChildTileRange(tileCoord: TileCoord, tempTileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default | Null = js.native
    def getTileCoordChildTileRange(tileCoord: TileCoord, tempTileRange: typings.ol.tileRangeMod.default, tempExtent: Extent): typings.ol.tileRangeMod.default | Null = js.native
    
    /**
      * Get the extent of a tile coordinate.
      *
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("../extent.js").Extent} [tempExtent] Temporary extent object.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    def getTileCoordExtent(tileCoord: TileCoord): Extent = js.native
    def getTileCoordExtent(tileCoord: TileCoord, tempExtent: Extent): Extent = js.native
    
    /**
      * Get the tile coordinate for the given map coordinate and resolution.  This
      * method considers that coordinates that intersect tile boundaries should be
      * assigned the higher tile coordinate.
      *
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {number} resolution Resolution.
      * @param {import("../tilecoord.js").TileCoord} [opt_tileCoord] Destination import("../tilecoord.js").TileCoord object.
      * @return {import("../tilecoord.js").TileCoord} Tile coordinate.
      * @api
      */
    def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double): TileCoord = js.native
    def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double, opt_tileCoord: TileCoord): TileCoord = js.native
    
    /**
      * Get a tile coordinate given a map coordinate and zoom level.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {number} z Zoom level.
      * @param {import("../tilecoord.js").TileCoord} [opt_tileCoord] Destination import("../tilecoord.js").TileCoord object.
      * @return {import("../tilecoord.js").TileCoord} Tile coordinate.
      * @api
      */
    def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double): TileCoord = js.native
    def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double, opt_tileCoord: TileCoord): TileCoord = js.native
    
    /**
      * Note that this method should not be called for resolutions that correspond
      * to an integer zoom level.  Instead call the `getTileCoordForXYAndZ_` method.
      * @param {number} x X.
      * @param {number} y Y.
      * @param {number} resolution Resolution (for a non-integer zoom level).
      * @param {boolean} reverseIntersectionPolicy Instead of letting edge
      *     intersections go to the higher tile coordinate, let edge intersections
      *     go to the lower tile coordinate.
      * @param {import("../tilecoord.js").TileCoord} [opt_tileCoord] Temporary import("../tilecoord.js").TileCoord object.
      * @return {import("../tilecoord.js").TileCoord} Tile coordinate.
      * @private
      */
    /* private */ var getTileCoordForXYAndResolution_ : Any = js.native
    
    /**
      * Although there is repetition between this method and `getTileCoordForXYAndResolution_`,
      * they should have separate implementations.  This method is for integer zoom
      * levels.  The other method should only be called for resolutions corresponding
      * to non-integer zoom levels.
      * @param {number} x Map x coordinate.
      * @param {number} y Map y coordinate.
      * @param {number} z Integer zoom level.
      * @param {boolean} reverseIntersectionPolicy Instead of letting edge
      *     intersections go to the higher tile coordinate, let edge intersections
      *     go to the lower tile coordinate.
      * @param {import("../tilecoord.js").TileCoord} [opt_tileCoord] Temporary import("../tilecoord.js").TileCoord object.
      * @return {import("../tilecoord.js").TileCoord} Tile coordinate.
      * @private
      */
    /* private */ var getTileCoordForXYAndZ_ : Any = js.native
    
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @return {number} Tile resolution.
      */
    def getTileCoordResolution(tileCoord: TileCoord): Double = js.native
    
    /**
      * Get the extent for a tile range.
      * @param {number} z Integer zoom level.
      * @param {import("../TileRange.js").default} tileRange Tile range.
      * @param {import("../extent.js").Extent} [tempExtent] Temporary import("../extent.js").Extent object.
      * @return {import("../extent.js").Extent} Extent.
      */
    def getTileRangeExtent(z: Double, tileRange: typings.ol.tileRangeMod.default): Extent = js.native
    def getTileRangeExtent(z: Double, tileRange: typings.ol.tileRangeMod.default, tempExtent: Extent): Extent = js.native
    
    /**
      * Get a tile range for the given extent and integer zoom level.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} z Integer zoom level.
      * @param {import("../TileRange.js").default} [tempTileRange] Temporary tile range object.
      * @return {import("../TileRange.js").default} Tile range.
      */
    def getTileRangeForExtentAndZ(extent: Extent, z: Double): typings.ol.tileRangeMod.default = js.native
    def getTileRangeForExtentAndZ(extent: Extent, z: Double, tempTileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default = js.native
    
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {number} z Integer zoom level.
      * @param {import("../TileRange.js").default} [tempTileRange] Temporary import("../TileRange.js").default object.
      * @return {import("../TileRange.js").default|null} Tile range.
      */
    def getTileRangeForTileCoordAndZ(tileCoord: TileCoord, z: Double): typings.ol.tileRangeMod.default | Null = js.native
    def getTileRangeForTileCoordAndZ(tileCoord: TileCoord, z: Double, tempTileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default | Null = js.native
    
    /**
      * Get the tile size for a zoom level. The type of the return value matches the
      * `tileSize` or `tileSizes` that the tile grid was configured with. To always
      * get an {@link import("../size.js").Size}, run the result through {@link module:ol/size.toSize}.
      * @param {number} z Z.
      * @return {number|import("../size.js").Size} Tile size.
      * @api
      */
    def getTileSize(z: Double): Double | Size = js.native
    
    /**
      * @param {number} resolution Resolution.
      * @param {number|import("../array.js").NearestDirectionFunction} [opt_direction]
      *     If 0, the nearest resolution will be used.
      *     If 1, the nearest higher resolution (lower Z) will be used. If -1, the
      *     nearest lower resolution (higher Z) will be used. Default is 0.
      *     Use a {@link module:ol/array~NearestDirectionFunction} for more precise control.
      *
      * For example to change tile Z at the midpoint of zoom levels
      * ```js
      * function(value, high, low) {
      *   return value - low * Math.sqrt(high / low);
      * }
      * ```
      * @return {number} Z.
      * @api
      */
    def getZForResolution(resolution: Double): Double = js.native
    def getZForResolution(resolution: Double, opt_direction: Double): Double = js.native
    def getZForResolution(resolution: Double, opt_direction: NearestDirectionFunction): Double = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var maxZoom: Double = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var minZoom: Double = js.native
    
    /**
      * @private
      * @type {import("../coordinate.js").Coordinate|null}
      */
    /* private */ var origin_ : Any = js.native
    
    /**
      * @private
      * @type {Array<import("../coordinate.js").Coordinate>}
      */
    /* private */ var origins_ : Any = js.native
    
    /**
      * @private
      * @type {!Array<number>}
      */
    /* private */ var resolutions_ : Any = js.native
    
    /**
      * The tile with the provided tile coordinate intersects the given viewport.
      * @param {import('../tilecoord.js').TileCoord} tileCoord Tile coordinate.
      * @param {Array<number>} viewport Viewport as returned from {@link module:ol/extent.getRotatedViewport}.
      * @return {boolean} The tile with the provided tile coordinate intersects the given viewport.
      */
    def tileCoordIntersectsViewport(tileCoord: TileCoord, viewport: js.Array[Double]): Boolean = js.native
    
    /**
      * @private
      * @type {number|import("../size.js").Size}
      */
    /* private */ var tileSize_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number|import("../size.js").Size>}
      */
    /* private */ var tileSizes_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var tmpExtent_ : Any = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size}
      */
    /* private */ var tmpSize_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var zoomFactor_ : Any = js.native
  }
}
