package typings.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientKey extends js.Object {
  var clientKey: String
  var csr: String
}

object AnonClientKey {
  @scala.inline
  def apply(clientKey: String, csr: String): AnonClientKey = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientKey]
  }
}

