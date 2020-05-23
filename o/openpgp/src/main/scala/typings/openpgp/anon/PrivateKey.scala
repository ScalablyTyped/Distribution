package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKey extends js.Object {
  var privateKey: typings.openpgp.mod.key.Key
  var privateKeyArmored: String
  var publicKey: typings.openpgp.mod.key.Key
  var publicKeyArmored: String
}

object PrivateKey {
  @scala.inline
  def apply(
    privateKey: typings.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKey: typings.openpgp.mod.key.Key,
    publicKeyArmored: String
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
}

