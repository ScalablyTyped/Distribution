package typings.nodemailer.mailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var name: String
}

object Address {
  @scala.inline
  def apply(address: String, name: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

