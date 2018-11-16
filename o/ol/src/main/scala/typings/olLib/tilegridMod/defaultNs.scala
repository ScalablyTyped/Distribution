package typings
package olLib.tilegridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid", JSImport.Default)
@js.native
object defaultNs extends js.Object {
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
  class TileGrid protected ()
    extends openlayersLib.openlayersMod.tilegridNs.TileGrid {
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
  class WMTS protected ()
    extends openlayersLib.openlayersMod.tilegridNs.WMTS {
    /**
             * @classdesc
             * Set the grid pattern for sources accessing WMTS tiled-image servers.
             *
             * @param options WMTS options.
             * @struct
             * @api
             */
    def this(options: openlayersLib.openlayersMod.olxNs.tilegridNs.WMTSOptions) = this()
  }
  
  /**
       * Creates a tile grid with a standard XYZ tiling scheme.
       * @param opt_options Tile grid options.
       * @return Tile grid instance.
       * @api
       */
  def createXYZ(): openlayersLib.openlayersMod.tilegridNs.TileGrid = js.native
  /**
       * Creates a tile grid with a standard XYZ tiling scheme.
       * @param opt_options Tile grid options.
       * @return Tile grid instance.
       * @api
       */
  def createXYZ(opt_options: openlayersLib.openlayersMod.olxNs.tilegridNs.XYZOptions): openlayersLib.openlayersMod.tilegridNs.TileGrid = js.native
  /**
       * @classdesc
       * Set the grid pattern for sources accessing WMTS tiled-image servers.
       *
       * @param options WMTS options.
       * @struct
       * @api
       */
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
    /**
             * Create a tile grid from a WMTS capabilities matrix set.
             * @param matrixSet An object representing a matrixSet in the
             *     capabilities document.
             * @param opt_extent An optional extent to restrict the tile
             *     ranges the server provides.
             * @return WMTS tileGrid instance.
             * @api
             */
    def createFromCapabilitiesMatrixSet(
      matrixSet: openlayersLib.openlayersMod.GlobalObject,
      opt_extent: openlayersLib.openlayersMod.Extent
    ): openlayersLib.openlayersMod.tilegridNs.WMTS = js.native
  }
  
}

