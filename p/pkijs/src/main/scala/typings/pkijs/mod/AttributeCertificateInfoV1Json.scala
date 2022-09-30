package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeCertificateInfoV1Json extends StObject {
  
  var attrCertValidityPeriod: AttCertValidityPeriodJson
  
  var attributes: js.Array[AttributeJson]
  
  var baseCertificateID: js.UndefOr[IssuerSerialJson] = js.undefined
  
  var extensions: ExtensionsJson
  
  var issuer: GeneralNamesJson
  
  var issuerUniqueID: BitStringJson
  
  var serialNumber: IntegerJson
  
  var signature: AlgorithmIdentifierJson
  
  var subjectName: js.UndefOr[GeneralNamesJson] = js.undefined
  
  var version: Double
}
object AttributeCertificateInfoV1Json {
  
  inline def apply(
    attrCertValidityPeriod: AttCertValidityPeriodJson,
    attributes: js.Array[AttributeJson],
    extensions: ExtensionsJson,
    issuer: GeneralNamesJson,
    issuerUniqueID: BitStringJson,
    serialNumber: IntegerJson,
    signature: AlgorithmIdentifierJson,
    version: Double
  ): AttributeCertificateInfoV1Json = {
    val __obj = js.Dynamic.literal(attrCertValidityPeriod = attrCertValidityPeriod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerUniqueID = issuerUniqueID.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeCertificateInfoV1Json]
  }
  
  extension [Self <: AttributeCertificateInfoV1Json](x: Self) {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriodJson): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBaseCertificateID(value: IssuerSerialJson): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setExtensions(value: ExtensionsJson): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: GeneralNamesJson): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: BitStringJson): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSubjectName(value: GeneralNamesJson): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
