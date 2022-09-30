package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.RecipientIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rid extends StObject {
  
  var encryptedKey: js.UndefOr[String] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var rid: js.UndefOr[RecipientIdentifierSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Rid {
  
  inline def apply(): Rid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rid]
  }
  
  extension [Self <: Rid](x: Self) {
    
    inline def setEncryptedKey(value: String): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setRid(value: RecipientIdentifierSchema): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
