package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409Content55 extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories
  
  var responses: `409Content55`
}
object Responses409Content55 {
  
  inline def apply(
    parameters: PathOrgString,
    requestBody: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories,
    responses: `409Content55`
  ): Responses409Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409Content55]
  }
  
  extension [Self <: Responses409Content55](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
