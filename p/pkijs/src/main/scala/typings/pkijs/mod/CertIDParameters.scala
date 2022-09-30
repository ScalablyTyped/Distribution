package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertID> */
trait CertIDParameters extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var issuerKeyHash: js.UndefOr[OctetString] = js.undefined
  
  var issuerNameHash: js.UndefOr[OctetString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
}
object CertIDParameters {
  
  inline def apply(): CertIDParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertIDParameters]
  }
  
  extension [Self <: CertIDParameters](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setIssuerKeyHash(value: OctetString): Self = StObject.set(x, "issuerKeyHash", value.asInstanceOf[js.Any])
    
    inline def setIssuerKeyHashUndefined: Self = StObject.set(x, "issuerKeyHash", js.undefined)
    
    inline def setIssuerNameHash(value: OctetString): Self = StObject.set(x, "issuerNameHash", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameHashUndefined: Self = StObject.set(x, "issuerNameHash", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
