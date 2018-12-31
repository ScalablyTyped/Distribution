package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/loadingstrategy", JSImport.Namespace)
@js.native
object loadingstrategyMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    /**
      * Strategy function for loading all features with a single request.
      * @param extent Extent.
      * @param resolution Resolution.
      * @return Extents.
      * @api
      */
    def all(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double): js.Array[openlayersLib.openlayersMod.Extent] = js.native
    /**
      * Strategy function for loading features based on the view's extent and
      * resolution.
      * @param extent Extent.
      * @param resolution Resolution.
      * @return Extents.
      * @api
      */
    def bbox(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double): js.Array[openlayersLib.openlayersMod.Extent] = js.native
    /**
      * Creates a strategy function for loading features based on a tile grid.
      * @param tileGrid Tile grid.
      * @return Loading strategy.
      * @api
      */
    def tile(tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid): js.Function2[
        /* extent */ openlayersLib.openlayersMod.Extent, 
        /* i */ scala.Double, 
        js.Array[openlayersLib.openlayersMod.Extent]
      ] = js.native
  }
  
}

