package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInfo extends js.Object {
  var available: scala.Boolean
  var cordova: java.lang.String
  var isVirtual: scala.Boolean
  var manufacturer: java.lang.String
  var model: java.lang.String
  var platform: java.lang.String
  var serial: java.lang.String
  var uuid: java.lang.String
  var version: java.lang.String
}

object IDeviceInfo {
  @scala.inline
  def apply(
    available: scala.Boolean,
    cordova: java.lang.String,
    isVirtual: scala.Boolean,
    manufacturer: java.lang.String,
    model: java.lang.String,
    platform: java.lang.String,
    serial: java.lang.String,
    uuid: java.lang.String,
    version: java.lang.String
  ): IDeviceInfo = {
    val __obj = js.Dynamic.literal(available = available, cordova = cordova, isVirtual = isVirtual, manufacturer = manufacturer, model = model, platform = platform, serial = serial, uuid = uuid, version = version)
  
    __obj.asInstanceOf[IDeviceInfo]
  }
}

