package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  var publicKey: typings.openpgp.mod.key.Key
  var publicKeyArmored: String
}

object PublicKey {
  @scala.inline
  def apply(publicKey: typings.openpgp.mod.key.Key, publicKeyArmored: String): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

