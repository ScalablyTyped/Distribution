package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery83 extends StObject {
  
  var parameters: Query83
  
  var responses: `84`
}
object ParametersQuery83 {
  
  inline def apply(parameters: Query83, responses: `84`): ParametersQuery83 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery83]
  }
  
  extension [Self <: ParametersQuery83](x: Self) {
    
    inline def setParameters(value: Query83): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `84`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
