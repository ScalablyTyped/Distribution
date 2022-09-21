package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationscimjsonActiveDisplayName extends StObject {
  
  var parameters: PathScimuseridString
  
  var requestBody: ContentApplicationjsonUserName
  
  var responses: `200ContentApplicationscimjsonActiveDisplayName`
}
object Responses200ContentApplicationscimjsonActiveDisplayName {
  
  inline def apply(
    parameters: PathScimuseridString,
    requestBody: ContentApplicationjsonUserName,
    responses: `200ContentApplicationscimjsonActiveDisplayName`
  ): Responses200ContentApplicationscimjsonActiveDisplayName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationscimjsonActiveDisplayName]
  }
  
  extension [Self <: Responses200ContentApplicationscimjsonActiveDisplayName](x: Self) {
    
    inline def setParameters(value: PathScimuseridString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUserName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationscimjsonActiveDisplayName`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
