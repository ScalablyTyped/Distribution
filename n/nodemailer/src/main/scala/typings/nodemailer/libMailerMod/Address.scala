package typings.nodemailer.libMailerMod

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
    val __obj = js.Dynamic.literal(address = address, name = name)
  
    __obj.asInstanceOf[Address]
  }
}

