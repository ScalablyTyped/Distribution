package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content36422Content346 extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var requestBody: js.UndefOr[ContentApplicationjson366] = js.undefined
  
  var responses: `403Content36422Content346`
}
object Responses403Content36422Content346 {
  
  inline def apply(parameters: PathOwnerRepoTeamid, responses: `403Content36422Content346`): Responses403Content36422Content346 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content36422Content346]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content36422Content346] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson366): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403Content36422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
