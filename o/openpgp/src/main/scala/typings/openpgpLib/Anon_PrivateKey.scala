package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: openpgpLib.openpgpMod.keyNs.Key
  var privateKeyArmored: java.lang.String
  var publicKey: openpgpLib.openpgpMod.keyNs.Key
  var publicKeyArmored: java.lang.String
}

object Anon_PrivateKey {
  @scala.inline
  def apply(
    privateKey: openpgpLib.openpgpMod.keyNs.Key,
    privateKeyArmored: java.lang.String,
    publicKey: openpgpLib.openpgpMod.keyNs.Key,
    publicKeyArmored: java.lang.String
  ): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, privateKeyArmored = privateKeyArmored, publicKey = publicKey, publicKeyArmored = publicKeyArmored)
  
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

