package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientEncryptedKeys extends StObject {
  
  var RecipientEncryptedKeys: js.UndefOr[String] = js.undefined
}
object RecipientEncryptedKeys {
  
  inline def apply(): RecipientEncryptedKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEncryptedKeys]
  }
  
  extension [Self <: RecipientEncryptedKeys](x: Self) {
    
    inline def setRecipientEncryptedKeys(value: String): Self = StObject.set(x, "RecipientEncryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setRecipientEncryptedKeysUndefined: Self = StObject.set(x, "RecipientEncryptedKeys", js.undefined)
  }
}
