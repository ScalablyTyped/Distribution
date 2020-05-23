package typings.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  var publicKey: String
}

object PublicKey {
  @scala.inline
  def apply(publicKey: String): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

