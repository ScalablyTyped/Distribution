package typings.openpgp

import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: Key
  var privateKeyArmored: String
  var publicKeyArmored: String
  var revocationCertificate: String
}

object AnonKey {
  @scala.inline
  def apply(key: Key, privateKeyArmored: String, publicKeyArmored: String, revocationCertificate: String): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any], revocationCertificate = revocationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

