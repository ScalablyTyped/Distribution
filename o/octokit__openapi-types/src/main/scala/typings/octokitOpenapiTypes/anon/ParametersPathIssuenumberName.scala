package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberName extends StObject {
  
  var parameters: PathIssuenumberName
  
  var responses: `200148`
}
object ParametersPathIssuenumberName {
  
  inline def apply(parameters: PathIssuenumberName, responses: `200148`): ParametersPathIssuenumberName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberName]
  }
  
  extension [Self <: ParametersPathIssuenumberName](x: Self) {
    
    inline def setParameters(value: PathIssuenumberName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200148`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
