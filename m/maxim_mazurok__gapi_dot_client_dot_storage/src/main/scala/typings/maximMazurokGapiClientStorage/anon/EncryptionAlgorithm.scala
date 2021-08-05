package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionAlgorithm extends StObject {
  
  /** The encryption algorithm. */
  var encryptionAlgorithm: js.UndefOr[String] = js.undefined
  
  /** SHA256 hash value of the encryption key. */
  var keySha256: js.UndefOr[String] = js.undefined
}
object EncryptionAlgorithm {
  
  inline def apply(): EncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAlgorithm]
  }
  
  extension [Self <: EncryptionAlgorithm](x: Self) {
    
    inline def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
    
    inline def setKeySha256(value: String): Self = StObject.set(x, "keySha256", value.asInstanceOf[js.Any])
    
    inline def setKeySha256Undefined: Self = StObject.set(x, "keySha256", js.undefined)
  }
}
