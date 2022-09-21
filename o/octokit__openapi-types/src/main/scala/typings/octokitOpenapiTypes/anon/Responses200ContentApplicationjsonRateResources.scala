package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRateResources extends StObject {
  
  var responses: `200ContentApplicationjsonRateResources`
}
object Responses200ContentApplicationjsonRateResources {
  
  inline def apply(responses: `200ContentApplicationjsonRateResources`): Responses200ContentApplicationjsonRateResources = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRateResources]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRateResources](x: Self) {
    
    inline def setResponses(value: `200ContentApplicationjsonRateResources`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
