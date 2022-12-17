package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters extends StObject {
  
  var parameters: Query407
  
  var responses: `200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters`
}
object Responses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters {
  
  inline def apply(
    parameters: Query407,
    responses: `200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters`
  ): Responses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters](x: Self) {
    
    inline def setParameters(value: Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
