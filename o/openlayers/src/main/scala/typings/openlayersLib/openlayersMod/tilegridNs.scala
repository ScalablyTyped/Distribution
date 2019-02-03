package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "tilegrid")
@js.native
object tilegridNs extends js.Object {
  /**
    * @classdesc
    * Base class for setting the grid pattern for sources accessing tiled-image
    * servers.
    *
    * @param options Tile grid options.
    * @struct
    * @api stable
    */
  @js.native
  class TileGrid protected () extends js.Object {
    /**
      * @classdesc
      * Base class for setting the grid pattern for sources accessing tiled-image
      * servers.
      *
      * @param options Tile grid options.
      * @struct
      * @api stable
      */
    def this(options: openlayersLib.openlayersMod.olxNs.tilegridNs.TileGridOptions) = this()
    /**
      * Call a function with each tile coordinate for a given extent and zoom level.
      *
      * @param extent Extent.
      * @param zoom Zoom level.
      * @param callback Function called with each tile coordinate.
      * @api
      */
    def forEachTileCoord(
      extent: openlayersLib.openlayersMod.Extent,
      zoom: scala.Double,
      callback: js.Function1[/* coords */ openlayersLib.openlayersMod.TileCoord, _]
    ): scala.Unit = js.native
    /**
      * Get the maximum zoom level for the grid.
      * @return Max zoom.
      * @api
      */
    def getMaxZoom(): scala.Double = js.native
    /**
      * Get the minimum zoom level for the grid.
      * @return Min zoom.
      * @api
      */
    def getMinZoom(): scala.Double = js.native
    /**
      * Get the origin for the grid at the given zoom level.
      * @param z Z.
      * @return Origin.
      * @api stable
      */
    def getOrigin(z: scala.Double): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Get the resolution for the given zoom level.
      * @param z Z.
      * @return Resolution.
      * @api stable
      */
    def getResolution(z: scala.Double): scala.Double = js.native
    /**
      * Get the list of resolutions for the tile grid.
      * @return Resolutions.
      * @api stable
      */
    def getResolutions(): js.Array[scala.Double] = js.native
    /**
      * Get the extent of a tile coordinate.
      *
      * @param tileCoord Tile coordinate.
      * @param opt_extent Temporary extent object.
      * @return Extent.
      * @api
      */
    def getTileCoordExtent(tileCoord: openlayersLib.openlayersMod.TileCoord): openlayersLib.openlayersMod.Extent = js.native
    def getTileCoordExtent(tileCoord: openlayersLib.openlayersMod.TileCoord, opt_extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Extent = js.native
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
    def getTileCoordForCoordAndResolution(coordinate: openlayersLib.openlayersMod.Coordinate, resolution: scala.Double): openlayersLib.openlayersMod.TileCoord = js.native
    def getTileCoordForCoordAndResolution(
      coordinate: openlayersLib.openlayersMod.Coordinate,
      resolution: scala.Double,
      opt_tileCoord: openlayersLib.openlayersMod.TileCoord
    ): openlayersLib.openlayersMod.TileCoord = js.native
    /**
      * Get a tile coordinate given a map coordinate and zoom level.
      * @param coordinate Coordinate.
      * @param z Zoom level.
      * @param opt_tileCoord Destination ol.TileCoord object.
      * @return Tile coordinate.
      * @api
      */
    def getTileCoordForCoordAndZ(coordinate: openlayersLib.openlayersMod.Coordinate, z: scala.Double): openlayersLib.openlayersMod.TileCoord = js.native
    def getTileCoordForCoordAndZ(
      coordinate: openlayersLib.openlayersMod.Coordinate,
      z: scala.Double,
      opt_tileCoord: openlayersLib.openlayersMod.TileCoord
    ): openlayersLib.openlayersMod.TileCoord = js.native
    /**
      * Get the tile size for a zoom level. The type of the return value matches the
      * `tileSize` or `tileSizes` that the tile grid was configured with. To always
      * get an `ol.Size`, run the result through `ol.size.toSize()`.
      * @param z Z.
      * @return Tile size.
      * @api stable
      */
    def getTileSize(z: scala.Double): scala.Double | openlayersLib.openlayersMod.Size = js.native
    /**
      * @param resolution Resolution.
      * @param opt_direction If 0, the nearest resolution will be used.
      *     If 1, the nearest lower resolution will be used. If -1, the nearest
      *     higher resolution will be used. Default is 0.
      * @return Z.
      * @api
      */
    def getZForResolution(resolution: scala.Double): scala.Double = js.native
    def getZForResolution(resolution: scala.Double, opt_direction: scala.Double): scala.Double = js.native
  }
  
  /**
    * @classdesc
    * Set the grid pattern for sources accessing WMTS tiled-image servers.
    *
    * @param options WMTS options.
    * @struct
    * @api
    */
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
    def this(options: openlayersLib.openlayersMod.olxNs.tilegridNs.WMTSOptions) = this()
    /**
      * Get the list of matrix identifiers.
      * @return MatrixIds.
      * @api
      */
    def getMatrixIds(): js.Array[java.lang.String] = js.native
  }
  
  /**
    * Creates a tile grid with a standard XYZ tiling scheme.
    * @param opt_options Tile grid options.
    * @return Tile grid instance.
    * @api
    */
  def createXYZ(): TileGrid = js.native
  def createXYZ(opt_options: openlayersLib.openlayersMod.olxNs.tilegridNs.XYZOptions): TileGrid = js.native
  /* static members */
  @js.native
  object WMTS extends js.Object {
    /**
      * Create a tile grid from a WMTS capabilities matrix set.
      * @param matrixSet An object representing a matrixSet in the
      *     capabilities document.
      * @param opt_extent An optional extent to restrict the tile
      *     ranges the server provides.
      * @return WMTS tileGrid instance.
      * @api
      */
    def createFromCapabilitiesMatrixSet(matrixSet: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.tilegridNs.WMTS = js.native
    def createFromCapabilitiesMatrixSet(
      matrixSet: openlayersLib.openlayersMod.GlobalObject,
      opt_extent: openlayersLib.openlayersMod.Extent
    ): openlayersLib.openlayersMod.tilegridNs.WMTS = js.native
  }
  
}

