package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IKeyAgreeRecipientInfo> */
trait KeyAgreeRecipientInfoParameters extends StObject {
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var originator: js.UndefOr[OriginatorIdentifierOrKey] = js.undefined
  
  var recipientCertificate: js.UndefOr[Certificate] = js.undefined
  
  var recipientEncryptedKeys: js.UndefOr[RecipientEncryptedKeys] = js.undefined
  
  var recipientPublicKey: js.UndefOr[CryptoKey | Null] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var ukm: js.UndefOr[OctetString] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object KeyAgreeRecipientInfoParameters {
  
  inline def apply(): KeyAgreeRecipientInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyAgreeRecipientInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyAgreeRecipientInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setOriginator(value: OriginatorIdentifierOrKey): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
    
    inline def setRecipientCertificate(value: Certificate): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
    
    inline def setRecipientCertificateUndefined: Self = StObject.set(x, "recipientCertificate", js.undefined)
    
    inline def setRecipientEncryptedKeys(value: RecipientEncryptedKeys): Self = StObject.set(x, "recipientEncryptedKeys", value.asInstanceOf[js.Any])
    
    inline def setRecipientEncryptedKeysUndefined: Self = StObject.set(x, "recipientEncryptedKeys", js.undefined)
    
    inline def setRecipientPublicKey(value: CryptoKey): Self = StObject.set(x, "recipientPublicKey", value.asInstanceOf[js.Any])
    
    inline def setRecipientPublicKeyNull: Self = StObject.set(x, "recipientPublicKey", null)
    
    inline def setRecipientPublicKeyUndefined: Self = StObject.set(x, "recipientPublicKey", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setUkm(value: OctetString): Self = StObject.set(x, "ukm", value.asInstanceOf[js.Any])
    
    inline def setUkmUndefined: Self = StObject.set(x, "ukm", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
