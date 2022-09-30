package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAttributeCertificateV2> */
trait AttributeCertificateV2Parameters extends StObject {
  
  var acinfo: js.UndefOr[AttributeCertificateInfoV2] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signatureValue: js.UndefOr[BitString] = js.undefined
}
object AttributeCertificateV2Parameters {
  
  inline def apply(): AttributeCertificateV2Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeCertificateV2Parameters]
  }
  
  extension [Self <: AttributeCertificateV2Parameters](x: Self) {
    
    inline def setAcinfo(value: AttributeCertificateInfoV2): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setAcinfoUndefined: Self = StObject.set(x, "acinfo", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
  }
}
