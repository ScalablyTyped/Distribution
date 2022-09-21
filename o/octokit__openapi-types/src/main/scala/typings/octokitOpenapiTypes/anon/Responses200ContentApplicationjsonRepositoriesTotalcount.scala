package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesTotalcount extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `200ContentApplicationjsonRepositoriesTotalcount`
}
object Responses200ContentApplicationjsonRepositoriesTotalcount {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `200ContentApplicationjsonRepositoriesTotalcount`): Responses200ContentApplicationjsonRepositoriesTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoriesTotalcount](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
