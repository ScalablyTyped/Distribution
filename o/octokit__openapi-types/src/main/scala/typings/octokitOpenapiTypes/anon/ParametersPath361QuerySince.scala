package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QuerySince extends StObject {
  
  var parameters: Path361QuerySince
  
  var responses: `200Content37`
}
object ParametersPath361QuerySince {
  
  inline def apply(parameters: Path361QuerySince, responses: `200Content37`): ParametersPath361QuerySince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QuerySince]
  }
  
  extension [Self <: ParametersPath361QuerySince](x: Self) {
    
    inline def setParameters(value: Path361QuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content37`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
