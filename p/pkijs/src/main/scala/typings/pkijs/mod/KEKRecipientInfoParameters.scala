package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IKEKRecipientInfo> */
trait KEKRecipientInfoParameters extends StObject {
  
  var encryptedKey: js.UndefOr[OctetString] = js.undefined
  
  var kekid: js.UndefOr[KEKIdentifier] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var preDefinedKEK: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object KEKRecipientInfoParameters {
  
  inline def apply(): KEKRecipientInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KEKRecipientInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KEKRecipientInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setKekid(value: KEKIdentifier): Self = StObject.set(x, "kekid", value.asInstanceOf[js.Any])
    
    inline def setKekidUndefined: Self = StObject.set(x, "kekid", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setPreDefinedKEK(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "preDefinedKEK", value.asInstanceOf[js.Any])
    
    inline def setPreDefinedKEKUndefined: Self = StObject.set(x, "preDefinedKEK", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
