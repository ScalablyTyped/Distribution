package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: typings.openpgp.mod.key.Key
  var privateKeyArmored: String
  var publicKeyArmored: String
  var revocationCertificate: String
}

object Key {
  @scala.inline
  def apply(
    key: typings.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKeyArmored: String,
    revocationCertificate: String
  ): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any], revocationCertificate = revocationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

