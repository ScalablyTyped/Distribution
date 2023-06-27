package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMarketplacependingchange401Content41 extends StObject {
  
  var parameters: PathAccountidNumber
  
  var responses: `200ContentApplicationjsonMarketplacependingchange401Content41`
}
object Responses200ContentApplicationjsonMarketplacependingchange401Content41 {
  
  inline def apply(
    parameters: PathAccountidNumber,
    responses: `200ContentApplicationjsonMarketplacependingchange401Content41`
  ): Responses200ContentApplicationjsonMarketplacependingchange401Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMarketplacependingchange401Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonMarketplacependingchange401Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAccountidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMarketplacependingchange401Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
