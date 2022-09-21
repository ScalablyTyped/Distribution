package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters144RequestBodyContent17 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content17
}
object Parameters144RequestBodyContent17 {
  
  inline def apply(parameters: `144`, requestBody: Content17): Parameters144RequestBodyContent17 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters144RequestBodyContent17]
  }
  
  extension [Self <: Parameters144RequestBodyContent17](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content17): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
