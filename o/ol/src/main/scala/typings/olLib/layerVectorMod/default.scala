package typings
package olLib.layerVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Vector data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/layer/vector", JSImport.Default)
@js.native
/**
  * @classdesc
  * Vector data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.layerNs.Vector {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.VectorOptions) = this()
}

