package typings
package olLib.sourceVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Class for layer sources providing vector data divided into a tile grid, to be
  * used with {@link ol.layer.VectorTile}. Although this source receives tiles
  * with vector features from the server, it is not meant for feature editing.
  * Features are optimized for rendering, their geometries are clipped at or near
  * tile boundaries and simplified for a view resolution. See
  * {@link ol.source.Vector} for vector sources that are suitable for feature
  * editing.
  *
  * @fires ol.source.TileEvent
  * @param options Vector tile options.
  * @api
  */
@JSImport("ol/source/VectorTile", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.sourceNs.VectorTile {
  /**
    * @classdesc
    * Class for layer sources providing vector data divided into a tile grid, to be
    * used with {@link ol.layer.VectorTile}. Although this source receives tiles
    * with vector features from the server, it is not meant for feature editing.
    * Features are optimized for rendering, their geometries are clipped at or near
    * tile boundaries and simplified for a view resolution. See
    * {@link ol.source.Vector} for vector sources that are suitable for feature
    * editing.
    *
    * @fires ol.source.TileEvent
    * @param options Vector tile options.
    * @api
    */
  def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.VectorTileOptions) = this()
}

