package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent152 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content152
}
object RequestBodyContent152 {
  
  inline def apply(parameters: `141`, requestBody: Content152): RequestBodyContent152 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent152]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent152] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content152): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
