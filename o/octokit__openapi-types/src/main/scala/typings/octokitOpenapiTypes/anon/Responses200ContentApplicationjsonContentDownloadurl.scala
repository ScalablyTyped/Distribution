package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonContentDownloadurl extends StObject {
  
  var parameters: `76`
  
  var responses: `200ContentApplicationjsonContentDownloadurl`
}
object Responses200ContentApplicationjsonContentDownloadurl {
  
  inline def apply(parameters: `76`, responses: `200ContentApplicationjsonContentDownloadurl`): Responses200ContentApplicationjsonContentDownloadurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonContentDownloadurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonContentDownloadurl](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContentDownloadurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
