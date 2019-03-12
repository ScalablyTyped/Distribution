package typings
package ngmapLib.angularNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgMap extends js.Object {
  def addMap(mapCtrl: js.Array[_]): scala.Unit = js.native
  /**
    	 * Add map to pool
    	 * @param {Function | any[]} mapCtrl Map controller
    	 */
  def addMap(mapCtrl: js.Function): scala.Unit = js.native
  /**
  		 * Delete map from pool
  		 * @param {Function | any[]} mapCtrl Map controller optional. Defaults to last
  		 * controller in pool
  		 */
  def deleteMap(): scala.Unit = js.native
  def deleteMap(mapCtrl: js.Array[_]): scala.Unit = js.native
  def deleteMap(mapCtrl: js.Function): scala.Unit = js.native
  /**
  		 * Get map coordinates from address.
  		 * @param  {string}                               address Use 'current' to get users location
  		 * @param  {PositionOptions}                      options optional
  		 * @return {angular.IPromise<google.maps.LatLng>}         Latitude ang longitude of the address
  		 */
  def getGeoLocation(address: java.lang.String): angularLib.angularMod.angularNs.IPromise[googlemapsLib.googleNs.mapsNs.LatLng] = js.native
  def getGeoLocation(address: java.lang.String, options: stdLib.PositionOptions): angularLib.angularMod.angularNs.IPromise[googlemapsLib.googleNs.mapsNs.LatLng] = js.native
  /**
    	 * Get map from the pool of all shown maps.
    	 * @param  {IGetMapOptions}                    options optional
    	 * @return {angular.IPromise<google.maps.Map>}         promise
    	 */
  def getMap(): angularLib.angularMod.angularNs.IPromise[googlemapsLib.googleNs.mapsNs.Map] = js.native
  def getMap(options: IGetMapOptions): angularLib.angularMod.angularNs.IPromise[googlemapsLib.googleNs.mapsNs.Map] = js.native
  /**
    * Initialize map from mapId or the current first shown map
    * @param  {string}          mapId id of the map. default 0
    * @return {google.maps.Map}       map
    */
  def initMap(): googlemapsLib.googleNs.mapsNs.Map = js.native
  def initMap(mapId: java.lang.String): googlemapsLib.googleNs.mapsNs.Map = js.native
  /**
    * Observe attribute
    * @param  {string}             attrName attribute name
    * @param  {Object}             object   a Google maps object to be changed
    * @return {IObserveAndSetFunc}          attribute obvserve function
    */
  def observeAndSet(attrName: java.lang.String, `object`: js.Object): IObserveAndSetFunc = js.native
  /**
    * Set display, width, height of map container element
    * @param {HTMLElement} el map container element
    */
  def setStyle(el: stdLib.HTMLElement): scala.Unit = js.native
}

