package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDisplayname extends StObject {
  
  var parameters: QueryDisplayname
  
  var responses: `200Content80`
}
object ParametersQueryDisplayname {
  
  inline def apply(parameters: QueryDisplayname, responses: `200Content80`): ParametersQueryDisplayname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDisplayname]
  }
  
  extension [Self <: ParametersQueryDisplayname](x: Self) {
    
    inline def setParameters(value: QueryDisplayname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content80`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
