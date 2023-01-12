package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositorycacheusagesTotalcount extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
}
object Responses200ContentApplicationjsonRepositorycacheusagesTotalcount {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`): Responses200ContentApplicationjsonRepositorycacheusagesTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositorycacheusagesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositorycacheusagesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositorycacheusagesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
