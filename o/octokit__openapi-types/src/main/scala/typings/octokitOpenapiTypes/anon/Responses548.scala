package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses548 extends StObject {
  
  var parameters: PathMilestonenumberOwner
  
  var requestBody: ContentApplicationjsonDescriptionDueon
  
  var responses: `548`
}
object Responses548 {
  
  inline def apply(
    parameters: PathMilestonenumberOwner,
    requestBody: ContentApplicationjsonDescriptionDueon,
    responses: `548`
  ): Responses548 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses548]
  }
  
  extension [Self <: Responses548](x: Self) {
    
    inline def setParameters(value: PathMilestonenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `548`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
