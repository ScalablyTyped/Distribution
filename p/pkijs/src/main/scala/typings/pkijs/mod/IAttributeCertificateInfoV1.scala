package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeCertificateInfoV1 extends StObject {
  
  /**
    * Specifies the period for which the AC issuer certifies that the binding between
    * the holder and the attributes fields will be valid
    */
  var attrCertValidityPeriod: AttCertValidityPeriod
  
  /**
    * The attributes field gives information about the AC holder
    */
  var attributes: js.Array[Attribute]
  
  var baseCertificateID: js.UndefOr[IssuerSerial] = js.undefined
  
  /**
    * The extensions field generally gives information about the AC as opposed
    * to information about the AC holder
    */
  var extensions: js.UndefOr[Extensions] = js.undefined
  
  var issuer: GeneralNames
  
  /**
    * Issuer unique identifier
    */
  var issuerUniqueID: js.UndefOr[BitString] = js.undefined
  
  var serialNumber: Integer
  
  /**
    * Contains the algorithm identifier used to validate the AC signature
    */
  var signature: AlgorithmIdentifier
  
  var subjectName: js.UndefOr[GeneralNames] = js.undefined
  
  /**
    * The version field MUST have the value of v2
    */
  var version: Double
}
object IAttributeCertificateInfoV1 {
  
  inline def apply(
    attrCertValidityPeriod: AttCertValidityPeriod,
    attributes: js.Array[Attribute],
    issuer: GeneralNames,
    serialNumber: Integer,
    signature: AlgorithmIdentifier,
    version: Double
  ): IAttributeCertificateInfoV1 = {
    val __obj = js.Dynamic.literal(attrCertValidityPeriod = attrCertValidityPeriod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeCertificateInfoV1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttributeCertificateInfoV1] (val x: Self) extends AnyVal {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriod): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBaseCertificateID(value: IssuerSerial): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setIssuer(value: GeneralNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: BitString): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSubjectName(value: GeneralNames): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
