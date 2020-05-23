package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phone extends js.Object {
  var device: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object Phone {
  @scala.inline
  def apply(device: Boolean, phone: Boolean, tablet: Boolean): Phone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
}

