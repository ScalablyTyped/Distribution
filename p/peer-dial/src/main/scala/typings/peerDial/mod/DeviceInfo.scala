package typings.peerDial.mod

import typings.peerDial.AnonIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  var UDN: String
  var applicationUrl: String
  var descriptionUrl: String
  var deviceType: String
  var friendlyName: String
  var iconList: js.Array[js.Object] | AnonIcon
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
    iconList: js.Array[js.Object] | AnonIcon,
    manufacturer: String,
    modelName: String
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], applicationUrl = applicationUrl.asInstanceOf[js.Any], descriptionUrl = descriptionUrl.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], iconList = iconList.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
}

