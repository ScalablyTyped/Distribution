package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCheckname extends StObject {
  
  var parameters: QueryCheckname
  
  var responses: `200ContentApplicationjsonCheckruns`
}
object ParametersQueryCheckname {
  
  inline def apply(parameters: QueryCheckname, responses: `200ContentApplicationjsonCheckruns`): ParametersQueryCheckname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCheckname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryCheckname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryCheckname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
