package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurePair extends js.Object {
  var cleartext: TLSSocket
  var encrypted: TLSSocket
}

object SecurePair {
  @scala.inline
  def apply(cleartext: TLSSocket, encrypted: TLSSocket): SecurePair = {
    val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurePair]
  }
}

