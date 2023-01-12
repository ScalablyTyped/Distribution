package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRecipientEncryptedKey> */
trait RecipientEncryptedKeyParameters extends StObject {
  
  var encryptedKey: js.UndefOr[OctetString] = js.undefined
  
  var rid: js.UndefOr[KeyAgreeRecipientIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object RecipientEncryptedKeyParameters {
  
  inline def apply(): RecipientEncryptedKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEncryptedKeyParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientEncryptedKeyParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setRid(value: KeyAgreeRecipientIdentifier): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
