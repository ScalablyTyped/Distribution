package typings.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientKey extends js.Object {
  var clientKey: String
  var csr: String
}

object Anon_ClientKey {
  @scala.inline
  def apply(clientKey: String, csr: String): Anon_ClientKey = {
    val __obj = js.Dynamic.literal(clientKey = clientKey, csr = csr)
  
    __obj.asInstanceOf[Anon_ClientKey]
  }
}

