package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagename extends StObject {
  
  var parameters: PathPackagename
  
  var responses: `200Content104`
}
object ParametersPathPackagename {
  
  inline def apply(parameters: PathPackagename, responses: `200Content104`): ParametersPathPackagename = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagename]
  }
  
  extension [Self <: ParametersPathPackagename](x: Self) {
    
    inline def setParameters(value: PathPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content104`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
