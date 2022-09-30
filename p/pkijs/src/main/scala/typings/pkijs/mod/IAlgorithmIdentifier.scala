package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAlgorithmIdentifier extends StObject {
  
  /**
    * ObjectIdentifier for algorithm (string representation)
    */
  var algorithmId: String
  
  /**
    * Any algorithm parameters
    */
  var algorithmParams: js.UndefOr[Any] = js.undefined
}
object IAlgorithmIdentifier {
  
  inline def apply(algorithmId: String): IAlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlgorithmIdentifier]
  }
  
  extension [Self <: IAlgorithmIdentifier](x: Self) {
    
    inline def setAlgorithmId(value: String): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmParams(value: Any): Self = StObject.set(x, "algorithmParams", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmParamsUndefined: Self = StObject.set(x, "algorithmParams", js.undefined)
  }
}
