package typings
package olLib.tilegridWmtsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set the grid pattern for sources accessing WMTS tiled-image servers.
  *
  * @param options WMTS options.
  * @struct
  * @api
  */
@JSImport("ol/tilegrid/wmts", JSImport.Default)
@js.native
class default protected ()
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
  * @classdesc
  * Set the grid pattern for sources accessing WMTS tiled-image servers.
  *
  * @param options WMTS options.
  * @struct
  * @api
  */
@JSImport("ol/tilegrid/wmts", JSImport.Default)
@js.native
object default extends js.Object {
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

