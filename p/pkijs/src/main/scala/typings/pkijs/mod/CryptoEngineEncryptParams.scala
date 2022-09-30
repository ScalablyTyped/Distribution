package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineEncryptParams extends StObject {
  
  var contentEncryptionAlgorithm: ContentEncryptionAlgorithm
  
  var contentToEncrypt: js.typedarray.ArrayBuffer
  
  var contentType: String
  
  var hmacHashAlgorithm: String
  
  var iterationCount: Double
  
  var password: js.typedarray.ArrayBuffer
}
object CryptoEngineEncryptParams {
  
  inline def apply(
    contentEncryptionAlgorithm: ContentEncryptionAlgorithm,
    contentToEncrypt: js.typedarray.ArrayBuffer,
    contentType: String,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: js.typedarray.ArrayBuffer
  ): CryptoEngineEncryptParams = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineEncryptParams]
  }
  
  extension [Self <: CryptoEngineEncryptParams](x: Self) {
    
    inline def setContentEncryptionAlgorithm(value: ContentEncryptionAlgorithm): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setContentToEncrypt(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "contentToEncrypt", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
