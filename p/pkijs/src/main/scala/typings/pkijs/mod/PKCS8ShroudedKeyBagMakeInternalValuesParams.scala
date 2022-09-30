package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<pkijs.pkijs.EncryptedDataEncryptParams, 'contentToEncrypt'> */
trait PKCS8ShroudedKeyBagMakeInternalValuesParams extends StObject {
  
  var contentEncryptionAlgorithm: ContentEncryptionAlgorithm
  
  var hmacHashAlgorithm: String
  
  var iterationCount: Double
  
  var password: js.typedarray.ArrayBuffer
}
object PKCS8ShroudedKeyBagMakeInternalValuesParams {
  
  inline def apply(
    contentEncryptionAlgorithm: ContentEncryptionAlgorithm,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: js.typedarray.ArrayBuffer
  ): PKCS8ShroudedKeyBagMakeInternalValuesParams = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKCS8ShroudedKeyBagMakeInternalValuesParams]
  }
  
  extension [Self <: PKCS8ShroudedKeyBagMakeInternalValuesParams](x: Self) {
    
    inline def setContentEncryptionAlgorithm(value: ContentEncryptionAlgorithm): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
