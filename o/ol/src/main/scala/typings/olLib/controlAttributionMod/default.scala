package typings
package olLib.controlAttributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Control to show all the attributions associated with the layer sources
  * in the map. This control is one of the default controls included in maps.
  * By default it will show in the bottom right portion of the map, but this can
  * be changed by using a css selector for `.ol-attribution`.
  *
  * @param opt_options Attribution options.
  * @api stable
  */
@JSImport("ol/control/attribution", JSImport.Default)
@js.native
/**
  * @classdesc
  * Control to show all the attributions associated with the layer sources
  * in the map. This control is one of the default controls included in maps.
  * By default it will show in the bottom right portion of the map, but this can
  * be changed by using a css selector for `.ol-attribution`.
  *
  * @param opt_options Attribution options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.controlNs.Attribution {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.AttributionOptions) = this()
}

/* static members */
@JSImport("ol/control/attribution", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Update the attribution element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
}

