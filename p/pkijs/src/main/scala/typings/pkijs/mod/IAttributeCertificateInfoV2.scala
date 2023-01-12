package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeCertificateInfoV2 extends StObject {
  
  var attrCertValidityPeriod: AttCertValidityPeriod
  
  var attributes: js.Array[Attribute]
  
  var extensions: js.UndefOr[Extensions] = js.undefined
  
  var holder: Holder
  
  var issuer: GeneralNames | V2Form
  
  var issuerUniqueID: js.UndefOr[BitString] = js.undefined
  
  var serialNumber: Integer
  
  var signature: AlgorithmIdentifier
  
  var version: Double
}
object IAttributeCertificateInfoV2 {
  
  inline def apply(
    attrCertValidityPeriod: AttCertValidityPeriod,
    attributes: js.Array[Attribute],
    holder: Holder,
    issuer: GeneralNames | V2Form,
    serialNumber: Integer,
    signature: AlgorithmIdentifier,
    version: Double
  ): IAttributeCertificateInfoV2 = {
    val __obj = js.Dynamic.literal(attrCertValidityPeriod = attrCertValidityPeriod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeCertificateInfoV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttributeCertificateInfoV2] (val x: Self) extends AnyVal {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriod): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHolder(value: Holder): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: GeneralNames | V2Form): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: BitString): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
