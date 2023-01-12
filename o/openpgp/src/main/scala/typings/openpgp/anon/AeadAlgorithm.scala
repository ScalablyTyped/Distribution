package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AeadAlgorithm extends StObject {
  
  var aeadAlgorithm: String
  
  var algorithm: String
  
  var data: js.typedarray.Uint8Array
}
object AeadAlgorithm {
  
  inline def apply(aeadAlgorithm: String, algorithm: String, data: js.typedarray.Uint8Array): AeadAlgorithm = {
    val __obj = js.Dynamic.literal(aeadAlgorithm = aeadAlgorithm.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AeadAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AeadAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setAeadAlgorithm(value: String): Self = StObject.set(x, "aeadAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
