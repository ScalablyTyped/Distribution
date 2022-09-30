package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBasicOCSPResponse extends StObject {
  
  var certs: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  var signature: BitString
  
  var signatureAlgorithm: AlgorithmIdentifier
  
  var tbsResponseData: ResponseData
}
object IBasicOCSPResponse {
  
  inline def apply(signature: BitString, signatureAlgorithm: AlgorithmIdentifier, tbsResponseData: ResponseData): IBasicOCSPResponse = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], tbsResponseData = tbsResponseData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicOCSPResponse]
  }
  
  extension [Self <: IBasicOCSPResponse](x: Self) {
    
    inline def setCerts(value: js.Array[Certificate]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: Certificate*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setSignature(value: BitString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setTbsResponseData(value: ResponseData): Self = StObject.set(x, "tbsResponseData", value.asInstanceOf[js.Any])
  }
}
