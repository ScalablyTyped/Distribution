package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonIncludedminutes extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `200ContentApplicationjsonIncludedminutes`
}
object Responses200ContentApplicationjsonIncludedminutes {
  
  inline def apply(parameters: PathEnterpriseString, responses: `200ContentApplicationjsonIncludedminutes`): Responses200ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonIncludedminutes]
  }
  
  extension [Self <: Responses200ContentApplicationjsonIncludedminutes](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedminutes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
