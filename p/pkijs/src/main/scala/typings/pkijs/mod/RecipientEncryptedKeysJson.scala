package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientEncryptedKeysJson extends StObject {
  
  var encryptedKeys: js.Array[RecipientEncryptedKeyJson]
}
object RecipientEncryptedKeysJson {
  
  inline def apply(encryptedKeys: js.Array[RecipientEncryptedKeyJson]): RecipientEncryptedKeysJson = {
    val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientEncryptedKeysJson]
  }
  
  extension [Self <: RecipientEncryptedKeysJson](x: Self) {
    
    inline def setEncryptedKeys(value: js.Array[RecipientEncryptedKeyJson]): Self = StObject.set(x, "encryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeysVarargs(value: RecipientEncryptedKeyJson*): Self = StObject.set(x, "encryptedKeys", js.Array(value*))
  }
}
