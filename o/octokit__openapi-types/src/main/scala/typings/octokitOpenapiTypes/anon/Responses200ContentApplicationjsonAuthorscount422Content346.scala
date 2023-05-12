package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAuthorscount422Content346 extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonUselfs
  
  var responses: `200ContentApplicationjsonAuthorscount422Content346`
}
object Responses200ContentApplicationjsonAuthorscount422Content346 {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonUselfs,
    responses: `200ContentApplicationjsonAuthorscount422Content346`
  ): Responses200ContentApplicationjsonAuthorscount422Content346 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAuthorscount422Content346]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAuthorscount422Content346] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUselfs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAuthorscount422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
