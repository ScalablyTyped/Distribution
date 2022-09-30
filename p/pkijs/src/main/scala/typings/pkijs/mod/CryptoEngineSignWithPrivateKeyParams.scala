package typings.pkijs.mod

import typings.std.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineSignWithPrivateKeyParams extends StObject {
  
  var algorithm: Algorithm
}
object CryptoEngineSignWithPrivateKeyParams {
  
  inline def apply(algorithm: Algorithm): CryptoEngineSignWithPrivateKeyParams = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineSignWithPrivateKeyParams]
  }
  
  extension [Self <: CryptoEngineSignWithPrivateKeyParams](x: Self) {
    
    inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
  }
}
