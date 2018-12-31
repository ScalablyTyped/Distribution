package typings
package olLib.sourceTiledebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A pseudo tile source, which does not fetch tiles from a server, but renders
  * a grid outline for the tile grid/projection along with the coordinates for
  * each tile. See examples/canvas-tiles for an example.
  *
  * Uses Canvas context2d, so requires Canvas support.
  *
  * @param options Debug tile options.
  * @api
  */
@JSImport("ol/source/tiledebug", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.sourceNs.TileDebug {
  /**
    * @classdesc
    * A pseudo tile source, which does not fetch tiles from a server, but renders
    * a grid outline for the tile grid/projection along with the coordinates for
    * each tile. See examples/canvas-tiles for an example.
    *
    * Uses Canvas context2d, so requires Canvas support.
    *
    * @param options Debug tile options.
    * @api
    */
  def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.TileDebugOptions) = this()
}

