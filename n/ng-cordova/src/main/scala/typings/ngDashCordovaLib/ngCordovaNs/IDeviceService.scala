package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceService extends js.Object {
  /**
  		* Returns the Cordova version.
  		* @see https://github.com/apache/cordova-plugin-device#devicecordova
  		* @returns {String} The Cordova version.
  		*/
  def getCordova(): java.lang.String
  /**
  		* Returns the whole device object.
  		* @see https://github.com/apache/cordova-plugin-device
  		* @returns {Object} The device object.
  		*/
  def getDevice(): IDeviceInfo
  /**
  		* Returns the device manufacturer.
  		* @returns {String}
  		*/
  def getManufacturer(): java.lang.String
  /**
  		* Returns the name of the device's model or product.
  		* @see https://github.com/apache/cordova-plugin-device#devicemodel
  		* @returns {String} The name of the device's model or product.
  		*/
  def getModel(): java.lang.String
  /**
  		* @deprecated device.name is deprecated as of version 2.3.0. Use device.model instead.
  		* @returns {String}
  		*/
  def getName(): java.lang.String
  /**
  		* Returns the device's operating system name.
  		* @see https://github.com/apache/cordova-plugin-device#deviceplatform
  		* @returns {String} The device's operating system name.
  		*/
  def getPlatform(): java.lang.String
  /**
  		* Returns the device's Universally Unique Identifier.
  		* @see https://github.com/apache/cordova-plugin-device#deviceuuid
  		* @returns {String} The device's Universally Unique Identifier
  		*/
  def getUUID(): java.lang.String
  /**
  		* Returns the operating system version.
  		* @see https://github.com/apache/cordova-plugin-device#deviceversion
  		* @returns {String}
  		*/
  def getVersion(): java.lang.String
}

