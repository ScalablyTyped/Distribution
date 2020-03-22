package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDevice extends js.Object {
  var device: Boolean
  var ipod: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object AnonDevice {
  @scala.inline
  def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean): AnonDevice = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDevice]
  }
}

