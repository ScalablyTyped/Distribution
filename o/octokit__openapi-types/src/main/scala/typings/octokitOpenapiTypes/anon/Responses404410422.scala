package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404410422 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `404410422`
}
object Responses404410422 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjsonBody, responses: `404410422`): Responses404410422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404410422]
  }
  
  extension [Self <: Responses404410422](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
