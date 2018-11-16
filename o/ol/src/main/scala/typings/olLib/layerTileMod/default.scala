package typings
package olLib.layerTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * For layer sources that provide pre-rendered, tiled images in grids that are
     * organized by zoom levels for specific resolutions.
     * Note that any property set in the options is set as a {@link ol.Object}
     * property on the layer object; for example, setting `title: 'My Title'` in the
     * options means that `title` is observable, and has get/set accessors.
     *
     * @fires ol.render.Event
     * @param opt_options Tile layer options.
     * @api stable
     */
@JSImport("ol/layer/tile", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.layerNs.Tile {
  /**
           * @classdesc
           * For layer sources that provide pre-rendered, tiled images in grids that are
           * organized by zoom levels for specific resolutions.
           * Note that any property set in the options is set as a {@link ol.Object}
           * property on the layer object; for example, setting `title: 'My Title'` in the
           * options means that `title` is observable, and has get/set accessors.
           *
           * @fires ol.render.Event
           * @param opt_options Tile layer options.
           * @api stable
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.TileOptions) = this()
}

