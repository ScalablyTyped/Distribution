package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersResponses extends StObject {
  
  var parameters: PathCodeString
  
  var responses: `201`
}
object ParametersResponses {
  
  inline def apply(parameters: PathCodeString, responses: `201`): ParametersResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponses]
  }
  
  extension [Self <: ParametersResponses](x: Self) {
    
    inline def setParameters(value: PathCodeString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
