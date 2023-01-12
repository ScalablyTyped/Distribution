package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBaseroleCreatedat extends StObject {
  
  var parameters: PathOrgRoleid
  
  var requestBody: ContentApplicationjsonBaseroleDescription
  
  var responses: `200ContentApplicationjsonBaseroleCreatedat`
}
object Responses200ContentApplicationjsonBaseroleCreatedat {
  
  inline def apply(
    parameters: PathOrgRoleid,
    requestBody: ContentApplicationjsonBaseroleDescription,
    responses: `200ContentApplicationjsonBaseroleCreatedat`
  ): Responses200ContentApplicationjsonBaseroleCreatedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBaseroleCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBaseroleCreatedat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRoleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseroleDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBaseroleCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
