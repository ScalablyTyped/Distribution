package typings.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientKey extends js.Object {
  var clientKey: String
  var csr: String
}

object ClientKey {
  @scala.inline
  def apply(clientKey: String, csr: String): ClientKey = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientKey]
  }
}

