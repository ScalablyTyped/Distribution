package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200404422 extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `200404422`
}
object Responses200404422 {
  
  inline def apply(parameters: PathRepoRunnerid, requestBody: ContentApplicationjsonLabels, responses: `200404422`): Responses200404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
