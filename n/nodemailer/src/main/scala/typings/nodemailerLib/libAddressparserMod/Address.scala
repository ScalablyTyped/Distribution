package typings
package nodemailerLib.libAddressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: java.lang.String
  var name: java.lang.String
}

object Address {
  @scala.inline
  def apply(address: java.lang.String, name: java.lang.String): Address = {
    val __obj = js.Dynamic.literal(address = address, name = name)
  
    __obj.asInstanceOf[Address]
  }
}

