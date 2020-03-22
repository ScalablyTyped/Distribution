package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhone extends js.Object {
  var device: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object AnonPhone {
  @scala.inline
  def apply(device: Boolean, phone: Boolean, tablet: Boolean): AnonPhone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPhone]
  }
}

