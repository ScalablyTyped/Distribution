package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAppidCheckname extends StObject {
  
  var parameters: QueryAppidCheckname
  
  var responses: `200ContentApplicationjsonCheckruns`
}
object ParametersQueryAppidCheckname {
  
  inline def apply(parameters: QueryAppidCheckname, responses: `200ContentApplicationjsonCheckruns`): ParametersQueryAppidCheckname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAppidCheckname]
  }
  
  extension [Self <: ParametersQueryAppidCheckname](x: Self) {
    
    inline def setParameters(value: QueryAppidCheckname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
