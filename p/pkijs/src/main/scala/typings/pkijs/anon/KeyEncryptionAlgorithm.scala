package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.OriginatorIdentifierOrKeySchema
import typings.pkijs.mod.RecipientEncryptedKeysSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyEncryptionAlgorithm extends StObject {
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var originator: js.UndefOr[OriginatorIdentifierOrKeySchema] = js.undefined
  
  var recipientEncryptedKeys: js.UndefOr[RecipientEncryptedKeysSchema] = js.undefined
  
  var ukm: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object KeyEncryptionAlgorithm {
  
  inline def apply(): KeyEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyEncryptionAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyEncryptionAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setOriginator(value: OriginatorIdentifierOrKeySchema): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
    
    inline def setRecipientEncryptedKeys(value: RecipientEncryptedKeysSchema): Self = StObject.set(x, "recipientEncryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setRecipientEncryptedKeysUndefined: Self = StObject.set(x, "recipientEncryptedKeys", js.undefined)
    
    inline def setUkm(value: String): Self = StObject.set(x, "ukm", value.asInstanceOf[js.Any])
    
    inline def setUkmUndefined: Self = StObject.set(x, "ukm", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
