package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Public key parameters
  */
trait CryptoEnginePublicKeyParams extends StObject {
  
  /**
    * Algorithm
    */
  var algorithm: CryptoEngineAlgorithmParams
}
object CryptoEnginePublicKeyParams {
  
  inline def apply(algorithm: CryptoEngineAlgorithmParams): CryptoEnginePublicKeyParams = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEnginePublicKeyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEnginePublicKeyParams] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: CryptoEngineAlgorithmParams): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
  }
}
