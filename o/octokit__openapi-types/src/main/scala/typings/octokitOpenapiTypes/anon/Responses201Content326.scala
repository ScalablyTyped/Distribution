package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content326 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonBaseroleDescription
  
  var responses: `201Content326`
}
object Responses201Content326 {
  
  inline def apply(
    parameters: `303`,
    requestBody: ContentApplicationjsonBaseroleDescription,
    responses: `201Content326`
  ): Responses201Content326 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content326]
  }
  
  extension [Self <: Responses201Content326](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseroleDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content326`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
