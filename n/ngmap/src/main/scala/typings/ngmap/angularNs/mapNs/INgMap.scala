package typings.ngmap.angularNs.mapNs

import typings.angular.angularMod.IPromise
import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.Map
import typings.std.HTMLElement
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgMap extends js.Object {
  def addMap(mapCtrl: js.Array[_]): Unit = js.native
  /**
    	 * Add map to pool
    	 * @param {Function | any[]} mapCtrl Map controller
    	 */
  def addMap(mapCtrl: js.Function): Unit = js.native
  /**
  		 * Delete map from pool
  		 * @param {Function | any[]} mapCtrl Map controller optional. Defaults to last
  		 * controller in pool
  		 */
  def deleteMap(): Unit = js.native
  def deleteMap(mapCtrl: js.Array[_]): Unit = js.native
  def deleteMap(mapCtrl: js.Function): Unit = js.native
  /**
  		 * Get map coordinates from address.
  		 * @param  {string}                               address Use 'current' to get users location
  		 * @param  {PositionOptions}                      options optional
  		 * @return {angular.IPromise<google.maps.LatLng>}         Latitude ang longitude of the address
  		 */
  def getGeoLocation(address: String): IPromise[LatLng] = js.native
  def getGeoLocation(address: String, options: PositionOptions): IPromise[LatLng] = js.native
  /**
    	 * Get map from the pool of all shown maps.
    	 * @param  {IGetMapOptions}                    options optional
    	 * @return {angular.IPromise<google.maps.Map>}         promise
    	 */
  def getMap(): IPromise[Map] = js.native
  def getMap(options: IGetMapOptions): IPromise[Map] = js.native
  /**
    * Initialize map from mapId or the current first shown map
    * @param  {string}          mapId id of the map. default 0
    * @return {google.maps.Map}       map
    */
  def initMap(): Map = js.native
  def initMap(mapId: String): Map = js.native
  /**
    * Observe attribute
    * @param  {string}             attrName attribute name
    * @param  {Object}             object   a Google maps object to be changed
    * @return {IObserveAndSetFunc}          attribute obvserve function
    */
  def observeAndSet(attrName: String, `object`: js.Object): IObserveAndSetFunc = js.native
  /**
    * Set display, width, height of map container element
    * @param {HTMLElement} el map container element
    */
  def setStyle(el: HTMLElement): Unit = js.native
}

