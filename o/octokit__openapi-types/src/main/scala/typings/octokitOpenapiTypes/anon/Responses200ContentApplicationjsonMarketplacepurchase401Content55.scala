package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMarketplacepurchase401Content55 extends StObject {
  
  var parameters: PathAccountidNumber
  
  var responses: `200ContentApplicationjsonMarketplacepurchase401Content55`
}
object Responses200ContentApplicationjsonMarketplacepurchase401Content55 {
  
  inline def apply(
    parameters: PathAccountidNumber,
    responses: `200ContentApplicationjsonMarketplacepurchase401Content55`
  ): Responses200ContentApplicationjsonMarketplacepurchase401Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMarketplacepurchase401Content55]
  }
  
  extension [Self <: Responses200ContentApplicationjsonMarketplacepurchase401Content55](x: Self) {
    
    inline def setParameters(value: PathAccountidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMarketplacepurchase401Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
