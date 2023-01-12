package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.KEKIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedKey extends StObject {
  
  var encryptedKey: js.UndefOr[String] = js.undefined
  
  var kekid: js.UndefOr[KEKIdentifierSchema] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object EncryptedKey {
  
  inline def apply(): EncryptedKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedKey] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: String): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setKekid(value: KEKIdentifierSchema): Self = StObject.set(x, "kekid", value.asInstanceOf[js.Any])
    
    inline def setKekidUndefined: Self = StObject.set(x, "kekid", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
