package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAttributeCertificateInfoV1> */
trait AttributeCertificateInfoV1Parameters extends StObject {
  
  var attrCertValidityPeriod: js.UndefOr[AttCertValidityPeriod] = js.undefined
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var baseCertificateID: js.UndefOr[IssuerSerial] = js.undefined
  
  var extensions: js.UndefOr[Extensions] = js.undefined
  
  var issuer: js.UndefOr[GeneralNames] = js.undefined
  
  var issuerUniqueID: js.UndefOr[BitString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var subjectName: js.UndefOr[GeneralNames] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object AttributeCertificateInfoV1Parameters {
  
  inline def apply(): AttributeCertificateInfoV1Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeCertificateInfoV1Parameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeCertificateInfoV1Parameters] (val x: Self) extends AnyVal {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriod): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttrCertValidityPeriodUndefined: Self = StObject.set(x, "attrCertValidityPeriod", js.undefined)
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBaseCertificateID(value: IssuerSerial): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setIssuer(value: GeneralNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setIssuerUniqueID(value: BitString): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSubjectName(value: GeneralNames): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
