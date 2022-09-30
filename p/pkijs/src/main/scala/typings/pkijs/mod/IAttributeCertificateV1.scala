package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeCertificateV1 extends StObject {
  
  /**
    * Attribute certificate information
    */
  var acinfo: AttributeCertificateInfoV1
  
  /**
    * Signature algorithm
    */
  var signatureAlgorithm: AlgorithmIdentifier
  
  /**
    * Signature value
    */
  var signatureValue: BitString
}
object IAttributeCertificateV1 {
  
  inline def apply(
    acinfo: AttributeCertificateInfoV1,
    signatureAlgorithm: AlgorithmIdentifier,
    signatureValue: BitString
  ): IAttributeCertificateV1 = {
    val __obj = js.Dynamic.literal(acinfo = acinfo.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeCertificateV1]
  }
  
  extension [Self <: IAttributeCertificateV1](x: Self) {
    
    inline def setAcinfo(value: AttributeCertificateInfoV1): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
  }
}
