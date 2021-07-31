package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  var publicKey: typings.openpgp.mod.key.Key
  
  var publicKeyArmored: String
}
object PublicKey {
  
  @scala.inline
  def apply(publicKey: typings.openpgp.mod.key.Key, publicKeyArmored: String): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyArmored(value: String): Self = StObject.set(x, "publicKeyArmored", value.asInstanceOf[js.Any])
  }
}
