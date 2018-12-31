package typings
package olLib.layerImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Server-rendered images that are available for arbitrary extents and
  * resolutions.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Layer options.
  * @api stable
  */
@JSImport("ol/layer/image", JSImport.Default)
@js.native
/**
  * @classdesc
  * Server-rendered images that are available for arbitrary extents and
  * resolutions.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Layer options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.layerNs.Image {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.ImageOptions) = this()
}

