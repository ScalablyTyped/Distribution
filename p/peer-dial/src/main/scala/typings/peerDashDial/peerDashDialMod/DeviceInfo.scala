package typings.peerDashDial.peerDashDialMod

import typings.peerDashDial.Anon_Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  var UDN: String
  var applicationUrl: String
  var descriptionUrl: String
  var deviceType: String
  var friendlyName: String
  var iconList: js.Array[js.Object] | Anon_Icon
  var manufacturer: String
  var modelName: String
}

object DeviceInfo {
  @scala.inline
  def apply(
    UDN: String,
    applicationUrl: String,
    descriptionUrl: String,
    deviceType: String,
    friendlyName: String,
    iconList: js.Array[js.Object] | Anon_Icon,
    manufacturer: String,
    modelName: String
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(UDN = UDN, applicationUrl = applicationUrl, descriptionUrl = descriptionUrl, deviceType = deviceType, friendlyName = friendlyName, iconList = iconList.asInstanceOf[js.Any], manufacturer = manufacturer, modelName = modelName)
  
    __obj.asInstanceOf[DeviceInfo]
  }
}

