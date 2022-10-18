package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyArmored extends StObject {
  
  var key: typings.openpgp.mod.key.Key
  
  var privateKeyArmored: String
  
  var publicKeyArmored: String
  
  var revocationCertificate: String
}
object PrivateKeyArmored {
  
  inline def apply(
    key: typings.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKeyArmored: String,
    revocationCertificate: String
  ): PrivateKeyArmored = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any], revocationCertificate = revocationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyArmored]
  }
  
  extension [Self <: PrivateKeyArmored](x: Self) {
    
    inline def setKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyArmored(value: String): Self = StObject.set(x, "privateKeyArmored", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyArmored(value: String): Self = StObject.set(x, "publicKeyArmored", value.asInstanceOf[js.Any])
    
    inline def setRevocationCertificate(value: String): Self = StObject.set(x, "revocationCertificate", value.asInstanceOf[js.Any])
  }
}
