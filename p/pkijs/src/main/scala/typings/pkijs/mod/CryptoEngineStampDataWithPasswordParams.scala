package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineStampDataWithPasswordParams extends StObject {
  
  var contentToStamp: js.typedarray.ArrayBuffer
  
  var hashAlgorithm: String
  
  var iterationCount: Double
  
  var password: js.typedarray.ArrayBuffer
  
  var salt: js.typedarray.ArrayBuffer
}
object CryptoEngineStampDataWithPasswordParams {
  
  inline def apply(
    contentToStamp: js.typedarray.ArrayBuffer,
    hashAlgorithm: String,
    iterationCount: Double,
    password: js.typedarray.ArrayBuffer,
    salt: js.typedarray.ArrayBuffer
  ): CryptoEngineStampDataWithPasswordParams = {
    val __obj = js.Dynamic.literal(contentToStamp = contentToStamp.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineStampDataWithPasswordParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEngineStampDataWithPasswordParams] (val x: Self) extends AnyVal {
    
    inline def setContentToStamp(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "contentToStamp", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
