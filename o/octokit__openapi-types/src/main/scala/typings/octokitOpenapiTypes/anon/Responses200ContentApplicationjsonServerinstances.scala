package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonServerinstances extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `200ContentApplicationjsonServerinstances`
}
object Responses200ContentApplicationjsonServerinstances {
  
  inline def apply(parameters: PathEnterpriseString, responses: `200ContentApplicationjsonServerinstances`): Responses200ContentApplicationjsonServerinstances = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonServerinstances]
  }
  
  extension [Self <: Responses200ContentApplicationjsonServerinstances](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonServerinstances`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
