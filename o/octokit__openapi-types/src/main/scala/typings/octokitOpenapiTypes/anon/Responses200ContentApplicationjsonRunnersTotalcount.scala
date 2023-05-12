package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var parameters: PathOrgStringQuery473
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object Responses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(parameters: PathOrgStringQuery473, responses: `200ContentApplicationjsonRunnersTotalcount`): Responses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRunnersTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRunnersTotalcount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
