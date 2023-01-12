package typings.pkijs.mod

import typings.std.Algorithm
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Algorithm parameters
  */
trait CryptoEngineAlgorithmParams extends StObject {
  
  /**
    * Algorithm
    */
  var algorithm: Algorithm | js.Object
  
  /**
    * Key usages
    */
  var usages: js.Array[KeyUsage]
}
object CryptoEngineAlgorithmParams {
  
  inline def apply(algorithm: Algorithm | js.Object, usages: js.Array[KeyUsage]): CryptoEngineAlgorithmParams = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineAlgorithmParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEngineAlgorithmParams] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: Algorithm | js.Object): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setUsages(value: js.Array[KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "usages", js.Array(value*))
  }
}
