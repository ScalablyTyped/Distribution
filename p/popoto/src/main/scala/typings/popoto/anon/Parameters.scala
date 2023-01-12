package typings.popoto.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var parameters: js.Array[Any]
  
  var statement: String
}
object Parameters {
  
  inline def apply(parameters: js.Array[Any], statement: String): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
  }
}
