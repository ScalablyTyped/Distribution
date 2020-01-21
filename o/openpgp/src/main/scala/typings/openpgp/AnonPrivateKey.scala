package typings.openpgp

import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivateKey extends js.Object {
  var privateKey: Key
  var privateKeyArmored: String
  var publicKey: Key
  var publicKeyArmored: String
}

object AnonPrivateKey {
  @scala.inline
  def apply(privateKey: Key, privateKeyArmored: String, publicKey: Key, publicKeyArmored: String): AnonPrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivateKey]
  }
}

