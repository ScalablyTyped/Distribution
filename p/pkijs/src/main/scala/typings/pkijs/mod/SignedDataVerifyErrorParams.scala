package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedDataVerifyErrorParams extends StObject {
  
  var certificatePath: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  var code: js.UndefOr[Double] = js.undefined
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var message: String
  
  var signatureVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  var signerCertificate: js.UndefOr[Certificate | Null] = js.undefined
  
  var signerCertificateVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  var timestampSerial: js.UndefOr[js.typedarray.ArrayBuffer | Null] = js.undefined
}
object SignedDataVerifyErrorParams {
  
  inline def apply(message: String): SignedDataVerifyErrorParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataVerifyErrorParams]
  }
  
  extension [Self <: SignedDataVerifyErrorParams](x: Self) {
    
    inline def setCertificatePath(value: js.Array[Certificate]): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    inline def setCertificatePathVarargs(value: Certificate*): Self = StObject.set(x, "certificatePath", js.Array(value*))
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSignatureVerified(value: Boolean): Self = StObject.set(x, "signatureVerified", value.asInstanceOf[js.Any])
    
    inline def setSignatureVerifiedNull: Self = StObject.set(x, "signatureVerified", null)
    
    inline def setSignatureVerifiedUndefined: Self = StObject.set(x, "signatureVerified", js.undefined)
    
    inline def setSignerCertificate(value: Certificate): Self = StObject.set(x, "signerCertificate", value.asInstanceOf[js.Any])
    
    inline def setSignerCertificateNull: Self = StObject.set(x, "signerCertificate", null)
    
    inline def setSignerCertificateUndefined: Self = StObject.set(x, "signerCertificate", js.undefined)
    
    inline def setSignerCertificateVerified(value: Boolean): Self = StObject.set(x, "signerCertificateVerified", value.asInstanceOf[js.Any])
    
    inline def setSignerCertificateVerifiedNull: Self = StObject.set(x, "signerCertificateVerified", null)
    
    inline def setSignerCertificateVerifiedUndefined: Self = StObject.set(x, "signerCertificateVerified", js.undefined)
    
    inline def setTimestampSerial(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "timestampSerial", value.asInstanceOf[js.Any])
    
    inline def setTimestampSerialNull: Self = StObject.set(x, "timestampSerial", null)
    
    inline def setTimestampSerialUndefined: Self = StObject.set(x, "timestampSerial", js.undefined)
  }
}
