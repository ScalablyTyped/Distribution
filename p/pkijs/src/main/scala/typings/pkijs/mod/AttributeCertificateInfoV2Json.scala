package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeCertificateInfoV2Json extends StObject {
  
  var attrCertValidityPeriod: AttCertValidityPeriodJson
  
  var attributes: js.Array[AttributeJson]
  
  var extensions: js.UndefOr[ExtensionsJson] = js.undefined
  
  var holder: HolderJson
  
  var issuer: GeneralNamesJson | V2FormJson
  
  var issuerUniqueID: js.UndefOr[BitStringJson] = js.undefined
  
  var serialNumber: IntegerJson
  
  var signature: AlgorithmIdentifierJson
  
  var version: Double
}
object AttributeCertificateInfoV2Json {
  
  inline def apply(
    attrCertValidityPeriod: AttCertValidityPeriodJson,
    attributes: js.Array[AttributeJson],
    holder: HolderJson,
    issuer: GeneralNamesJson | V2FormJson,
    serialNumber: IntegerJson,
    signature: AlgorithmIdentifierJson,
    version: Double
  ): AttributeCertificateInfoV2Json = {
    val __obj = js.Dynamic.literal(attrCertValidityPeriod = attrCertValidityPeriod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeCertificateInfoV2Json]
  }
  
  extension [Self <: AttributeCertificateInfoV2Json](x: Self) {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriodJson): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setExtensions(value: ExtensionsJson): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHolder(value: HolderJson): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: GeneralNamesJson | V2FormJson): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: BitStringJson): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
