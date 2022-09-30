package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPasswordRecipientInfo> */
trait PasswordRecipientinfoParameters extends StObject {
  
  var encryptedKey: js.UndefOr[OctetString] = js.undefined
  
  var keyDerivationAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var password: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object PasswordRecipientinfoParameters {
  
  inline def apply(): PasswordRecipientinfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordRecipientinfoParameters]
  }
  
  extension [Self <: PasswordRecipientinfoParameters](x: Self) {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
    
    inline def setKeyDerivationAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyDerivationAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationAlgorithmUndefined: Self = StObject.set(x, "keyDerivationAlgorithm", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
