package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKey extends js.Object {
  var privateKey: typings.openpgp.mod.key.Key = js.native
  var privateKeyArmored: String = js.native
  var publicKey: typings.openpgp.mod.key.Key = js.native
  var publicKeyArmored: String = js.native
}

object PrivateKey {
  @scala.inline
  def apply(
    privateKey: typings.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKey: typings.openpgp.mod.key.Key,
    publicKeyArmored: String
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  @scala.inline
  implicit class PrivateKeyOps[Self <: PrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrivateKey(value: typings.openpgp.mod.key.Key): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKeyArmored(value: String): Self = this.set("privateKeyArmored", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: typings.openpgp.mod.key.Key): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKeyArmored(value: String): Self = this.set("publicKeyArmored", value.asInstanceOf[js.Any])
  }
  
}

