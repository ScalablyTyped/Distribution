package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent178 extends StObject {
  
  var parameters: `165`
  
  var requestBody: Content178
}
object RequestBodyContent178 {
  
  inline def apply(parameters: `165`, requestBody: Content178): RequestBodyContent178 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent178]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent178] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content178): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
