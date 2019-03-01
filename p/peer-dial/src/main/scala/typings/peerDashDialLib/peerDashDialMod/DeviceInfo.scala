package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  var UDN: java.lang.String
  var applicationUrl: java.lang.String
  var descriptionUrl: java.lang.String
  var deviceType: java.lang.String
  var friendlyName: java.lang.String
  var iconList: js.Array[js.Object] | peerDashDialLib.Anon_Icon
  var manufacturer: java.lang.String
  var modelName: java.lang.String
}

object DeviceInfo {
  @scala.inline
  def apply(
    UDN: java.lang.String,
    applicationUrl: java.lang.String,
    descriptionUrl: java.lang.String,
    deviceType: java.lang.String,
    friendlyName: java.lang.String,
    iconList: js.Array[js.Object] | peerDashDialLib.Anon_Icon,
    manufacturer: java.lang.String,
    modelName: java.lang.String
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("UDN")(UDN)
    __obj.updateDynamic("applicationUrl")(applicationUrl)
    __obj.updateDynamic("descriptionUrl")(descriptionUrl)
    __obj.updateDynamic("deviceType")(deviceType)
    __obj.updateDynamic("friendlyName")(friendlyName)
    __obj.updateDynamic("iconList")(iconList.asInstanceOf[js.Any])
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("modelName")(modelName)
    __obj.asInstanceOf[DeviceInfo]
  }
}

