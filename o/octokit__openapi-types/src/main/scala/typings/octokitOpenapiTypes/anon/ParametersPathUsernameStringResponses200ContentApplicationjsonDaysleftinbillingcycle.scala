package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses200ContentApplicationjsonDaysleftinbillingcycle extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `200ContentApplicationjsonDaysleftinbillingcycle`
}
object ParametersPathUsernameStringResponses200ContentApplicationjsonDaysleftinbillingcycle {
  
  inline def apply(parameters: PathUsernameString, responses: `200ContentApplicationjsonDaysleftinbillingcycle`): ParametersPathUsernameStringResponses200ContentApplicationjsonDaysleftinbillingcycle = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses200ContentApplicationjsonDaysleftinbillingcycle]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses200ContentApplicationjsonDaysleftinbillingcycle](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDaysleftinbillingcycle`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
