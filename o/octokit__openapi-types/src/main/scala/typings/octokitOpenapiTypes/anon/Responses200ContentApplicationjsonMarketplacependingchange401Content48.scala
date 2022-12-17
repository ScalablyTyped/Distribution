package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMarketplacependingchange401Content48 extends StObject {
  
  var parameters: PathAccountidNumber
  
  var responses: `200ContentApplicationjsonMarketplacependingchange401Content48`
}
object Responses200ContentApplicationjsonMarketplacependingchange401Content48 {
  
  inline def apply(
    parameters: PathAccountidNumber,
    responses: `200ContentApplicationjsonMarketplacependingchange401Content48`
  ): Responses200ContentApplicationjsonMarketplacependingchange401Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMarketplacependingchange401Content48]
  }
  
  extension [Self <: Responses200ContentApplicationjsonMarketplacependingchange401Content48](x: Self) {
    
    inline def setParameters(value: PathAccountidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMarketplacependingchange401Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
