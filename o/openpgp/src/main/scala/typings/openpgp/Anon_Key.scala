package typings.openpgp

import typings.openpgp.openpgpMod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: Key
  var privateKeyArmored: String
  var publicKeyArmored: String
  var revocationCertificate: String
}

object Anon_Key {
  @scala.inline
  def apply(key: Key, privateKeyArmored: String, publicKeyArmored: String, revocationCertificate: String): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any], revocationCertificate = revocationCertificate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key]
  }
}

