package typings.openlayers.global.ol

import typings.openlayers.mod.olx.GeolocationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Geolocation")
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
open class Geolocation ()
  extends typings.openlayers.mod.Geolocation {
  def this(opt_options: GeolocationOptions) = this()
}
