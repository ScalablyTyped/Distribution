package typings.openpgp

import typings.openpgp.openpgpMod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKey extends js.Object {
  var publicKey: Key
  var publicKeyArmored: String
}

object Anon_PublicKey {
  @scala.inline
  def apply(publicKey: Key, publicKeyArmored: String): Anon_PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PublicKey]
  }
}

