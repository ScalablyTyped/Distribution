package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecipientEncryptedKeys extends StObject {
  
  var encryptedKeys: js.Array[RecipientEncryptedKey]
}
object IRecipientEncryptedKeys {
  
  inline def apply(encryptedKeys: js.Array[RecipientEncryptedKey]): IRecipientEncryptedKeys = {
    val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecipientEncryptedKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRecipientEncryptedKeys] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKeys(value: js.Array[RecipientEncryptedKey]): Self = StObject.set(x, "encryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeysVarargs(value: RecipientEncryptedKey*): Self = StObject.set(x, "encryptedKeys", js.Array(value*))
  }
}
