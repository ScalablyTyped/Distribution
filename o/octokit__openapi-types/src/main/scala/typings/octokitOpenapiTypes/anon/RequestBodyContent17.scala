package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent17 extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: Content17
}
object RequestBodyContent17 {
  
  inline def apply(parameters: PathEnterprise, requestBody: Content17): RequestBodyContent17 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent17]
  }
  
  extension [Self <: RequestBodyContent17](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content17): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
