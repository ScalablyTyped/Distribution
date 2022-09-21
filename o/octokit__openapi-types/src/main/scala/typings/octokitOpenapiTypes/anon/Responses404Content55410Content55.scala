package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content55410Content55 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: Content275
  
  var responses: `404Content55410Content55`
}
object Responses404Content55410Content55 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: Content275,
    responses: `404Content55410Content55`
  ): Responses404Content55410Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content55410Content55]
  }
  
  extension [Self <: Responses404Content55410Content55](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content275): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55410Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
