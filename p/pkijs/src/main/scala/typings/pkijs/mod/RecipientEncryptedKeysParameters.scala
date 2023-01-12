package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRecipientEncryptedKeys> */
trait RecipientEncryptedKeysParameters extends StObject {
  
  var encryptedKeys: js.UndefOr[js.Array[RecipientEncryptedKey]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object RecipientEncryptedKeysParameters {
  
  inline def apply(): RecipientEncryptedKeysParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEncryptedKeysParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientEncryptedKeysParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKeys(value: js.Array[RecipientEncryptedKey]): Self = StObject.set(x, "encryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeysUndefined: Self = StObject.set(x, "encryptedKeys", js.undefined)
    
    inline def setEncryptedKeysVarargs(value: RecipientEncryptedKey*): Self = StObject.set(x, "encryptedKeys", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
