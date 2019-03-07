package typings
package olLib.layerHeatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer for rendering vector data as a heatmap.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api
  */
@JSImport("ol/layer/Heatmap", JSImport.Default)
@js.native
/**
  * @classdesc
  * Layer for rendering vector data as a heatmap.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api
  */
class default ()
  extends openlayersLib.openlayersMod.layerNs.Heatmap {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.HeatmapOptions) = this()
}

