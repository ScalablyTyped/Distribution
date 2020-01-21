package typings.openpgp

import typings.openpgp.openpgpStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBinary extends js.Object {
  var format: binary
}

object AnonBinary {
  @scala.inline
  def apply(format: binary): AnonBinary = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBinary]
  }
}

