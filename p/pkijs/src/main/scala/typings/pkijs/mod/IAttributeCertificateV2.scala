package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeCertificateV2 extends StObject {
  
  /**
    * Attribute certificate information
    */
  var acinfo: AttributeCertificateInfoV2
  
  /**
    * Signature algorithm
    */
  var signatureAlgorithm: AlgorithmIdentifier
  
  /**
    * Signature value
    */
  var signatureValue: BitString
}
object IAttributeCertificateV2 {
  
  inline def apply(
    acinfo: AttributeCertificateInfoV2,
    signatureAlgorithm: AlgorithmIdentifier,
    signatureValue: BitString
  ): IAttributeCertificateV2 = {
    val __obj = js.Dynamic.literal(acinfo = acinfo.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeCertificateV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttributeCertificateV2] (val x: Self) extends AnyVal {
    
    inline def setAcinfo(value: AttributeCertificateInfoV2): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
  }
}
