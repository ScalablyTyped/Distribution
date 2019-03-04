package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends KeyContainer {
  var privateKeyArmored: java.lang.String
  var publicKeyArmored: java.lang.String
  var revocationCertificate: java.lang.String
}

object KeyPair {
  @scala.inline
  def apply(
    key: openpgpLib.openpgpMod.keyNs.Key,
    privateKeyArmored: java.lang.String,
    publicKeyArmored: java.lang.String,
    revocationCertificate: java.lang.String
  ): KeyPair = {
    val __obj = js.Dynamic.literal(key = key, privateKeyArmored = privateKeyArmored, publicKeyArmored = publicKeyArmored, revocationCertificate = revocationCertificate)
  
    __obj.asInstanceOf[KeyPair]
  }
}

