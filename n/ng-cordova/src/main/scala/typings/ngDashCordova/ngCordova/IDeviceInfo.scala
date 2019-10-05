package typings.ngDashCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInfo extends js.Object {
  var available: Boolean
  var cordova: String
  var isVirtual: Boolean
  var manufacturer: String
  var model: String
  var platform: String
  var serial: String
  var uuid: String
  var version: String
}

object IDeviceInfo {
  @scala.inline
  def apply(
    available: Boolean,
    cordova: String,
    isVirtual: Boolean,
    manufacturer: String,
    model: String,
    platform: String,
    serial: String,
    uuid: String,
    version: String
  ): IDeviceInfo = {
    val __obj = js.Dynamic.literal(available = available, cordova = cordova, isVirtual = isVirtual, manufacturer = manufacturer, model = model, platform = platform, serial = serial, uuid = uuid, version = version)
  
    __obj.asInstanceOf[IDeviceInfo]
  }
}

