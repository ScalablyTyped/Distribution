package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDerivationAlgorithm extends StObject {
  
  var encryptedKey: js.UndefOr[String] = js.undefined
  
  var keyDerivationAlgorithm: js.UndefOr[String] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object KeyDerivationAlgorithm {
  
  inline def apply(): KeyDerivationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyDerivationAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyDerivationAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: String): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setKeyDerivationAlgorithm(value: String): Self = StObject.set(x, "keyDerivationAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationAlgorithmUndefined: Self = StObject.set(x, "keyDerivationAlgorithm", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
