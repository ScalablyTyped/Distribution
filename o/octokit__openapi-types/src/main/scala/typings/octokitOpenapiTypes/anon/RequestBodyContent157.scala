package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent157 extends StObject {
  
  var parameters: `154`
  
  var requestBody: Content157
}
object RequestBodyContent157 {
  
  inline def apply(parameters: `154`, requestBody: Content157): RequestBodyContent157 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent157]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent157] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `154`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content157): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
