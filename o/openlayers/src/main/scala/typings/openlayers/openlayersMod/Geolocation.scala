package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.geom.Geometry
import typings.openlayers.openlayersMod.olx.GeolocationOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Geolocation")
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
class Geolocation () extends Object {
  def this(opt_options: GeolocationOptions) = this()
  /**
    * Get the accuracy of the position in meters.
    * @return The accuracy of the position measurement in
    *     meters.
    * @observable
    * @api stable
    */
  def getAccuracy(): Double = js.native
  /**
    * Get a geometry of the position accuracy.
    * @return A geometry of the position accuracy.
    * @observable
    * @api stable
    */
  def getAccuracyGeometry(): Geometry = js.native
  /**
    * Get the altitude associated with the position.
    * @return The altitude of the position in meters above mean
    *     sea level.
    * @observable
    * @api stable
    */
  def getAltitude(): Double = js.native
  /**
    * Get the altitude accuracy of the position.
    * @return The accuracy of the altitude measurement in
    *     meters.
    * @observable
    * @api stable
    */
  def getAltitudeAccuracy(): Double = js.native
  /**
    * Get the heading as radians clockwise from North.
    * @return The heading of the device in radians from north.
    * @observable
    * @api stable
    */
  def getHeading(): Double = js.native
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
  def getProjection(): Projection = js.native
  /**
    * Get the speed in meters per second.
    * @return The instantaneous speed of the device in meters
    *     per second.
    * @observable
    * @api stable
    */
  def getSpeed(): Double = js.native
  /**
    * Determine if the device location is being tracked.
    * @return The device location is being tracked.
    * @observable
    * @api stable
    */
  def getTracking(): Boolean = js.native
  /**
    * Get the tracking options.
    * @see http://www.w3.org/TR/geolocation-API/#position-options
    * @return PositionOptions as defined by
    *     the [HTML5 Geolocation spec
    *     ](http://www.w3.org/TR/geolocation-API/#position_options_interface).
    * @observable
    * @api stable
    */
  def getTrackingOptions(): PositionOptions = js.native
  /**
    * Set the projection to use for transforming the coordinates.
    * @param projection The projection the position is
    *     reported in.
    * @observable
    * @api stable
    */
  def setProjection(projection: Projection): Unit = js.native
  /**
    * Enable or disable tracking.
    * @param tracking Enable tracking.
    * @observable
    * @api stable
    */
  def setTracking(tracking: Boolean): Unit = js.native
  /**
    * Set the tracking options.
    * @see http://www.w3.org/TR/geolocation-API/#position-options
    * @param options PositionOptions as defined by the
    *     [HTML5 Geolocation spec
    *     ](http://www.w3.org/TR/geolocation-API/#position_options_interface).
    * @observable
    * @api stable
    */
  def setTrackingOptions(options: PositionOptions): Unit = js.native
}

