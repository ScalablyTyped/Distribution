package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonPreferencesRepository extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonAutotriggerchecks
  
  var responses: `200ContentApplicationjsonPreferencesRepository`
}
object Responses200ContentApplicationjsonPreferencesRepository {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonAutotriggerchecks,
    responses: `200ContentApplicationjsonPreferencesRepository`
  ): Responses200ContentApplicationjsonPreferencesRepository = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonPreferencesRepository]
  }
  
  extension [Self <: Responses200ContentApplicationjsonPreferencesRepository](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutotriggerchecks): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonPreferencesRepository`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
