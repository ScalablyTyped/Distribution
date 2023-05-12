package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegridWmtsMod {
  
  @JSImport("ol/tilegrid/WMTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {import("../extent.js").Extent} [extent] Extent for the tile grid. No tiles
    * outside this extent will be requested by {@link module:ol/source/Tile~TileSource} sources.
    * When no `origin` or `origins` are configured, the `origin` will be set to the
    * top-left corner of the extent.
    * @property {import("../coordinate.js").Coordinate} [origin] The tile grid origin, i.e.
    * where the `x` and `y` axes meet (`[z, 0, 0]`). Tile coordinates increase left
    * to right and downwards. If not specified, `extent` or `origins` must be provided.
    * @property {Array<import("../coordinate.js").Coordinate>} [origins] Tile grid origins,
    * i.e. where the `x` and `y` axes meet (`[z, 0, 0]`), for each zoom level. If
    * given, the array length should match the length of the `resolutions` array, i.e.
    * each resolution can have a different origin. Tile coordinates increase left to
    * right and downwards. If not specified, `extent` or `origin` must be provided.
    * @property {!Array<number>} resolutions Resolutions. The array index of each
    * resolution needs to match the zoom level. This means that even if a `minZoom`
    * is configured, the resolutions array will have a length of `maxZoom + 1`
    * @property {!Array<string>} matrixIds matrix IDs. The length of this array needs
    * to match the length of the `resolutions` array.
    * @property {Array<import("../size.js").Size>} [sizes] Number of tile rows and columns
    * of the grid for each zoom level. The values here are the `TileMatrixWidth` and
    * `TileMatrixHeight` advertised in the GetCapabilities response of the WMTS, and
    * define each zoom level's extent together with the `origin` or `origins`.
    * A grid `extent` can be configured in addition, and will further limit the extent for
    * which tile requests are made by sources. If the bottom-left corner of
    * an extent is used as `origin` or `origins`, then the `y` value must be
    * negative because OpenLayers tile coordinates use the top left as the origin.
    * @property {number|import("../size.js").Size} [tileSize] Tile size.
    * @property {Array<number|import("../size.js").Size>} [tileSizes] Tile sizes. The length of
    * this array needs to match the length of the `resolutions` array.
    */
  /**
    * @classdesc
    * Set the grid pattern for sources accessing WMTS tiled-image servers.
    * @api
    */
  @JSImport("ol/tilegrid/WMTS", JSImport.Default)
  @js.native
  open class default protected () extends WMTSTileGrid {
    /**
      * @param {Options} options WMTS options.
      */
    def this(options: Options) = this()
  }
  
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any): WMTSTileGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any]).asInstanceOf[WMTSTileGrid]
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any, extent: Unit, matrixLimits: js.Array[Any]): WMTSTileGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], matrixLimits.asInstanceOf[js.Any])).asInstanceOf[WMTSTileGrid]
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any, extent: Extent): WMTSTileGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[WMTSTileGrid]
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any, extent: Extent, matrixLimits: js.Array[Any]): WMTSTileGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], matrixLimits.asInstanceOf[js.Any])).asInstanceOf[WMTSTileGrid]
  
  trait Options extends StObject {
    
    /**
      * Extent for the tile grid. No tiles
      * outside this extent will be requested by {@link module :ol/source/Tile~TileSource} sources.
      * When no `origin` or `origins` are configured, the `origin` will be set to the
      * top-left corner of the extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * matrix IDs. The length of this array needs
      * to match the length of the `resolutions` array.
      */
    var matrixIds: js.Array[String]
    
    /**
      * The tile grid origin, i.e.
      * where the `x` and `y` axes meet (`[z, 0, 0]`). Tile coordinates increase left
      * to right and downwards. If not specified, `extent` or `origins` must be provided.
      */
    var origin: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * Tile grid origins,
      * i.e. where the `x` and `y` axes meet (`[z, 0, 0]`), for each zoom level. If
      * given, the array length should match the length of the `resolutions` array, i.e.
      * each resolution can have a different origin. Tile coordinates increase left to
      * right and downwards. If not specified, `extent` or `origin` must be provided.
      */
    var origins: js.UndefOr[js.Array[Coordinate]] = js.undefined
    
    /**
      * Resolutions. The array index of each
      * resolution needs to match the zoom level. This means that even if a `minZoom`
      * is configured, the resolutions array will have a length of `maxZoom + 1`
      */
    var resolutions: js.Array[Double]
    
    /**
      * Number of tile rows and columns
      * of the grid for each zoom level. The values here are the `TileMatrixWidth` and
      * `TileMatrixHeight` advertised in the GetCapabilities response of the WMTS, and
      * define each zoom level's extent together with the `origin` or `origins`.
      * A grid `extent` can be configured in addition, and will further limit the extent for
      * which tile requests are made by sources. If the bottom-left corner of
      * an extent is used as `origin` or `origins`, then the `y` value must be
      * negative because OpenLayers tile coordinates use the top left as the origin.
      */
    var sizes: js.UndefOr[js.Array[Size]] = js.undefined
    
    /**
      * Tile size.
      */
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Tile sizes. The length of
      * this array needs to match the length of the `resolutions` array.
      */
    var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.undefined
  }
  object Options {
    
    inline def apply(matrixIds: js.Array[String], resolutions: js.Array[Double]): Options = {
      val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setMatrixIds(value: js.Array[String]): Self = StObject.set(x, "matrixIds", value.asInstanceOf[js.Any])
      
      inline def setMatrixIdsVarargs(value: String*): Self = StObject.set(x, "matrixIds", js.Array(value*))
      
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
    * @property {import("../extent.js").Extent} [extent] Extent for the tile grid. No tiles
    * outside this extent will be requested by {@link module:ol/source/Tile~TileSource} sources.
    * When no `origin` or `origins` are configured, the `origin` will be set to the
    * top-left corner of the extent.
    * @property {import("../coordinate.js").Coordinate} [origin] The tile grid origin, i.e.
    * where the `x` and `y` axes meet (`[z, 0, 0]`). Tile coordinates increase left
    * to right and downwards. If not specified, `extent` or `origins` must be provided.
    * @property {Array<import("../coordinate.js").Coordinate>} [origins] Tile grid origins,
    * i.e. where the `x` and `y` axes meet (`[z, 0, 0]`), for each zoom level. If
    * given, the array length should match the length of the `resolutions` array, i.e.
    * each resolution can have a different origin. Tile coordinates increase left to
    * right and downwards. If not specified, `extent` or `origin` must be provided.
    * @property {!Array<number>} resolutions Resolutions. The array index of each
    * resolution needs to match the zoom level. This means that even if a `minZoom`
    * is configured, the resolutions array will have a length of `maxZoom + 1`
    * @property {!Array<string>} matrixIds matrix IDs. The length of this array needs
    * to match the length of the `resolutions` array.
    * @property {Array<import("../size.js").Size>} [sizes] Number of tile rows and columns
    * of the grid for each zoom level. The values here are the `TileMatrixWidth` and
    * `TileMatrixHeight` advertised in the GetCapabilities response of the WMTS, and
    * define each zoom level's extent together with the `origin` or `origins`.
    * A grid `extent` can be configured in addition, and will further limit the extent for
    * which tile requests are made by sources. If the bottom-left corner of
    * an extent is used as `origin` or `origins`, then the `y` value must be
    * negative because OpenLayers tile coordinates use the top left as the origin.
    * @property {number|import("../size.js").Size} [tileSize] Tile size.
    * @property {Array<number|import("../size.js").Size>} [tileSizes] Tile sizes. The length of
    * this array needs to match the length of the `resolutions` array.
    */
  /**
    * @classdesc
    * Set the grid pattern for sources accessing WMTS tiled-image servers.
    * @api
    */
  @js.native
  trait WMTSTileGrid
    extends typings.ol.tilegridTileGridMod.default {
    
    /**
      * @param {number} z Z.
      * @return {string} MatrixId..
      */
    def getMatrixId(z: Double): String = js.native
    
    /**
      * Get the list of matrix identifiers.
      * @return {Array<string>} MatrixIds.
      * @api
      */
    def getMatrixIds(): js.Array[String] = js.native
    
    /**
      * @private
      * @type {!Array<string>}
      */
    /* private */ var matrixIds_ : Any = js.native
  }
}
