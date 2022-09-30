package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmIdentifier extends StObject {
  
  var algorithmIdentifier: js.UndefOr[String] = js.undefined
  
  var algorithmParams: js.UndefOr[String] = js.undefined
}
object AlgorithmIdentifier {
  
  inline def apply(): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
  
  extension [Self <: AlgorithmIdentifier](x: Self) {
    
    inline def setAlgorithmIdentifier(value: String): Self = StObject.set(x, "algorithmIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmIdentifierUndefined: Self = StObject.set(x, "algorithmIdentifier", js.undefined)
    
    inline def setAlgorithmParams(value: String): Self = StObject.set(x, "algorithmParams", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmParamsUndefined: Self = StObject.set(x, "algorithmParams", js.undefined)
  }
}
