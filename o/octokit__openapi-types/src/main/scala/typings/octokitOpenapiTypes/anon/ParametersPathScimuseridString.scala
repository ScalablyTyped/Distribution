package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathScimuseridString extends StObject {
  
  var parameters: PathScimuseridString
  
  var responses: `200ContentApplicationscimjsonActiveDisplayName`
}
object ParametersPathScimuseridString {
  
  inline def apply(parameters: PathScimuseridString, responses: `200ContentApplicationscimjsonActiveDisplayName`): ParametersPathScimuseridString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathScimuseridString]
  }
  
  extension [Self <: ParametersPathScimuseridString](x: Self) {
    
    inline def setParameters(value: PathScimuseridString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationscimjsonActiveDisplayName`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
