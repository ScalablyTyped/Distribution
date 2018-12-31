package typings
package olLib.geolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geolocation", JSImport.Default)
@js.native
/**
  * @classdesc
  * Helper class for providing HTML5 Geolocation capabilities.
  * The [Geolocation API](http://www.w3.org/TR/geolocation-API/)
  * is used to locate a user's position.
  *
  * To get notified of position changes, register a listener for the generic
  * `change` event on your instance of `ol.Geolocation`.
  *
  * Example:
  *
  *     var geolocation = new ol.Geolocation({
  *       // take the projection to use from the map's view
  *       projection: view.getProjection()
  *     });
  *     // listen to changes in position
  *     geolocation.on('change', function(evt) {
  *       window.console.log(geolocation.getPosition());
  *     });
  *
  * @fires error
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.Geolocation {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.GeolocationOptions) = this()
}

