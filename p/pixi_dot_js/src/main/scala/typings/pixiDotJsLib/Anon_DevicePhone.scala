package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DevicePhone extends js.Object {
  var device: scala.Boolean
  var phone: scala.Boolean
  var tablet: scala.Boolean
}

object Anon_DevicePhone {
  @scala.inline
  def apply(device: scala.Boolean, phone: scala.Boolean, tablet: scala.Boolean): Anon_DevicePhone = {
    val __obj = js.Dynamic.literal(device = device, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Anon_DevicePhone]
  }
}

