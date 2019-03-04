package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: scala.Boolean
  var ipod: scala.Boolean
  var phone: scala.Boolean
  var tablet: scala.Boolean
}

object Anon_Device {
  @scala.inline
  def apply(device: scala.Boolean, ipod: scala.Boolean, phone: scala.Boolean, tablet: scala.Boolean): Anon_Device = {
    val __obj = js.Dynamic.literal(device = device, ipod = ipod, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Anon_Device]
  }
}

