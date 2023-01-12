package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAuthorassociationBodyHeadersLocation extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var requestBody: ContentApplicationjsonLine
  
  var responses: `201ContentApplicationjsonAuthorassociationBodyHeadersLocation`
}
object Responses201ContentApplicationjsonAuthorassociationBodyHeadersLocation {
  
  inline def apply(
    parameters: PathCommitshaOwner,
    requestBody: ContentApplicationjsonLine,
    responses: `201ContentApplicationjsonAuthorassociationBodyHeadersLocation`
  ): Responses201ContentApplicationjsonAuthorassociationBodyHeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAuthorassociationBodyHeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonAuthorassociationBodyHeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLine): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAuthorassociationBodyHeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
