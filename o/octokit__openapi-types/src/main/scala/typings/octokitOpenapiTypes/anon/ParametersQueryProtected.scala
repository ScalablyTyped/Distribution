package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryProtected extends StObject {
  
  var parameters: QueryProtected
  
  var responses: `200Content171`
}
object ParametersQueryProtected {
  
  inline def apply(parameters: QueryProtected, responses: `200Content171`): ParametersQueryProtected = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryProtected]
  }
  
  extension [Self <: ParametersQueryProtected](x: Self) {
    
    inline def setParameters(value: QueryProtected): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content171`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
