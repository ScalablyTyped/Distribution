package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSignature extends js.Object {
  var data: String
  var signature: String
}

object AnonDataSignature {
  @scala.inline
  def apply(data: String, signature: String): AnonDataSignature = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataSignature]
  }
}

