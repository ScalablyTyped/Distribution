package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends js.Object {
  
  var key: typings.openpgp.mod.key.Key = js.native
  
  var privateKeyArmored: String = js.native
  
  var publicKeyArmored: String = js.native
  
  var revocationCertificate: String = js.native
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
  
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    
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
    def setKey(value: typings.openpgp.mod.key.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyArmored(value: String): Self = this.set("privateKeyArmored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyArmored(value: String): Self = this.set("publicKeyArmored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationCertificate(value: String): Self = this.set("revocationCertificate", value.asInstanceOf[js.Any])
  }
}
