package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMarketplacependingchange extends StObject {
  
  var parameters: PathAccountidNumber
  
  var responses: `200ContentApplicationjsonMarketplacependingchange`
}
object Responses200ContentApplicationjsonMarketplacependingchange {
  
  inline def apply(parameters: PathAccountidNumber, responses: `200ContentApplicationjsonMarketplacependingchange`): Responses200ContentApplicationjsonMarketplacependingchange = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMarketplacependingchange]
  }
  
  extension [Self <: Responses200ContentApplicationjsonMarketplacependingchange](x: Self) {
    
    inline def setParameters(value: PathAccountidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMarketplacependingchange`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
