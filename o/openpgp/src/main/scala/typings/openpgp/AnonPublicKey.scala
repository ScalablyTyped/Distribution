package typings.openpgp

import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublicKey extends js.Object {
  var publicKey: Key
  var publicKeyArmored: String
}

object AnonPublicKey {
  @scala.inline
  def apply(publicKey: Key, publicKeyArmored: String): AnonPublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPublicKey]
  }
}

