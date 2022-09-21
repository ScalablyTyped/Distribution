package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRequestBodyContent17 extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: Content17
}
object ParametersPathOrgRequestBodyContent17 {
  
  inline def apply(parameters: PathOrg, requestBody: Content17): ParametersPathOrgRequestBodyContent17 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRequestBodyContent17]
  }
  
  extension [Self <: ParametersPathOrgRequestBodyContent17](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content17): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
