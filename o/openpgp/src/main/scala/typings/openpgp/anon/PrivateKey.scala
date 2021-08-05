package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKey extends StObject {
  
  var privateKey: typings.openpgp.mod.key.Key
  
  var privateKeyArmored: String
  
  var publicKey: typings.openpgp.mod.key.Key
  
  var publicKeyArmored: String
}
object PrivateKey {
  
  inline def apply(
    privateKey: typings.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKey: typings.openpgp.mod.key.Key,
    publicKeyArmored: String
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  extension [Self <: PrivateKey](x: Self) {
    
    inline def setPrivateKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyArmored(value: String): Self = StObject.set(x, "privateKeyArmored", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyArmored(value: String): Self = StObject.set(x, "publicKeyArmored", value.asInstanceOf[js.Any])
  }
}
