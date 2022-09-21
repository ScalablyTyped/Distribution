package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPackagename extends StObject {
  
  var parameters: PathOrgPackagename
  
  var responses: `200ContentApplicationjsonVersioncount`
}
object ParametersPathOrgPackagename {
  
  inline def apply(parameters: PathOrgPackagename, responses: `200ContentApplicationjsonVersioncount`): ParametersPathOrgPackagename = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPackagename]
  }
  
  extension [Self <: ParametersPathOrgPackagename](x: Self) {
    
    inline def setParameters(value: PathOrgPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVersioncount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
