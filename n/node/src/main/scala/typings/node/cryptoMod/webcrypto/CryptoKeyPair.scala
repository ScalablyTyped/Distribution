package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `CryptoKeyPair` is a simple dictionary object with `publicKey` and `privateKey` properties, representing an asymmetric key pair.
  * @since v15.0.0
  */
trait CryptoKeyPair extends StObject {
  
  /**
    * A {@link CryptoKey} whose type will be `'private'`.
    * @since v15.0.0
    */
  var privateKey: CryptoKey
  
  /**
    * A {@link CryptoKey} whose type will be `'public'`.
    * @since v15.0.0
    */
  var publicKey: CryptoKey
}
object CryptoKeyPair {
  
  inline def apply(privateKey: CryptoKey, publicKey: CryptoKey): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
  
  extension [Self <: CryptoKeyPair](x: Self) {
    
    inline def setPrivateKey(value: CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
