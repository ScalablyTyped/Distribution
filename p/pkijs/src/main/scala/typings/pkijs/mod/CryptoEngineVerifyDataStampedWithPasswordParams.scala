package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineVerifyDataStampedWithPasswordParams extends StObject {
  
  var contentToVerify: js.typedarray.ArrayBuffer
  
  var hashAlgorithm: String
  
  var iterationCount: Double
  
  var password: js.typedarray.ArrayBuffer
  
  var salt: js.typedarray.ArrayBuffer
  
  var signatureToVerify: js.typedarray.ArrayBuffer
}
object CryptoEngineVerifyDataStampedWithPasswordParams {
  
  inline def apply(
    contentToVerify: js.typedarray.ArrayBuffer,
    hashAlgorithm: String,
    iterationCount: Double,
    password: js.typedarray.ArrayBuffer,
    salt: js.typedarray.ArrayBuffer,
    signatureToVerify: js.typedarray.ArrayBuffer
  ): CryptoEngineVerifyDataStampedWithPasswordParams = {
    val __obj = js.Dynamic.literal(contentToVerify = contentToVerify.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], signatureToVerify = signatureToVerify.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineVerifyDataStampedWithPasswordParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEngineVerifyDataStampedWithPasswordParams] (val x: Self) extends AnyVal {
    
    inline def setContentToVerify(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "contentToVerify", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSignatureToVerify(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "signatureToVerify", value.asInstanceOf[js.Any])
  }
}
