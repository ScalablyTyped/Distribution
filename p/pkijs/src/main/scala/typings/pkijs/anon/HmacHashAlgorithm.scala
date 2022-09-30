package typings.pkijs.anon

import typings.std.AesKeyGenParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacHashAlgorithm extends StObject {
  
  var hmacHashAlgorithm: js.UndefOr[String] = js.undefined
  
  var iterationCount: js.UndefOr[Double] = js.undefined
  
  var keyEncryptionAlgorithm: js.UndefOr[AesKeyGenParams] = js.undefined
  
  var keyEncryptionAlgorithmParams: js.UndefOr[Any] = js.undefined
  
  var keyIdentifier: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object HmacHashAlgorithm {
  
  inline def apply(): HmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacHashAlgorithm]
  }
  
  extension [Self <: HmacHashAlgorithm](x: Self) {
    
    inline def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHmacHashAlgorithmUndefined: Self = StObject.set(x, "hmacHashAlgorithm", js.undefined)
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: AesKeyGenParams): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmParams(value: Any): Self = StObject.set(x, "keyEncryptionAlgorithmParams", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmParamsUndefined: Self = StObject.set(x, "keyEncryptionAlgorithmParams", js.undefined)
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
    
    inline def setKeyIdentifier(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
  }
}
