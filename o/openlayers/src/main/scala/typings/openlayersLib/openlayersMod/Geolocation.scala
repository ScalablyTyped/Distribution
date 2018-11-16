package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("openlayers", "Geolocation")
@js.native
class Geolocation () extends js.Object {
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
  def this(opt_options: openlayersLib.openlayersMod.olxNs.GeolocationOptions) = this()
  /**
       * Get the accuracy of the position in meters.
       * @return The accuracy of the position measurement in
       *     meters.
       * @observable
       * @api stable
       */
  def getAccuracy(): scala.Double = js.native
  /**
       * Get a geometry of the position accuracy.
       * @return A geometry of the position accuracy.
       * @observable
       * @api stable
       */
  def getAccuracyGeometry(): openlayersLib.openlayersMod.geomNs.Geometry = js.native
  /**
       * Get the altitude associated with the position.
       * @return The altitude of the position in meters above mean
       *     sea level.
       * @observable
       * @api stable
       */
  def getAltitude(): scala.Double = js.native
  /**
       * Get the altitude accuracy of the position.
       * @return The accuracy of the altitude measurement in
       *     meters.
       * @observable
       * @api stable
       */
  def getAltitudeAccuracy(): scala.Double = js.native
  /**
       * Get the heading as radians clockwise from North.
       * @return The heading of the device in radians from north.
       * @observable
       * @api stable
       */
  def getHeading(): scala.Double = js.native
  /**
       * Get the position of the device.
       * @return The current position of the device reported
       *     in the current projection.
       * @observable
       * @api stable
       */
  def getPosition(): Coordinate = js.native
  /**
       * Get the projection associated with the position.
       * @return The projection the position is
       *     reported in.
       * @observable
       * @api stable
       */
  def getProjection(): openlayersLib.openlayersMod.projNs.Projection = js.native
  /**
       * Get the speed in meters per second.
       * @return The instantaneous speed of the device in meters
       *     per second.
       * @observable
       * @api stable
       */
  def getSpeed(): scala.Double = js.native
  /**
       * Determine if the device location is being tracked.
       * @return The device location is being tracked.
       * @observable
       * @api stable
       */
  def getTracking(): scala.Boolean = js.native
  /**
       * Get the tracking options.
       * @see http://www.w3.org/TR/geolocation-API/#position-options
       * @return PositionOptions as defined by
       *     the [HTML5 Geolocation spec
       *     ](http://www.w3.org/TR/geolocation-API/#position_options_interface).
       * @observable
       * @api stable
       */
  def getTrackingOptions(): stdLib.PositionOptions = js.native
  /**
       * Set the projection to use for transforming the coordinates.
       * @param projection The projection the position is
       *     reported in.
       * @observable
       * @api stable
       */
  def setProjection(projection: openlayersLib.openlayersMod.projNs.Projection): scala.Unit = js.native
  /**
       * Enable or disable tracking.
       * @param tracking Enable tracking.
       * @observable
       * @api stable
       */
  def setTracking(tracking: scala.Boolean): scala.Unit = js.native
  /**
       * Set the tracking options.
       * @see http://www.w3.org/TR/geolocation-API/#position-options
       * @param options PositionOptions as defined by the
       *     [HTML5 Geolocation spec
       *     ](http://www.w3.org/TR/geolocation-API/#position_options_interface).
       * @observable
       * @api stable
       */
  def setTrackingOptions(options: stdLib.PositionOptions): scala.Unit = js.native
}

