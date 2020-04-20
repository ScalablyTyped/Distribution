package typings.nodeForge.mod.pki.rsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: PrivateKey
  var publicKey: PublicKey
}

object KeyPair {
  @scala.inline
  def apply(privateKey: PrivateKey, publicKey: PublicKey): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
}

