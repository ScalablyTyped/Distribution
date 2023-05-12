package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmOid extends StObject {
  
  var algorithmOid: String
  
  var parameters: Any
}
object AlgorithmOid {
  
  inline def apply(algorithmOid: String, parameters: Any): AlgorithmOid = {
    val __obj = js.Dynamic.literal(algorithmOid = algorithmOid.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmOid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgorithmOid] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmOid(value: String): Self = StObject.set(x, "algorithmOid", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
