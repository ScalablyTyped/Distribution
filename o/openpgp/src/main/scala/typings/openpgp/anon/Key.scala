package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
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
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyArmored(value: String): Self = StObject.set(x, "privateKeyArmored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyArmored(value: String): Self = StObject.set(x, "publicKeyArmored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationCertificate(value: String): Self = StObject.set(x, "revocationCertificate", value.asInstanceOf[js.Any])
  }
}
