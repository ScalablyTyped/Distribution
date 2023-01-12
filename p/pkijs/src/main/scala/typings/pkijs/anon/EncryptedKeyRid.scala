package typings.pkijs.anon

import typings.pkijs.mod.KeyAgreeRecipientIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedKeyRid extends StObject {
  
  var encryptedKey: js.UndefOr[String] = js.undefined
  
  var rid: js.UndefOr[KeyAgreeRecipientIdentifierSchema] = js.undefined
}
object EncryptedKeyRid {
  
  inline def apply(): EncryptedKeyRid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedKeyRid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedKeyRid] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: String): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setRid(value: KeyAgreeRecipientIdentifierSchema): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
  }
}
