package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDownloadurlEncoding extends StObject {
  
  var parameters: `472`
  
  var responses: `200ContentApplicationjsonDownloadurlEncoding`
}
object Responses200ContentApplicationjsonDownloadurlEncoding {
  
  inline def apply(parameters: `472`, responses: `200ContentApplicationjsonDownloadurlEncoding`): Responses200ContentApplicationjsonDownloadurlEncoding = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDownloadurlEncoding]
  }
  
  extension [Self <: Responses200ContentApplicationjsonDownloadurlEncoding](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDownloadurlEncoding`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
