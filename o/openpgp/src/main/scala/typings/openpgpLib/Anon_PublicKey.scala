package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKey extends js.Object {
  var publicKey: openpgpLib.openpgpMod.keyNs.Key
  var publicKeyArmored: java.lang.String
}

object Anon_PublicKey {
  @scala.inline
  def apply(publicKey: openpgpLib.openpgpMod.keyNs.Key, publicKeyArmored: java.lang.String): Anon_PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey, publicKeyArmored = publicKeyArmored)
  
    __obj.asInstanceOf[Anon_PublicKey]
  }
}

