package typings.openlayers.mod

import typings.openlayers.mod.olx.tilegrid.TileGridOptions
import typings.openlayers.mod.olx.tilegrid.WMTSOptions
import typings.openlayers.mod.olx.tilegrid.XYZOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegrid {
  
  @JSImport("openlayers", "tilegrid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Base class for setting the grid pattern for sources accessing tiled-image
    * servers.
    *
    * @param options Tile grid options.
    * @struct
    * @api stable
    */
  @JSImport("openlayers", "tilegrid.TileGrid")
  @js.native
  class TileGrid protected () extends StObject {
    /**
      * @classdesc
      * Base class for setting the grid pattern for sources accessing tiled-image
      * servers.
      *
      * @param options Tile grid options.
      * @struct
      * @api stable
      */
    def this(options: TileGridOptions) = this()
    
    /**
      * Call a function with each tile coordinate for a given extent and zoom level.
      *
      * @param extent Extent.
      * @param zoom Zoom level.
      * @param callback Function called with each tile coordinate.
      * @api
      */
    def forEachTileCoord(extent: Extent_, zoom: Double, callback: js.Function1[/* coords */ TileCoord, js.Any]): Unit = js.native
    
    /**
      * Get the maximum zoom level for the grid.
      * @return Max zoom.
      * @api
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Get the minimum zoom level for the grid.
      * @return Min zoom.
      * @api
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Get the origin for the grid at the given zoom level.
      * @param z Z.
      * @return Origin.
      * @api stable
      */
    def getOrigin(z: Double): Coordinate_ = js.native
    
    /**
      * Get the resolution for the given zoom level.
      * @param z Z.
      * @return Resolution.
      * @api stable
      */
    def getResolution(z: Double): Double = js.native
    
    /**
      * Get the list of resolutions for the tile grid.
      * @return Resolutions.
      * @api stable
      */
    def getResolutions(): js.Array[Double] = js.native
    
    /**
      * Get the extent of a tile coordinate.
      *
      * @param tileCoord Tile coordinate.
      * @param opt_extent Temporary extent object.
      * @return Extent.
      * @api
      */
    def getTileCoordExtent(tileCoord: TileCoord): Extent_ = js.native
    def getTileCoordExtent(tileCoord: TileCoord, opt_extent: Extent_): Extent_ = js.native
    
    /**
      * Get the tile coordinate for the given map coordinate and resolution.  This
      * method considers that coordinates that intersect tile boundaries should be
      * assigned the higher tile coordinate.
      *
      * @param coordinate Coordinate.
      * @param resolution Resolution.
      * @param opt_tileCoord Destination ol.TileCoord object.
      * @return Tile coordinate.
      * @api
      */
    def getTileCoordForCoordAndResolution(coordinate: Coordinate_, resolution: Double): TileCoord = js.native
    def getTileCoordForCoordAndResolution(coordinate: Coordinate_, resolution: Double, opt_tileCoord: TileCoord): TileCoord = js.native
    
    /**
      * Get a tile coordinate given a map coordinate and zoom level.
      * @param coordinate Coordinate.
      * @param z Zoom level.
      * @param opt_tileCoord Destination ol.TileCoord object.
      * @return Tile coordinate.
      * @api
      */
    def getTileCoordForCoordAndZ(coordinate: Coordinate_, z: Double): TileCoord = js.native
    def getTileCoordForCoordAndZ(coordinate: Coordinate_, z: Double, opt_tileCoord: TileCoord): TileCoord = js.native
    
    /**
      * Get the tile size for a zoom level. The type of the return value matches the
      * `tileSize` or `tileSizes` that the tile grid was configured with. To always
      * get an `ol.Size`, run the result through `ol.size.toSize()`.
      * @param z Z.
      * @return Tile size.
      * @api stable
      */
    def getTileSize(z: Double): Double | Size = js.native
    
    /**
      * @param resolution Resolution.
      * @param opt_direction If 0, the nearest resolution will be used.
      *     If 1, the nearest lower resolution will be used. If -1, the nearest
      *     higher resolution will be used. Default is 0.
      * @return Z.
      * @api
      */
    def getZForResolution(resolution: Double): Double = js.native
    def getZForResolution(resolution: Double, opt_direction: Double): Double = js.native
  }
  
  /**
    * @classdesc
    * Set the grid pattern for sources accessing WMTS tiled-image servers.
    *
    * @param options WMTS options.
    * @struct
    * @api
    */
  @JSImport("openlayers", "tilegrid.WMTS")
  @js.native
  class WMTS protected () extends TileGrid {
    /**
      * @classdesc
      * Set the grid pattern for sources accessing WMTS tiled-image servers.
      *
      * @param options WMTS options.
      * @struct
      * @api
      */
    def this(options: WMTSOptions) = this()
    
    /**
      * Get the list of matrix identifiers.
      * @return MatrixIds.
      * @api
      */
    def getMatrixIds(): js.Array[String] = js.native
  }
  object WMTS {
    
    @JSImport("openlayers", "tilegrid.WMTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a tile grid from a WMTS capabilities matrix set.
      * @param matrixSet An object representing a matrixSet in the
      *     capabilities document.
      * @param opt_extent An optional extent to restrict the tile
      *     ranges the server provides.
      * @return WMTS tileGrid instance.
      * @api
      */
    /* static member */
    inline def createFromCapabilitiesMatrixSet(matrixSet: GlobalObject): WMTS = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any]).asInstanceOf[WMTS]
    inline def createFromCapabilitiesMatrixSet(matrixSet: GlobalObject, opt_extent: Extent_): WMTS = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[WMTS]
  }
  
  /**
    * Creates a tile grid with a standard XYZ tiling scheme.
    * @param opt_options Tile grid options.
    * @return Tile grid instance.
    * @api
    */
  inline def createXYZ(): TileGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createXYZ")().asInstanceOf[TileGrid]
  inline def createXYZ(opt_options: XYZOptions): TileGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createXYZ")(opt_options.asInstanceOf[js.Any]).asInstanceOf[TileGrid]
}
