package typings.openpgp.anon

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithm extends StObject {
  
  var algorithm: String
  
  var data: Uint8Array
}
object Algorithm {
  
  inline def apply(algorithm: String, data: Uint8Array): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  
  extension [Self <: Algorithm](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
