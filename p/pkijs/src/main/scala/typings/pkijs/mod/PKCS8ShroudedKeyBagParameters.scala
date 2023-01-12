package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPKCS8ShroudedKeyBag> */
trait PKCS8ShroudedKeyBagParameters extends StObject {
  
  var encryptedData: js.UndefOr[OctetString] = js.undefined
  
  var encryptionAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var parsedValue: js.UndefOr[PrivateKeyInfo] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PKCS8ShroudedKeyBagParameters {
  
  inline def apply(): PKCS8ShroudedKeyBagParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PKCS8ShroudedKeyBagParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PKCS8ShroudedKeyBagParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptedData(value: OctetString): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    inline def setEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
    
    inline def setParsedValue(value: PrivateKeyInfo): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
