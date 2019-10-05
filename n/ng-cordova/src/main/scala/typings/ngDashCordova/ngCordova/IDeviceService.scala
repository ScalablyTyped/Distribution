package typings.ngDashCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceService extends js.Object {
  /**
  		* Returns the Cordova version.
  		* @see https://github.com/apache/cordova-plugin-device#devicecordova
  		* @returns {String} The Cordova version.
  		*/
  def getCordova(): String
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
  def getManufacturer(): String
  /**
  		* Returns the name of the device's model or product.
  		* @see https://github.com/apache/cordova-plugin-device#devicemodel
  		* @returns {String} The name of the device's model or product.
  		*/
  def getModel(): String
  /**
  		* @deprecated device.name is deprecated as of version 2.3.0. Use device.model instead.
  		* @returns {String}
  		*/
  def getName(): String
  /**
  		* Returns the device's operating system name.
  		* @see https://github.com/apache/cordova-plugin-device#deviceplatform
  		* @returns {String} The device's operating system name.
  		*/
  def getPlatform(): String
  /**
  		* Returns the device's Universally Unique Identifier.
  		* @see https://github.com/apache/cordova-plugin-device#deviceuuid
  		* @returns {String} The device's Universally Unique Identifier
  		*/
  def getUUID(): String
  /**
  		* Returns the operating system version.
  		* @see https://github.com/apache/cordova-plugin-device#deviceversion
  		* @returns {String}
  		*/
  def getVersion(): String
}

object IDeviceService {
  @scala.inline
  def apply(
    getCordova: () => String,
    getDevice: () => IDeviceInfo,
    getManufacturer: () => String,
    getModel: () => String,
    getName: () => String,
    getPlatform: () => String,
    getUUID: () => String,
    getVersion: () => String
  ): IDeviceService = {
    val __obj = js.Dynamic.literal(getCordova = js.Any.fromFunction0(getCordova), getDevice = js.Any.fromFunction0(getDevice), getManufacturer = js.Any.fromFunction0(getManufacturer), getModel = js.Any.fromFunction0(getModel), getName = js.Any.fromFunction0(getName), getPlatform = js.Any.fromFunction0(getPlatform), getUUID = js.Any.fromFunction0(getUUID), getVersion = js.Any.fromFunction0(getVersion))
  
    __obj.asInstanceOf[IDeviceService]
  }
}

