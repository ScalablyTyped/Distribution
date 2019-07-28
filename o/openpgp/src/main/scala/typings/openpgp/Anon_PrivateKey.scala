package typings.openpgp

import typings.openpgp.openpgpMod.keyNs.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: Key
  var privateKeyArmored: String
  var publicKey: Key
  var publicKeyArmored: String
}

object Anon_PrivateKey {
  @scala.inline
  def apply(privateKey: Key, privateKeyArmored: String, publicKey: Key, publicKeyArmored: String): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, privateKeyArmored = privateKeyArmored, publicKey = publicKey, publicKeyArmored = publicKeyArmored)
  
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

