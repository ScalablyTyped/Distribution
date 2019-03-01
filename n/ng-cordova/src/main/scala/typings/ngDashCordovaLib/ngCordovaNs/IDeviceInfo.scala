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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("cordova")(cordova)
    __obj.updateDynamic("isVirtual")(isVirtual)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("serial")(serial)
    __obj.updateDynamic("uuid")(uuid)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IDeviceInfo]
  }
}

