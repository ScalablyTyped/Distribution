package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientEncryptedKeyJson extends StObject {
  
  var encryptedKey: OctetStringJson
  
  var rid: KeyAgreeRecipientIdentifierJson
}
object RecipientEncryptedKeyJson {
  
  inline def apply(encryptedKey: OctetStringJson, rid: KeyAgreeRecipientIdentifierJson): RecipientEncryptedKeyJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientEncryptedKeyJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientEncryptedKeyJson] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: OctetStringJson): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setRid(value: KeyAgreeRecipientIdentifierJson): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
  }
}
