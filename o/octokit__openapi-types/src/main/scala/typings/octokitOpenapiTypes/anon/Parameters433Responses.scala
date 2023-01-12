package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters433Responses extends StObject {
  
  var parameters: `433`
}
object Parameters433Responses {
  
  inline def apply(parameters: `433`): Parameters433Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters433Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters433Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
