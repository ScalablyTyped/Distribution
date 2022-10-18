package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQueryPackagetype extends StObject {
  
  var parameters: PathUsernameStringQueryPackagetype
  
  var responses: `200401403`
}
object ParametersPathUsernameStringQueryPackagetype {
  
  inline def apply(parameters: PathUsernameStringQueryPackagetype, responses: `200401403`): ParametersPathUsernameStringQueryPackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQueryPackagetype]
  }
  
  extension [Self <: ParametersPathUsernameStringQueryPackagetype](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
