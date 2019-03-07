package typings
package olLib.layerVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer for vector tile data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("ol/layer/VectorTile", JSImport.Default)
@js.native
/**
  * @classdesc
  * Layer for vector tile data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @param opt_options Options.
  * @api
  */
class default ()
  extends openlayersLib.openlayersMod.layerNs.VectorTile {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.VectorTileOptions) = this()
}

