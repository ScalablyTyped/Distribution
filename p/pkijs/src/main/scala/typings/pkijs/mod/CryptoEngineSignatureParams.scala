package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineSignatureParams extends StObject {
  
  var parameters: CryptoEngineAlgorithmParams
  
  var signatureAlgorithm: AlgorithmIdentifier
}
object CryptoEngineSignatureParams {
  
  inline def apply(parameters: CryptoEngineAlgorithmParams, signatureAlgorithm: AlgorithmIdentifier): CryptoEngineSignatureParams = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineSignatureParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEngineSignatureParams] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: CryptoEngineAlgorithmParams): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
  }
}
