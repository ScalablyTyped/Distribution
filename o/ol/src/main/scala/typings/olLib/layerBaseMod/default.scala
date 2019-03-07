package typings
package olLib.layerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Note that with `ol.layer.Base` and all its subclasses, any property set in
  * the options is set as a {@link ol.Object} property on the layer object, so
  * is observable, and has get/set accessors.
  *
  * @param options Layer options.
  * @api stable
  */
@JSImport("ol/layer/Base", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.layerNs.Base {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Note that with `ol.layer.Base` and all its subclasses, any property set in
    * the options is set as a {@link ol.Object} property on the layer object, so
    * is observable, and has get/set accessors.
    *
    * @param options Layer options.
    * @api stable
    */
  def this(options: openlayersLib.openlayersMod.olxNs.layerNs.BaseOptions) = this()
}

