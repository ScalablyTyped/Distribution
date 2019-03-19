package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: openpgpLib.openpgpMod.openpgpNs.keyNs.Key
  var privateKeyArmored: java.lang.String
  var publicKeyArmored: java.lang.String
  var revocationCertificate: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(
    key: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    privateKeyArmored: java.lang.String,
    publicKeyArmored: java.lang.String,
    revocationCertificate: java.lang.String
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, privateKeyArmored = privateKeyArmored, publicKeyArmored = publicKeyArmored, revocationCertificate = revocationCertificate)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

