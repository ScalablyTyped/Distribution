package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IKeyTransRecipientInfo> */
trait KeyTransRecipientInfoParameters extends StObject {
  
  var encryptedKey: js.UndefOr[OctetString] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var recipientCertificate: js.UndefOr[Certificate] = js.undefined
  
  var rid: js.UndefOr[RecipientIdentifierType] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object KeyTransRecipientInfoParameters {
  
  inline def apply(): KeyTransRecipientInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyTransRecipientInfoParameters]
  }
  
  extension [Self <: KeyTransRecipientInfoParameters](x: Self) {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setRecipientCertificate(value: Certificate): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
    
    inline def setRecipientCertificateUndefined: Self = StObject.set(x, "recipientCertificate", js.undefined)
    
    inline def setRid(value: RecipientIdentifierType): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
